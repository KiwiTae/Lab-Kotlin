/*
Read about different string literals and string templates in Kotlin.

Raw strings are useful for writing regex patterns, you don't need to escape a backslash by a backslash.
Below there is a pattern that matches a date in format 13.06.1992 (two digits, a dot, two digits, a dot, four digits):

fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""
Using month variable rewrite this pattern in such a way that it matches the date in format 13 JUN 1992
 (two digits, a whitespace, a month abbreviation, a whitespace, four digits).
 */

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} ${month} \d{4}"""