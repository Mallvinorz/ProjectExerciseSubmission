package id.infinitelearning.KotlinSubmission.exercise4


import java.lang.IndexOutOfBoundsException


fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val number = arrayOf(23, 45, 79, 83, 97, 103)
        number[9]
    } catch (e: IndexOutOfBoundsException){
        println(e)
    } finally {
        println("Ini yang dijalankan!")
    }

}