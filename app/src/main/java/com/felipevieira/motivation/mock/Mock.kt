package com.felipevieira.motivation.mock

import com.felipevieira.motivation.util.MotivationConstants
import java.util.*

class Phrase(val description: String, val category: Int)

fun Int.random(): Int = Random().nextInt(this)

class Mock {

    private val ALL = MotivationConstants.PHRASE_FILTER.ALL
    private val SUN = MotivationConstants.PHRASE_FILTER.SUN
    private val HAPPY = MotivationConstants.PHRASE_FILTER.HAPPY

    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossivel, foi la e fez", HAPPY),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", HAPPY),
        Phrase("A melhor maneira de prever o futuro é inventa-lo", SUN),
        Phrase("Você perde todas as chances que você não aproveita", SUN)
    )

    fun getPhrase(value: Int): String {

        val filtered = mListPhrases.filter { it -> (it.category == value || value == ALL) }

        val rand = (filtered.size).random()
        
        return filtered[rand].description
    }

}