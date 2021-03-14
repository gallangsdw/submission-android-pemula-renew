package com.sdwtech.sadewacoffee.data

import android.net.Uri

object DataFood {
    fun getDataFood(): List<Food> {
        val listFood = mutableListOf<Food>()

        listFood.add(
                Food(
                        "Cappuccino",
                        "Rp. 25.000",
                        "cappuccino memiliki cita rasa yang creamy dan foamy (memiliki cita rasa seperti berbusa). Dengan busa susu yang lebih tebal, cappuccino akan terasa memenuhi mulut kalian saat diminum, dan perlahan, busa susu cappuccino yang tercampur dengan susu dan ekstrak kopi tersebut akan megnhilang.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/capucino")}"
                )
        )
        listFood.add(
                Food(
                        "Coffee Latte",
                        "Rp. 23.000",
                        "Dengan komposisi susu yang lebih banyak dan busa susu yang tipis, caffe latte akan memiliki cita rasa yang cenderung milky. Komposisi susu yang lebih banyak pada caffe latte akan membuat cita rasa ekstrak kopi yang cenderung pahit tersamarkan.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/latte")}"
                )
        )
        listFood.add(
                Food(
                        "Robusta Espresso",
                        "Rp. 18.000",
                        "Diolah dengan proses espresso melalui suhu yang konsisten, proses tekanan air, dan waktu ekstraksi yang sebentar maka akan menghasilkan robusta espresso yang mempunyai karakteristik rasa pahit yang kuat dan biasanya rasa pahit itulah yang menjadi lebih pekat.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/robusta_espreso")}"
                )
        )
        listFood.add(
                Food(
                        "Hot Chocolate",
                        "Rp. 20.000",
                        "Cokelat panas yang diracik dari bahan utama susu dan cokelat. Teksturnya kental creamy sehingga meminum hot chocolate juga membuat perut kenyang dengan rasanya yang memuaskan. Mengonsumsi hot chocolate juga memiliki banyak manfaat. Salah satunya memasok cukup energi hingga beraktifitas.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/chocolate")}"
                )
        )
        listFood.add(
                Food(
                        "Choco Marshmallow",
                        "Rp. 25.000",
                        "Meski terasa manis, Choco Marshmallow ini tetap sehat diminum karena bebas perisa. Selain itu, anda juga akan mendapati marshmallow empuk yang siap dikonsumsi. Sangat cocok untuk Anda yang senang minum cokelat dengan potongan marshmallow.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/choco_marshmello")}"
                )
        )
        listFood.add(
                Food(
                        "Red Velvet",
                        "Rp. 22.000",
                        "Tekstur dari red velvet memang benar-benar seperti cokelat dengan sensasi lembut serta rasa manis. Perpaduan bahan antara bubuk kakao atau ekstrak bit, buttermilk dan white vinegar sudah bisa menghasilkan cita rasa yang sempurna untuk diminum.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/redvelvet")}"
                )
        )
        listFood.add(
                Food(
                        "Blackberry Pie",
                        "Rp. 30.000",
                        "Kue pie selalu hadir dengan berbagai pilihan rasa yang khas dan nikmat untuk dimakan salah satunya adalah blackberry pie. Gabungan rasa lembut dari buah blackberry dan tekstur renyah dari kulit pie cenderung selalu pas dipadukan dengan apa saja.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/blackberry_pie")}"
                )
        )
        listFood.add(
                Food(
                        "Banitsa Bulgarian",
                        "Rp. 25.000",
                        "Yang satu ini berupa roti khas Bulgaria berbentuk lingkaran melebar. Makanan khas Bulgaria ini disajikan bersama dengan berbagai varian makanan lainnya. Banitsa biasanya dinikmati warga Bulgaria sebagai menu sarapan. Sedangkan banitsa berisi susu, biasa dimakan sebagai hidangan pencuci mulut.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/banitsa_bulgarian")}"
                )
        )
        listFood.add(
                Food(
                        "Cheese Burger",
                        "Rp.20.000",
                        "daging panggang setebal 1 cm, dengan keju cheddar lembaran, acar timun, saus sambal dan mustard. Begitu semuanya digigit bersama, hmm, ada sensasi empuk orti, gurih daging dan renyah acar timun. Acarnya yang asam menggigit membuat rasanya makin segar. Dagingnya yang dimasak hingga kering berpadu dengan keju yang leleh di mulut.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/cheese_burger")}"
                )
        )
        listFood.add(
                Food(
                        "Lava Cake",
                        "Rp. 17.000",
                        "siap-siap dibikin ketagihan dengan Choco Lava Cake yang dari penampilannya saja sudah bikin menelan ludah karena terlihat sangat enak. Dan memang benar, saat dicicipi, rasanya yang manis seperti menghipnotis lidah kamu dan bikin tidak bisa berhenti mengunyah cake spesial ini.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/lava_cake")}"
                )
        )
        listFood.add(
                Food(
                        "Red Velvet Cake",
                        "Rp. 25.000",
                        "Red Velvet Cake adalah kue bertekstur lembut dengan balutan krim yang lumer dimulut. Karena rasanya manis, enak, dan bikin ketagihan. Jika dirasakan sekilas di lidah, rasa red velvet cake mirip dengan kue Cokelat. Teksturnya tidak pekat seperti kue coklat dan ada sensasi rasa yang khas dari red velvet cake.",
                        "${Uri.parse("android.resource://com.sdwtech.sadewacoffee/drawable/redvelvet_cake")}"
                )
        )

        return listFood
    }
}