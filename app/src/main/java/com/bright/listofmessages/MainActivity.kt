package com.bright.listofmessages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bright.listofmessages.ui.theme.ListOfMessagesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListOfMessagesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProgramList(
                        listOf(
                            MiuProgram("Bachelor of Applied Arts & Sciences", "Gain a deep understanding of consciousness—through knowledge and experience—and how it enhances and connects different academic disciplines. You’ll take courses available only at MIU including “Transcendental Meditation” and “Physiology is Consciousness.” You’ll also have a selection of special elective courses in the humanities, social sciences, and business."),
                            MiuProgram("BA in Cinematic Arts & New Media", "You’ll learn more than just the technical side of media production. We’ll teach you how to understand your unique creative process and create work that’s truly one-of-a-kind. Our classes are project-based and focused on building your portfolio. By choosing the projects, classes, and topics you’re passionate about, you can create exactly the degree you need to pursue the career of your choice."),
                            MiuProgram("Bachelor’s Specialization in Cinematic Arts & New Media", "Our classes are project-based and focused on building your portfolio. By choosing the projects, classes, and topics you’re passionate about, you can create exactly the path you need to pursue the career of your choice. By the time you graduate, you’ll have an impressive portfolio and know exactly what it takes to succeed in a media career."),
                            MiuProgram("David Lynch Graduate School of Cinematic Arts", "At the innovative David Lynch MFA in Screenwriting, you’ll have the opportunity to learn the Transcendental Meditation (TM) technique while acquiring the knowledge you need to become a professional screenwriter. The practice of TM will help you grow personally while you sharpen your writing skills and gain access to deeper levels of your creativity, discovering how — as David Lynch says — to catch the big fish."),
                            MiuProgram("Computer Science", "Today’s society is increasingly information-based. Fundamental knowledge of how computers and computing systems work is a vital part of modern life and a universal skill that can be applied to a variety of careers and fields. Our computer science program will prepare you for success by providing comprehensive knowledge of the discipline and by teaching you how to think clearly, precisely, and creatively."),
                            MiuProgram("BA in Consciousness & Human Potential", "The BA in Consciousness & Human Potential integrates personal experience, philosophy of mind, neuroscience, and ancient wisdom. Our goal for every student is enlightenment — the systematic development of full potential from within. This is the key to true fulfillment in daily life and any career."),
                            MiuProgram("BA in Art, Consciousness, & Creative Practice", "In our block system you’ll study one full-time course per month, giving you the time you need to dive deeply into each subject. You’ll be immersed in each studio class without the stress of juggling multiple courses and assignments."),
                            MiuProgram("MA in Studio Art", "In our unique MA in Art, you’ll enjoy an intensive, two-semester exploration into studio practice while cultivating a deep connection to yourself through the Transcendental Meditation technique. In this creative environment, supported by expert faculty, peers, and prominent guest artists, you’ll create a sustainable studio practice — the best foundation for entering an MFA program or a career in art."),
                            MiuProgram("MFA in Visual Art", "Establish your voice as an artist through interactive studio practice, online seminar courses, and dialogue with faculty, peers, and visiting artists."),
                            MiuProgram("Pre-Professional Art Therapy", "As the saying goes, you need to help yourself before you can help others—tapping into the source of your own creativity will provide the basis for your study of art therapy. You’ll gain experience in a wide range of artistic media and approaches, including drawing, painting, and sculpture."),
                            MiuProgram("PhD in Maharishi Vedic Science", "Maharishi Vedic Science is the study of the unbounded, infinite field of consciousness lying at the basis of phenomenal existence and located within everyone as their own innermost Self. During the doctoral program, students will explore this field of intelligence both experientially – through daily practice of the Transcendental Meditation® technique and the TM-Sidhi® program – and by intellectual inquiry in classroom studies of the most advanced, most profound topics of Maharishi Vedic Science."),
                            MiuProgram("MA in Enlightenment and Leadership", "We face major challenges today — in the areas of global health, climate change, social justice, food insecurity, divisions within and between countries, and more. Increasing numbers of young people are becoming involved and committed to meaningful change to solve problems in these areas. Even so, more is needed to address the challenges – new approaches to problem-solving, with new and effective leadership to implement them."),
                            MiuProgram("BA in Ayurveda Wellness & Integrative Health", "We teach the Maharishi AyurVedaSM health system – the modern, scientific revival of complete Ayurveda. Maharishi AyurVeda includes balancing the deepest value of mind – consciousness, which is the basis of balancing the body. It incorporates all aspects of mind, body, behavior, and environment in a scientific framework."),
                            MiuProgram("MS in Maharishi AyurVeda & Integrative Medicine", "You’ll study the Maharishi AyurVedaSM health system, which addresses the body, mind, and environment of an individual to help them become holistically healthy. Vata, pitta, and kapha doshas. Our programs integrate natural techniques with modern medicine to take an integrated and balanced approach to wellness. You’ll study a variety of modalities."),
                            MiuProgram("BA in Creative Writing", "Our program is founded on the idea that creativity is not meant to be a struggle, but instead a fun and rewarding process. At MIU, you’ll take only one full-time class a month, giving you the opportunity to fully immerse yourself in the knowledge without the stress of balancing multiple courses and exams."),
                            MiuProgram("Individualized Major", "With our Individualized Major, you’ll mold classes from our existing programs along with internship options into a one-of-a-kind degree that fulfills your own personal vision."),
                            MiuProgram("BS in Mathematics", "From the architecture of a skyscraper to the spiral of a seashell, everything around us follows mathematical laws. In our undergraduate program, you’ll connect mathematics in a meaningful way to your own life. You’ll see how each topic connects to your deepest self while growing as a mathematician and a person."),
                            MiuProgram("BA in Business Administration", "Consciousness-based business courses at MIU provide the education you need to help transform society through sustainable and socially responsible business. Taking business courses can be beneficial to the career of any student in any major."),
                            MiuProgram("English as a Second Language", "The program follows the innovative and effective Focal Skills Approach to English Language Acquisition. The Focal Skills Approach allows language skills to build on one another naturally in a series of sequenced learning modules."),
                            MiuProgram("MS in Physics", "The graduate program in physics emphasizes the relationship between consciousness and the physical universe, with a focus on the achievements and outstanding problems in advanced physics."),
                            MiuProgram("BA in Sustainable & Regenerative Living", "All things are interconnected. We live within a web of life that includes all aspects of life, and you cannot “fix” just one isolated crisis without considering the whole. In this program you’ll study the interrelated fields of ecology & earth-systems, eco-justice, sustainable economics and community-scale technologies.")
                        )
                    )
                }
            }
        }
    }
}

