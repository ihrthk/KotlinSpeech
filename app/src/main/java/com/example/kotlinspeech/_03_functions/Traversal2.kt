package com.example.kotlinspeak._03_functions


//fun main(args: Array<String>) {
//    val root = Container(
//        Text("a"),
//        Container(
//            Text("b"),
//            Container(
//                Text("c"),
//                Text("d")
//            ),
//            Text("e")
//        ),
//        Text("f")
//    )
//}
//
//sealed class Element
//class Container(vararg val children: Element) : Element()
//class Text(val text: String) : Element()
//
//fun Element.extractText(): String {
//    val sb = StringBuilder()
//    fun extractText(e: Element) {
//        when (e) {
//            is Text -> sb.append(e.text)
//            is Container -> e.children.forEach(::extractText)
//        }
//    }
//    extractText(this)
//    return sb.toString()
//}


