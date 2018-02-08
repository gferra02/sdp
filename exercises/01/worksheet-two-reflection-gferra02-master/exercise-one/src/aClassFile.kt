class aClassFile {

    fun aClassFun() {
        val adHoc = object {
            var x: Int = 0
            var y: Int = 0
        }
        println(adHoc.x + adHoc.y)
    }
}