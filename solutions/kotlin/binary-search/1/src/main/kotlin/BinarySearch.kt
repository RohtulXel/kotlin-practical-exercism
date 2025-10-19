object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        if (list.size == 0) throw NoSuchElementException()
        var start = 0
        var end = list.size - 1
        while(start<end) {
            val mid = (start + end)/2
            if (list.get(mid) >= item)
                end = mid
            else
                start = mid + 1
        }

        return if(list.get(start) == item) start else throw NoSuchElementException()
    }
}
