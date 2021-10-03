class WordEntry(var word:String,private var numAppearances:Int,private var totalScore:Int) {

    constructor():this("",0,0)
    constructor(word:String):this(word,0,0)
    constructor(word: String, initialScore:Int) : this(word,1,initialScore)

    fun addNewAppearance(score:Int){
        totalScore += score
        numAppearances++
    }
    fun getAverage():Double{
        return (totalScore/numAppearances).toDouble()
    }

}
