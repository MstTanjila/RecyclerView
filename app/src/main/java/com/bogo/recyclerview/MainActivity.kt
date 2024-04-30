package com.bogo.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bogo.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val flower = ArrayList<Flower>()
        flower.add(
            Flower(
                "Rose",
                "This is Qween of Flower",
                R.drawable.rose,
                "Their stems are usually prickly and their glossy, green leaves have toothed edges. Rose flowers vary in size and shape. They burst with colours ranging from pastel pink, peach, and cream, to vibrant yellow, orange, and red. Many roses are fragrant, and some produce berry-like fruits called hips.No wonder roses have been referenced in literature and music for centuries. Archaeologists have discovered rose fossils dating back 35 million years. An even more amazing fact about roses is that the oldest living rose is 1,000 years old."
            )
        )
        flower.add(
            Flower(
                "Marigold",
                "This is Winter Flower",
                R.drawable.marigold,
                "Marigolds are comprised of tiny florets surrounded by many layers of delicate, ruffled petals and a thick hollow stem with fernlike leaves. The flowers have a pungent, sharp, and musky aroma that can be considered unpleasant.Marigolds are native to subtropical America and have been cultivated in Mexico for over 2,000 years. Marigold cultivars are usually sold as part of a series with similar growth characteristics and a wide range of colors. African marigolds (Tagetes erecta) have large, double flowers and bloom from midsummer to frost"
            )
        )
        flower.add(
            Flower(
                "Chaina rose",
                "This is Red Flower",
                R.drawable.chainarose,
                "Hibiscus rosa-sinensis\n" +
                        "Hibiscus rosa-sinensis, known colloquially as Chinese hibiscus, China rose, Hawaiian hibiscus, rose mallow and shoeblack plant, is a species of tropical hibiscus, a flowering plant in the Hibisceae tribe of the family Malvaceae.The early growth of China Rose stems is a very attractive reddish purple. As the stem ages it turns from purple to green then brown. The stems are covered in prickles."
            )
        )
        flower.add(
            Flower(
                "Tuberose",
                "This is White Flower",
                R.drawable.tuberose,
                "The tuberose has long bright green leaves clustered at the base and smaller clasping leaves along the stem. The fragrant waxy white flowers are borne in a cluster at the tip of the stem and bloom at night. The roots are fleshy and tuberous.Tuberose represents sensuality and is used in aromatherapy for its ability to open the heart and calm the nerves, restoring joy, peace, and harmony. Tuberose flowers have long been used in perfumery as a source of essential oils and aroma compounds. Tuberose oil is used in high-value perfumes and cosmetic products."
            )
        )
        flower.add(
            Flower(
                "Tulip",
                "This is Nice Flower",
                R.drawable.tulipe,
                "The common tulip is a bulbous perennial herb in the lily family (Liliaceae) that is native from southern Europe to central Asia. Tulips grow from 4 to 28 inches in height and bloom in middle to late spring with flowers that come in all colors except true blue.Tulips are erect flowers with long, broad, parallel-veined leaves and a cup-shaped, single or double flower at the tip of the stem. Colors of the flowers can range anywhere from red to yellow to white. Some tulips are varicolored as a result of a viral disease carried and transferred to the plants by aphids."
            )
        )
        flower.add(
            Flower(
                "Orchid",
                "This is Orchid Flower",
                R.drawable.orchid,
                "Orchid plants can measure from less than an inch (2.5 centimeters) to more than 15 feet (4.6 meters) tall. There can be a single flower or clusters. The flowers can be as small as 0.1 inch (2.5 millimeters) or as large as 15 inches (38 centimeters) across. They can be almost any color, and some have spots or streaks."
            )
        )
        var flowerAdapter = FlowerAdapter(flower)
        binding.recyclerView.adapter = FlowerAdapter(flower)
        binding.recyclerView.adapter = flowerAdapter
        flowerAdapter.onClick = {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("name", it.flowername)
            intent.putExtra("longdetails", it.flowerlongdetails)
            intent.putExtra("image", it.flowerimage)
            startActivity(intent)
        }
    }
}