open class ClassA(extNo: Int = 4) {
    open var num = extNo
        get() = field
        set(value) {
            field = value
        }


}