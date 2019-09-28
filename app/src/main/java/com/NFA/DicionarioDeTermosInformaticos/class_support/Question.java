package com.NFA.DicionarioDeTermosInformaticos.class_support;

public class Question {

    public final String[] mQuestion = {

            "Qual foi o primeiro Sistema Operativo(SO) desenvolvido para computadores?",
            "O que é o ábaco?",
            "Aonde fica localizado o Instituto de Telecomunicação(ITEL)?",
            "Qual é a origem do termo Informática?",
            "Qual é o significado de CPU ?",
            "Os circuito integrados foram criados foram criados na:?",
            "Qual desses componentes é um dispositivo de Entrada de dados?",
            "Quais desses dígito representa um código binário",
            "Para ser um bom programador, é necessário ter as bases de matemática?",
    };

    private final String[][] mChoices = {

            {"Windows Xp", "Ubuntu", "Windows Vista", "Ms DOS",},
            {"Hardware de contagem númerica", "Sistema Operativo (SO)", "Armadura de Madeira", "Balança",},
            {"Zango", "Viana", "Cazenga", "Rangel",},
            {"Informação Matemática", "Informática", "Informação e Automática", "Informação Manipulada",},
            {"Código de uso Universal", "Unidade Central de Processamento", "Currículo para Universitário", "Code Process Uipac",},
            {"1ª Geração", "2ª Geração", "3ª Geração", "4ª Geração",},
            {"Teclado", "Modem", "Impressora", "Vídeo Projector",},
            {"1; 0", "0 até 9", "1 tende 10", "1 tende a 0",},
            {"Ném por isso", "Sim", "Acho que não", "Não",},

    };

    private final String[] mCorrectAnswer = {"Ms DOS", "Hardware de contagem númerica", "Rangel", "Informação e Automática", "Unidade Central de Processamento", "1ª Geração", "Teclado", "1; 0", "Sim"};

    public String getQuestion(int a) {
        return mQuestion[a];
    }

    public String getChoice1(int a) {
        return mChoices[a][0];
    }

    public String getChoice2(int a) {
        return mChoices[a][1];
    }

    public String getChoice3(int a) {
        return mChoices[a][2];
    }

    public String getChoice4(int a) {
        return mChoices[a][3];
    }

    public String getCorrectAnswer(int a) {
        return mCorrectAnswer[a];
    }
}
