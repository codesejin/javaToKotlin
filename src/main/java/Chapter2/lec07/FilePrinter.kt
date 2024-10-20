package Chapter2.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path: String) {
        BufferedReader(FileReader(File(path))).use { reader ->
            println(reader.readLine())
        }
    }
}