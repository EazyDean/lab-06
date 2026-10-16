package com.example.lab_6

/*
 * Replication prompt - Core exercise
 *
 * Create the Lab 6 Wizard exercise in the existing Android/Kotlin project.
 *
 * Add Wizard.kt with documented name, mana, and spellPower properties.
 * Implement Explosion and Frostbite spell behavior, including mana consumption
 * and insufficient-mana handling.
 *
 * Add WizardTest.kt using JUnit 4 and @Before. Include exactly four tests
 * covering successful and unsuccessful casts of both spells. Run the tests and
 * fix the project until all four pass.
 */

/**
 * Represents a wizard character that can cast spells using mana.
 *
 * A wizard has a name, current mana, and spell power stat. The wizard needs
 * sufficient mana to cast spells, and spell power is used to calculate how
 * much damage is dealt when a valid spell is cast.
 *
 * @property name the name of the wizard
 * @property mana the current mana available for casting spells
 * @property spellPower the base power used for spell damage calculation
 */
class Wizard(
    val name: String,
    var mana: Int,
    var spellPower: Int,
) {
    /**
     * Casts a spell and returns the damage dealt.
     *
     * Supported spells:
     * - "Explosion": costs 10 mana and deals 3 x spellPower damage
     * - "Frostbite": costs 5 mana and deals 2 x spellPower damage
     *
     * If the wizard does not have enough mana or the spell name is invalid,
     * the spell fails and returns 0 without consuming mana.
     *
     * @param spell the name of the spell to cast
     * @return the integer amount of damage dealt, or 0 if the spell fails
     */
    fun castSpell(spell: String): Int {
        return when (spell) {
            "Explosion" -> {
                if (mana >= EXPLOSION_MANA_COST) {
                    mana -= EXPLOSION_MANA_COST
                    spellPower * EXPLOSION_DAMAGE_MULTIPLIER
                } else {
                    0
                }
            }

            "Frostbite" -> {
                if (mana >= FROSTBITE_MANA_COST) {
                    mana -= FROSTBITE_MANA_COST
                    spellPower * FROSTBITE_DAMAGE_MULTIPLIER
                } else {
                    0
                }
            }

            else -> 0
        }
    }

    private companion object {
        const val EXPLOSION_MANA_COST = 10
        const val EXPLOSION_DAMAGE_MULTIPLIER = 3
        const val FROSTBITE_MANA_COST = 5
        const val FROSTBITE_DAMAGE_MULTIPLIER = 2
    }
}