/**
 * Composable function that displays a list of MIU programs.
 *
 * @param miuPrograms A list of MiuProgram objects to display.
 */
@Composable
fun ProgramList(miuPrograms: List<MiuProgram>) {
    LazyColumn {
        items(miuPrograms) { program ->
            ProgramCard(program)
        }
    }
}


/**
 * Composable function that displays the details of a single MIU program in a card format.
 *
 * @param miuProgram An instance of MiuProgram containing the program name and description.
 */
@Composable
fun ProgramCard(miuProgram: MiuProgram) {
    Spacer(modifier = Modifier.height(8.dp))

    Row {
        Spacer(modifier = Modifier.width(6.dp))

        Image(
            painter = painterResource(id = R.drawable.program),
            contentDescription = "Program Image",
            modifier = Modifier
                .clip(CircleShape)
                .size(70.dp)
                .border(width = 2.dp, shape = CircleShape, color = Color.LightGray)
        )

        Spacer(modifier = Modifier.width(6.dp))

        // Create a mutable state variable that triggers UI updates when its value changes
        var isExpanded by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier.clickable { isExpanded = !isExpanded }
        ) {
            Text(
                text = miuProgram.programName,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleSmall
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = miuProgram.programDescription,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = if (isExpanded) Int.MAX_VALUE else 1
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProgramPreview() {
    ListOfMessagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ProgramList(
                listOf(
                    MiuProgram("Bachelor of Applied Arts & Sciences", "Gain a deep understanding of consciousness—through knowledge and experience—and how it enhances and connects different academic disciplines. You’ll take courses available only at MIU including “Transcendental Meditation” and “Physiology is Consciousness.” You’ll also have a selection of special elective courses in the humanities, social sciences, and business."),
                    MiuProgram("BA in Cinematic Arts & New Media", "You’ll learn more than just the technical side of media production. We’ll teach you how to understand your unique creative process and create work that’s truly one-of-a-kind. Our classes are project-based and focused on building your portfolio. By choosing the projects, classes, and topics you’re passionate about, you can create exactly the degree you need to pursue the career of your choice."),
                    MiuProgram("Bachelor’s Specialization in Cinematic Arts & New Media", "Our classes are project-based and focused on building your portfolio. By choosing the projects, classes, and topics you’re passionate about, you can create exactly the path you need to pursue the career of your choice. By the time you graduate, you’ll have an impressive portfolio and know exactly what it takes to succeed in a media career."),
                    MiuProgram("David Lynch Graduate School of Cinematic Arts", "At the innovative David Lynch MFA in Screenwriting, you’ll have the opportunity to learn the Transcendental Meditation (TM) technique while acquiring the knowledge you need to become a professional screenwriter. The practice of TM will help you grow personally while you sharpen your writing skills and gain access to deeper levels of your creativity, discovering how — as David Lynch says — to catch the big fish."),
                    MiuProgram("Computer Science", "Today’s society is increasingly information-based. Fundamental knowledge of how computers and computing systems work is a vital part of modern life and a universal skill that can be applied to a variety of careers and fields. Our computer science program will prepare you for success by providing comprehensive knowledge of the discipline and by teaching you how to think clearly, precisely, and creatively."),
                    MiuProgram("BA in Consciousness & Human Potential", "The BA in Consciousness & Human Potential integrates personal experience, philosophy of mind, neuroscience, and ancient wisdom. Our goal for every student is enlightenment — the systematic development of full potential from within. This is the key to true fulfillment in daily life and any career."),
                    MiuProgram("BA in Art, Consciousness, & Creative Practice", "In our block system you’ll study one full-time course per month, giving you the time you need to dive deeply into each subject. You’ll be immersed in each studio class without the stress of juggling multiple courses and assignments."),
                    MiuProgram("MA in Studio Art", "In our unique MA in Art, you’ll enjoy an intensive, two-semester exploration into studio practice while cultivating a deep connection to yourself through the Transcendental Meditation technique. In this creative environment, supported by expert faculty, peers, and prominent guest artists, you’ll create a sustainable studio practice — the best foundation for entering an MFA program or a career in art."),
                    MiuProgram("MFA in Visual Art", "Establish your voice as an artist through interactive studio practice, online seminar courses, and dialogue with faculty, peers, and visiting artists."),
                    MiuProgram("Pre-Professional Art Therapy", "As the saying goes, you need to help yourself before you can help others—tapping into the source of your own creativity will provide the basis for your study of art therapy. You’ll gain experience in a wide range of artistic media and approaches, including drawing, painting, and sculpture."),
                    MiuProgram("PhD in Maharishi Vedic Science", "Maharishi Vedic Science is the study of the unbounded, infinite field of consciousness lying at the basis of phenomenal existence and located within everyone as their own innermost Self. During the doctoral program, students will explore this field of intelligence both experientially – through daily practice of the Transcendental Meditation® technique and the TM-Sidhi® program – and by intellectual inquiry in classroom studies of the most advanced, most profound topics of Maharishi Vedic Science."),
                    MiuProgram("MA in Enlightenment and Leadership", "We face major challenges today — in the areas of global health, climate change, social justice, food insecurity, divisions within and between countries, and more. Increasing numbers of young people are becoming involved and committed to meaningful change to solve problems in these areas. Even so, more is needed to address the challenges – new approaches to problem-solving, with new and effective leadership to implement them."),
                    MiuProgram("BA in Ayurveda Wellness & Integrative Health", "We teach the Maharishi AyurVedaSM health system – the modern, scientific revival of complete Ayurveda. Maharishi AyurVeda includes balancing the deepest value of mind – consciousness, which is the basis of balancing the body. It incorporates all aspects of mind, body, behavior, and environment in a scientific framework."),
                    MiuProgram("MS in Maharishi AyurVeda & Integrative Medicine", "You’ll study the Maharishi AyurVedaSM health system, which addresses the body, mind, and environment of an individual to help them become holistically healthy. Vata, pitta, and kapha doshas. Our programs integrate natural techniques with modern medicine to take an integrated and balanced approach to wellness. You’ll study a variety of modalities."),
                    MiuProgram("BA in Creative Writing", "Our program is founded on the idea that creativity is not meant to be a struggle, but instead a fun and rewarding process. At MIU, you’ll take only one full-time class a month, giving you the opportunity to fully immerse yourself in the knowledge without the stress of balancing multiple courses and exams."),
                    MiuProgram("Individualized Major", "With our Individualized Major, you’ll mold classes from our existing programs along with internship options into a one-of-a-kind degree that fulfills your own personal vision."),
                    MiuProgram("BS in Mathematics", "From the architecture of a skyscraper to the spiral of a seashell, everything around us follows mathematical laws. In our undergraduate program, you’ll connect mathematics in a meaningful way to your own life. You’ll see how each topic connects to your deepest self while growing as a mathematician and a person."),
                    MiuProgram("BA in Business Administration", "Consciousness-based business courses at MIU provide the education you need to help transform society through sustainable and socially responsible business. Taking business courses can be beneficial to the career of any student in any major."),
                    MiuProgram("English as a Second Language", "The program follows the innovative and effective Focal Skills Approach to English Language Acquisition. The Focal Skills Approach allows language skills to build on one another naturally in a series of sequenced learning modules."),
                    MiuProgram("MS in Physics", "The graduate program in physics emphasizes the relationship between consciousness and the physical universe, with a focus on the achievements and outstanding problems in advanced physics."),
                    MiuProgram("BA in Sustainable & Regenerative Living", "All things are interconnected. We live within a web of life that includes all aspects of life, and you cannot “fix” just one isolated crisis without considering the whole. In this program you’ll study the interrelated fields of ecology & earth-systems, eco-justice, sustainable economics and community-scale technologies.")
                )
            )
        }
    }
}

/**
 * Data class representing a program offered at MIU.
 *
 * @property programName The name of the program.
 * @property programDescription A brief description of the program.
 */
data class MiuProgram(
    val programName: String,
    val programDescription: String
)
