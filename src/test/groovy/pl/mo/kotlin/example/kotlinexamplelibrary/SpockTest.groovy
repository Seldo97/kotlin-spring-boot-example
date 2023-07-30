package pl.mo.kotlin.example.kotlinexamplelibrary

import spock.lang.Specification

class SpockTest extends Specification {

    def "test spock conf"() {
        given:
        def a = 2 + 2

        when:
        def result = a * 2

        then:
        result == 8
    }

}
