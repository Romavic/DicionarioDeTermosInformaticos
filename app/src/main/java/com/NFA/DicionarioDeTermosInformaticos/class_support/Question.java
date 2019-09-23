package com.NFA.DicionarioDeTermosInformaticos.class_support;

public class Question {

    public String mQuestion[] = {

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

    private String mChoices[][] = {

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

    public String mCorrectAnswer[] = {"Ms DOS", "Hardware de contagem númerica", "Rangel", "Informação e Automática", "Unidade Central de Processamento", "1ª Geração", "Teclado", "1; 0", "Sim"};

    public String getQuestion(int a) {
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
