class FreqDist(var wordTable:HashMap<String,WordEntry> = HashMap<String,WordEntry>()) {
    fun addWordEntry(word:String, score:Int){
        if(wordTable.containsKey(word)){
            val temp: WordEntry = wordTable[word]!!
            temp.addNewAppearance(score)
        } else{
            wordTable.put(word, WordEntry(word,score))
        }
    }

    fun getAverageScore(word:String):Double{
        if(wordTable.containsKey(word)){
            return(wordTable[word]!!.getAverage())
        } else {
            return 0.0
        }
    }

}