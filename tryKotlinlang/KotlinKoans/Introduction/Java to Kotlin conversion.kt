/*Java to Kotlin conversion
We have a handy tool for Java developers: Java to Kotlin converter. It works better in IntelliJ IDEA, but you can try it
online as well. To become familiar with it, please convert the code below. Copy Java code, choose 'Convert from Java'
above and copy the result function back.

 */

fun toJSON(collection:Collection<Int>):String {
    val sb = StringBuilder()
    sb.append("[")
    val iterator = collection.iterator()
    while (iterator.hasNext())
    {
        val element = iterator.next()
        sb.append(element)
        if (iterator.hasNext())
        {
            sb.append(", ")
        }
    }
    sb.append("]")
    return sb.toString()
}