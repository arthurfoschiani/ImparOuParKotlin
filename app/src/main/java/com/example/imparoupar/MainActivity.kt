package com.example.imparoupar

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.imparoupar.databinding.ActivtyMainBinding
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private var buttonSelected: String = ""
    private var numberSelected: Int = 0

    private lateinit var binding: ActivtyMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivtyMainBinding.inflate(layoutInflater)

        binding.buttonPar.setOnClickListener {
            buttonSelected = "Par"
            checkButtons()
        }

        binding.buttonImpar.setOnClickListener {
            buttonSelected = "Impar"
            checkButtons()
        }

        binding.number1.setOnClickListener {
            numberSelected = 1
            checkButtons()
        }

        binding.number2.setOnClickListener {
            numberSelected = 2
            checkButtons()
        }

        binding.number3.setOnClickListener {
            numberSelected = 3
            checkButtons()
        }

        binding.number4.setOnClickListener {
            numberSelected = 4
            checkButtons()
        }

        binding.number5.setOnClickListener {
            numberSelected = 5
            checkButtons()
        }

        setContentView(binding.root)
    }

    private fun checkButtons() {
        if (numberSelected != 0 && buttonSelected.isNotEmpty()) {
            val computerChoice: Int = Random.nextInt(5)

            binding.escolhaComputador.text = computerChoice.toString()

            val somaValores = computerChoice + numberSelected;

            if (somaValores % 2 == 0) {
                if (buttonSelected == "Par") {
                    binding.textoFeedback.text = "Vc escolheu: ${numberSelected}. A soma foi: ${somaValores}. Parabéns, vc venceu!"
                } else {
                    binding.textoFeedback.text = "Vc escolheu: ${numberSelected}. A soma foi: ${somaValores}. Desculpe, vc perdeu!"
                }
            } else {
                if (buttonSelected == "Impar") {
                    binding.textoFeedback.text = "Vc escolheu: ${numberSelected}. A soma foi: ${somaValores}. Parabéns, vc venceu!"
                } else {
                    binding.textoFeedback.text = "Vc escolheu: ${numberSelected}. A soma foi: ${somaValores}. Desculpe, vc perdeu!"
                }
            }

            buttonSelected = ""
            numberSelected = 0
        }
    }
}