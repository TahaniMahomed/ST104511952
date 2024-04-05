package com.example.historyapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    //declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //initialise
        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextView)


        searchButton.setOnClickListener {
            //create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()


            //if age is not null and age is in the range between
            if (age != null && age in 23..70) {

                //when age is 30 display Thato else is .. and so on
                val politiciansName = when (age) {
                    46 -> "John Fitzgerald Kennedy (May 29, 1917 – November 22, 1963), often referred to as JFK, was an American politician who served as the 35th president of the United States from 1961 until his assassination in 1963. He was the youngest person elected president"
                    24 -> "Lee Harvey Oswald (October 18, 1939 – November 24, 1963) was a U.S. Marine veteran who assassinated John F. Kennedy, the 35th president of the United States, on November 22, 1963"
                    56 -> "Lincoln's legacy is based on his momentous achievements: he successfully waged a political struggle and civil war that preserved the Union, ended slavery, and created the possibility of civil and social freedom for African-Americans"
                    26 -> "John Wilkes Booth was part of a family of celebrated actors, but he is remembered as the assassin who mortally wounded U.S. Pres. Abraham Lincoln in Ford's Theatre in Washington, D.C., on April 14, 1865, as part of a broader conspiracy that included an attempt on the life of Secretary of State William H. Seward"
                    39 -> "His adoption of nonviolent resistance to achieve equal rights for Black Americans earned him the Nobel Peace Prize in 1964. King is remembered for his masterful oratorical skills, most memorably in his \"I Have a Dream\" speech."
                    70 -> "James Earl Ray (March 10, 1928 – April 23, 1998) was an American fugitive convicted of the assassination of Martin Luther King Jr. at the Lorraine Motel in Memphis, Tennessee, on April 4, 1968"
                    50 -> "Franz Ferdinand was an Archduke of Austria-Este, Austro-Hungarian and Royal Prince of Hungary and of Bohemia and, from 1896 until his death, heir presumptive to the Austro-Hungarian throne. His assassination in Sarajevo precipitated Austria-Hungary's declaration of war against Serbia."
                    23 -> " Gavrilo Princip. Princip, Gavrilo (1894 -1918) Born: Oblej. The Bosnian-Serb who shot and killed Archduke Franz Ferdinand, and set the wheels of world war in motion."
                    58 -> "William McKinley (January 29, 1843 – September 14, 1901) was an American politician who served as the 25th president of the United States from 1897 until his assassination in 1901."
                    28 -> "Leon Czolgosz was an American worker. He is known for killing the 25th President of the United States, William McKinley. Czolgosz was inspired by anarchist ideas. Anarchism is a belief that a workers' revolution should abolish the state and the capitalist class so that the working people would govern themselves."
                    else -> null

                }

                val message = if (politiciansName != null) "The employee's name is $politiciansName"
                else "No employee found with the entered age."
                resultTextView.text =message


            } else {
                resultTextView.text = "Invalid input. Please enter a valid age between 23 and 70."
            }

        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }

    }
}

