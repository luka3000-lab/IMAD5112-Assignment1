package com.example.assessment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeOfDayInput: EditText = findViewById(R.id.timeOfDayInput)
        val suggestButton: Button = findViewById(R.id.suggestButton)
        val resetButton: Button = findViewById(R.id.resetButton)
        val mealSuggestionOutput: TextView = findViewById(R.id.mealSuggestionOutput)

        suggestButton.setOnClickListener {
            val suggestions = when (timeOfDayInput.text.toString().lowercase(Locale.getDefault())) {
                "morning" -> listOf("Breakfast Sandwiches (eggs, cheese, meat on English muffins/biscuits)" , "Smoothies (fruits, yogurt, milk)" , "Avocado toast with eggs" , "Focaccia French toast with berries" , "Peanut butter banana toast" , "Hummus with vegetables" , "Sheet Pan Frittata (eggs, vegetables, cheese)" , "Breakfast Tacos (everything in one pan)" , "Egg Muffins (perfect for reheating)" , "Breakfast Burritos (eggs, cheese, vegetables)" , "Berry quinoa muffin" , "Chocolate-zucchini bran muffins" , "Baked Oatmeal" , "Breakfast Casseroles (assemble night before, bake in morning)" , "Sweet Potato Bowl (with yogurt, almond butter, granola)" , "Greek Yogurt Parfait")
                "mid-morning" -> listOf("Fruit with nuts", "Yogurt parfait", "Oatmeal with fruit", "Breakfast burrito", "Granola bars")
                "afternoon" -> listOf("Fresh fruit with nuts Toast with eggs, avocado or hummus", "Smoothie (pre-made and refrigerated)", "Tacos" , "Quick bread with spreads", "Grilled cheese sandwich with tomato soup", "BLT wrap with chips", "Chicken quesadilla", "Turkey or ham sandwich with favorite fillings", "Soup and crackers with crusty bread", "Mac and cheese with crispy bacon", "Chicken nuggets with dipping sauce", "Personal pizza", "Baked potato with cheese and bacon bits", "Chicken Caesar wrap", "Japanese-style rice bowls with teriyaki chicken", "Mexican tacos with ground beef or chicken" , "Italian paninis Korean-style", "BBQ beef bowls", "Indian-style wraps with chicken tikka", "Prepared pasta salads Chicken", "Leftover dinner portions", "Pre-cooked chicken", "Pre-made soup containers", "Chips and dip with crackers", "Popcorn with seasonings", "Trail mix with chocolate", "Fresh fruit with cheese" , "Yogurt parfait with granola and honey")
                "mid-afternoon" -> listOf("Chips and dip", "Popcorn", "Trail mix", "Fruit with cheese", "Yogurt parfait")
                "dinner" -> listOf("Samosas" , "Sosa tie Rolls", "Boerewors Rolls", "Chicken or Beef Bunny Chow Wrap",  "Cape Malay Chicken Wrap", "Durban Lamb Curry", "Cape Town Sosaties", "Cape Malay Bobotie", "Boerewors, pap and tomato curry", "Spaghetti Carbonara (Rome)", "Risotto alla Milanese (Milan)", "Pollo alla Cacciatora", "Coq au Vin (Chicken in Red Wine)", "Tournedos Rossini (Filet Mignon with Foie Gras)", "Boeuf Bourguignon (Beef Burgundy)", "Wonton Noodles (Cantonese)", "Xiaolongbao (Soup Dumplings)", "Ma Po Tofu (Sichuan)", "Sushi (Various Types)", "Ramen (Various Regions)", "Tonkatsu (Breaded Pork Cutlet)", "Yakitori (Grilled Chicken Skewers)", "Tempura", "Fried Seafood and Vegetables)", "Butter Chicken (Delhi)", "Biryani (Various Regions)", "Tandoori Chicken (Punjab)", "Palak Paneer (Spinach with Cheese)", "Vindaloo (Goan Curry)", "Paella Valenciana (Valencia)", "Gazpacho (Andalusia)" , "Fabada Asturiana (Asturian Bean Stew)", "Pollo al Ajillo (Garlic Chicken)", "New Orleans Gumbo", "Texas BBQ Brisket", "New England Clam Chowde", "Louisiana Jambalaya", "California Avocado Soup")
                "after dinner" -> listOf("Ice Cream", "Brownies", "Fruit Cake", "Mochi", "Crème Brûlée", "Mandaz", "Malva Pudding", "Picarones", "Dabo Kolo", "Alfajores", "Brigadieros", "Msemen with honey", "Tiramisu", "Beignets", "Gooey butter cake", "Key Lime Pie")
                else -> {
                    Toast.makeText(this, "Invalid time of day. Please try again.", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
            }

            val randomSuggestion = suggestions.random()
            mealSuggestionOutput.text = randomSuggestion
        }

        resetButton.setOnClickListener {
            timeOfDayInput.text.clear()
            mealSuggestionOutput.text = ""
        }
    }
}