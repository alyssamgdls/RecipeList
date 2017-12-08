package com.magdales.recipelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.support.v7.widget.Toolbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView1)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val recipe = ArrayList<Recipe>()

        recipe.add(Recipe("Prawn bruschetta with avocado aioli",
                "Made to share, this bite-size prawn and avocado aioli brushcetta is the perfect solution for easy entertaining. Best of all they only take 20 minutes to make.\n",
                R.drawable.prawn_bruschetta,
                "280g Coles Bakery Rustic Baguette\n" +
                        "1 ripe avocado, stoned, peeled, coarsely chopped\n" +
                        "1/4 cup (75g) whole-egg mayonnaise\n" +
                        "1 garlic clove, crushed\n" +
                        "1 teaspoon finely grated lemon rind\n" +
                        "1 tablespoon lemon juice\n" +
                        "200g cooked prawns, peeled leaving tails intact, deveined\n" +
                        "16 dill sprigs\n" +
                        "2 teaspoons lemon zest\n",
                "1. " +
                        "Preheat grill on medium. Trim ends from baguette and cut into sixteen 1.5cm-thick slices. Lightly spray both sides of baguette slices with olive oil spray. Place on a baking tray. Cook under grill for 1-2 mins each side or until light golden.\n" +
                        "2. " +
                        "Meanwhile, place the avocado, mayonnaise, garlic, lemon rind and lemon juice in a food processor. Process until smooth. Season.\n" +
                        "3. " +
                        "Place toasted baguette on a large serving plate. Spread evenly with avocado aioli. Top with prawns, dill sprigs and lemon zest."))

        recipe.add(Recipe("Oven-baked chive pancake with tomato salsa",
                "A quick and easy dinner cooked in one pan! We love this savoury pancake with chives, bacon and tomato salsa.\n",
                R.drawable.ovenbaked_chive,
                "25g butter\n" +
                        "1/3 cup extra virgin olive oil\n" +
                        "1 cup plain flour\n" +
                        "1½ teaspoons baking powder\n" +
                        "1 teaspoon sea salt\n" +
                        "3/4 cup milk\n" +
                        "1 egg\n" +
                        "1 tablespoon chopped fresh chives\n" +
                        "4 rashers middle bacon, trimmed, halved\n" +
                        "3 tomatoes, seeded, chopped\n" +
                        "1/2 x 330g jar whole roasted peppers, drained, chopped\n" +
                        "1/4 cup chopped fresh flat-leaf parsley leaves\n" +
                        "40g baby rocket\n" +
                        "1/3 cup plain Greek-style yoghurt, to serve\n",
                "1. " +
                        "Preheat oven to 230C/210C fan-forced. Heat butter and 1 tablespoon oil in a 25cm (base) heavy-based flameproof frying pan over medium-high heat until very hot.\n" +
                        "2. " +
                        "Meanwhile, sift the flour and baking powder into a bowl. Add salt. Season with pepper. Stir to combine. Make a well. Whisk milk, egg, chives and 2 tablespoons remaining oil together in a jug. Add to flour mixture. Whisk until smooth.\n" +
                        "3. " +
                        "Pour batter into pan. Quickly place in oven. Bake for 20 minutes or until golden.\n" +
                        "4. " +
                        "Meanwhile, heat a non-stick frying pan over medium-high heat. Cook bacon, turning, for 5 minutes or until golden and crisp.\n" +
                        "5. " +
                        "Place tomato, capsicum, parsley and remaining oil in a bowl. Season with salt and pepper. Toss to combine.\n" +
                        "6. " +
                        "Serve pancake straight from oven, topped with bacon, rocket, a little tomato salsa and yoghurt. Serve with remaining tomato salsa and yoghurt."))

        recipe.add(Recipe("Mexican bean and rice salad",
                "Corn adds sweetness and crunch to this Mexican rice salad, served as a side or a light lunch.",
                R.drawable.mexican_bean,
                "1 1/2 cups white long-grain rice\n" +
                        "420g can corn kernels, drained, rinsed\n" +
                        "400g can red kidney beans, drained, rinsed\n" +
                        "2 avocados, cut into wedges\n" +
                        "1/2 cup finely chopped fresh mint leaves\n" +
                        "2 long red chillies, finely chopped\n" +
                        "2 teaspoons finely grated lime rind\n" +
                        "2 tablespoons lime juice\n" +
                        "1/3 cup extra virgin olive oil",
                "1. " +
                        "Cook rice in a saucepan of boiling, salted water for 12 minutes or until tender. Drain well. Rinse under cold water. Drain. Cool.\n" +
                        "2. " +
                        "Place corn, beans, rice, avocado, mint, chilli, lime rind, lime juice and oil in a bowl. Season with salt and pepper. Toss to combine. Serve."))
        recipe.add(Recipe("Barramundi with grilled corn salad",
                "Light up the barbecue with this 20-minute barramundi served with grilled corn and zucchini salad.",
                R.drawable.barramundi,
                "2 corn cobs, husks and silks removed\n" +
                        "4 Coles Barramundi Portions Skin On, thawed\n" +
                        "2 tablespoons extra virgin olive oil\n" +
                        "2 zucchini, peeled into ribbons\n" +
                        "1/3 cup mint leaves\n" +
                        "2 tablespoons lemon juice\n" +
                        "1 garlic clove, crushed\n" +
                        "2 tablespoons chopped pistachios\n" +
                        "Lemon zest, to serve\n" +
                        "Lemon wedges, to serve",
                "1. " +
                        "Heat a barbecue grill or chargrill on medium. Cook the corn, turning, for 10 mins or until tender and charred. Set aside to cool slightly. Use a small serrated knife to cut down the side of the corn to release the kernels. Transfer to a bowl.\n" +
                        "2. " +
                        "Meanwhile, heat a barbecue flat plate or large frying pan on high. Coat the barramundi in half the oil. Cook for 3 mins each side or until cooked through.\n" +
                        "3. " +
                        "Add the zucchini and mint leaves to the corn in the bowl. Combine the lemon juice, garlic and remaining oil in a bowl. Divide the corn salad and barramundi among serving plates. Drizzle with the dressing. Sprinkle with lemon zest and pistachio. Season. Serve with lemon wedges."))
        recipe.add(Recipe("Vegan fig and custard tart",
                "Everyone can enjoy this magnificent vegan dessert, complete with homemade custard and a stunning arrangement of fresh figs, drizzled with maple syrup.",
                R.drawable.vegan_fig,
                "35g (1/4 cup) cornflour\n" +
                        "435ml (1 3 ⁄4 cups) Australia's Own Organic Almond Coconut Milk Blends\n" +
                        "1 vanilla bean, split, seeds scraped\n" +
                        "3 strips orange rind\n" +
                        "80ml (1/3 cup) maple syrup, plus extra, to drizzle\n" +
                        "280g (1 cup) coconut yoghurt\n" +
                        "10 fresh figs, thickly sliced\n" +
                        "Pistachios, chopped, to serve (optional)\n" +
                        "BASE\n" +
                        "75g (1/2 cup) pistachios\n" +
                        "50g glacé ginger, finely chopped\n" +
                        "180g (2 cups) rolled oats\n" +
                        "45g (1/2 cup) desiccated coconut\n" +
                        "60g (1/4 cup) solidified coconut oil\n" +
                        "2 tablespoon maple syrup\n" +
                        "Pinch of sea salt",
                "1. " +
                        "Preheat oven to 180C/160C fan forced. Lightly grease a 3.5cm-deep, 24cm (base measurement) fluted tart tin with removable base with coconut oil.\n" +
                        "2. " +
                        "For the base, process pistachios, ginger and 1 cup oats in a food processor until finely chopped. Add coconut, oil, maple syrup, salt and remaining oats. Process until a sticky mixture forms. Press into base and side of prepared tin and smooth the surface. Bake for 20 minutes or until golden and crisp. Set aside to cool completely.\n" +
                        "3. " +
                        "Meanwhile, place cornflour in a bowl. Slowly whisk in 1/2 cup milk until smooth and combined. Whisk in remaining milk. Pour into a small saucepan. Stir in vanilla seeds and pod, rind and maple syrup. Cook over medium-low heat, stirring constantly, for 6 minutes or until mixture boils and thickens. Transfer to a heatproof bowl. Set aside, stirring occasionally, for 30 minutes to cool. Discard vanilla pod and rind. Cover and place in the fridge for 1 hour or until chilled.\n" +
                        "4. " +
                        "Use a balloon whisk to whisk the custard until smooth. Add the yoghurt. Whisk until combined. Spread over the oat base. Place in the fridge for 3 hours or until just firm. Arrange figs on top, drizzle with extra maple syrup and sprinkle with chopped pistachio, if using."))
        var adapter = CustomAdapter(recipe)
        rv.adapter = adapter
    }
}