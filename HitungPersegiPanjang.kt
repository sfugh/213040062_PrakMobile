class PersegiPanjang(private val panjang: Double, private val lebar: Double) { //Membuat kelas PersegiPanjang
    fun hitungLuas(): Double {
        return panjang * lebar
    }

    fun hitungKeliling(): Double { //Fungsi hitung keliling persegi
        return 2 * (panjang + lebar)
    }
}

fun main(args: Array<String>) { //Fungsi memasukkan nilai
    if (args.size < 2) {
        println("Gunakan format: <panjang> <lebar>") //Tampilan pesan format
        return
    }

    val panjang = args[0].toDoubleOrNull()
    val lebar = args[1].toDoubleOrNull()

    if (panjang == null || lebar == null) { //Fungsi jika nilai tidak dimasukkan
        println("Harap masukkan angka yang valid.") //Tampilan pesan null
        return
    }

    val persegiPanjang = PersegiPanjang(panjang, lebar) //
    println("Panjang: $panjang") //Fungsi hasil
    println("Lebar: $lebar") //Fungsi hitung lebar
    println("Luas: ${persegiPanjang.hitungLuas()}") //Fungsi hitung luas
    println("Keliling: ${persegiPanjang.hitungKeliling()}") //Fungsi hitung keliling
}
