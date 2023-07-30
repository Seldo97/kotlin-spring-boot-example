package pl.mo.kotlin.example.kotlinexamplelibrary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinExampleLibraryApplication

fun main(args: Array<String>) {
	runApplication<KotlinExampleLibraryApplication>(*args)
}
