class IndeksNilaiMatkul(private val nilaiAkhir: Int) { //Membuat kelas indeks

    fun hitungIndeks(): String { //Fungsi menghitung kategori
        return when {
            nilaiAkhir in 80..100 -> "A" //nilai A
            nilaiAkhir in 70..79 -> "AB" //nilai AB
            nilaiAkhir in 60..69 -> "B" //nilai B
            nilaiAkhir in 50..59 -> "BC" //nilai BC
            nilaiAkhir in 40..49 -> "C" //nilai C
            nilaiAkhir in 30..39 -> "D" //nilai D
            nilaiAkhir in 0..29 -> "E" //nilai E
            else -> "Nilai tidak valid" //nilai null
        }
    }
}

fun main(args: Array<String>) { //Fungsi memasukkan nilai
    if (args.isEmpty()) { //jika nilai kosong
        println("Harap masukkan nilai akhir sebagai argument program!") //memunculkan pesan
        return
    }

    val nilaiAkhir = args[0].toIntOrNull() //Fungsi jika nilai tidak dimasukkan
    if (nilaiAkhir == null || nilaiAkhir < 0 || nilaiAkhir > 100) { //skala nilai
        println("Nilai harus berupa angka antara 0 hingga 100.") //menampilkan pesan
        return
    }

    val indeksNilai = IndeksNilaiMatkul(nilaiAkhir) //Fungsi hitung nilai akhir
    println("Nilai Akhir: $nilaiAkhir") //hasil
    println("Indeks: ${indeksNilai.hitungIndeks()}") //Fungsi hitung indeks akhir
}
