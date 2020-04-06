package ao.dicionariodetermosinformaticos.romavicdosanjoskc.models

import java.util.*

object ListMeannig {

    fun listAllMeannig(): ArrayList<DictionaryWordModel> {
        val listMeaningDictionary = ArrayList<DictionaryWordModel>()

        var p = DictionaryWordModel()
        p.title = "10Base-2"
        p.meaning = "Os cabos 10Base2, também chamados de cabos coaxiais finos, ou cabos Thinnet, são os cabos coaxiais usados em redes Ethernet de 10 megabits. Seu diâmetro é de apenas 0.18 polegadas, cerca de 4.7 milímetros, o que os torna razoavelmente flexíveis. O \"10\" na sigla 10Base2, significa que os cabos podem transmitir dados a uma velocidade de até 10 megabits por segundo, \"Base\" significa \"banda base\" e se refere à distância máxima para que o sinal pode percorrer através do cabo, no caso o \"2\" que teoricamente significaria 200 metros, mas que na prática é apenas um arredondamento, pois nos cabos 10Base2 a distância máxima utilizável é de 185 metros. Usando cabos coaxiais não é necessário utilizar um hub, mas em compensação a velocidade da rede fica limitada a apenas 10 megabits. Outro problema é que esta topologia é muito susceptível a problemas de mal contato, principalmente em redes com mais de 5 PCs. Atualmente os cabos coaxiais são cada vez menos usados, já que além de menos susceptíveis a problemas, os cabos de par trançado categoria 5 suportam transmissão de dados a 100 megabits, ou até mesmo 1 gigabit, caso sejam utilizadas placas de rede Gigabit Ethernet.\n"
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "10Base-T"
        p.meaning = """
            Este é o padrão de redes Ethernet de 10 megabits, onde são utilizados cabos de par trançado. O
            10 no nome indica justamente a velocidade máxima de transmissão de dados.
            Apesar de 10 megabits corresponderem a 1.25 megabytes por segundo, na prática a velocidade
            de transmissão dificilmente ultrapassa os 800 kb/s, pois junto com os dados são transmitidos
            sinais de modulação, bits de correção de erros etc. As placas de 10 megabits já caíram em
            desuso a algum tempo, pois todas as placas PCI atuais transmitem a 100 megabits. Apesar
            disso, as placas de 100 megabits mantém compatibilidade com o padrão anterior.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "100Base-TX"
        p.meaning = """
            Este é o padrão para redes Ethernet de 100 megabits. A topologia da rede é igual à do padrão
            10 Base-T, com um hub central e cabos de par trançado. A grande vantagem é a maior
            velocidade de transmissão, que faz uma grande diferença ao transferir grandes arquivos. As
            placas 100 Base-TX também são capazes de operar a 10 megabits, caso sejam conectadas a
            um hub antigo, por isso também são chamadas de placas 10/100.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "1 T-SRAM"
        p.meaning = """
            É uma tecnologia que permite construir chips de memória cache com apenas um transístor por
            bit (como na memória RAM tradicional) em contraste com os vários transístores utilizados para
            construir cada bit da memória cache tradicional. Os transístores são organizados da mesmamaneira que num chip de memória cache, permitindo que o sistema mantenha tempos de
            acesso bastante baixos, quase tão bons quanto num chip de memória cache "de verdade". Em
            compensação, continua existindo a necessidade de reescrever os dados periodicamente e a cada
            leitura, como na memória RAM. No final das contas temos um tipo de memória cache um pouco
            mais lento, que consome mais energia, mas que em compensação é muito mais barato de se
            produzir.
            Esta tecnologia foi desenvolvida no início dos anos 80 e ficou esquecida durante muitos anos, até
            a HP ressuscitar a idéia no seu processador PA-8800 que traz nada menos que 32 MB de cache
            L2 embutidos no mesmo cartucho do processador (como no Pentium II), uma quantidade que só
            pôde ser obtida graças ao uso da tecnologia.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "2.5G"
        p.meaning = """
            A primeira geração de celulares ou 1G, ainda composta por modelos analógicos, surgiu durante a
            década de 70, se popularizou durante a década de 80 e continuou sendo usada durante boa
            parte da década de 90. Os celulares analógicos são pouco mais sofisticados que os aparelhos de
            rádio amador e não são muito adequados para a transmissão de dados.
            No início da década de 90 surgiram os celulares digitais, a segunda geração, ou 2G, composta
            pelos padrões CDMA, TDMA e GSM. Apesar de já trabalharem com transmissões digitais, a
            velocidade de transmissão de dados é muito baixa. Que o digam os usuários do Wap.
            Os celulares 2.5G representam uma grande evolução em termos de transmissão de dados, pois
            utilizam transmissão por pacotes, o que significa que os celulares ficam constantemente
            conectados à Web e o usuário paga apenas pelos dados transmitidos, ao contrário do Wap, onde
            é cobrado por minuto de conexão. Outra vantagem do 2.5G é a maior velocidade. O padrão que
            está sendo implantado no Brasil permite a transmissão de dados a 144 kbps.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "1U Case"
        p.meaning = """
            Este é o tipo mais compacto de gabinete usado em servidores, projetado para ocupar um único
            espaço no rack, o que significa uma grande economia no custo de hospedagem em data centers,
            onde paga-se por espaço ocupado. Claro que esta economia tem um custo. O gabinete tem
            apenas 8,5 cm de altura, o que limita o número de placas mãe que podem ser utilizadas. Os
            pentes de memória não podem ser encaixados na vertical, como nos desktops, mas sim na
            horizontal. Também não é possível utilizar processadores que dissipam muito calor, pois não é
            possível usar coolers muito grandes.
            É possível usar uma única placa de expansão, conectada na horizontal, com a ajuda de uma
            placa riser, por isso as placas mãe mais indicadas são as com vídeo, rede e RAID onboard. É
            possível utilizar até dois HDs
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "2U case"
        p.meaning = """
            Este é o formato de gabinete mais usado por servidores (superando o 1U), pois é razoavelmente
            compacto, sem com isto limitar tanto a capacidade de expansão.
            Um gabinete 2U tem 16,8 cm de altura e mede 42,65 x 45,4 centímetros. Ainda é mais fino que
            um gabinete ATX tradicional. Apesar disso, ele acomoda um servidor com dois processadores,
            até três placas PCI (encaixadas na horizontal, com a ajuda de um riser) e até quatro HDs. Por
            causa do pequeno espaço, esta não é a melhor solução do ponto de vista da refrigeração, daí a
            necessidade dos data centers terem o ambiente refrigerado.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "32-bit RIMM"
        p.meaning = """
            Os módulos de memória Rambus utilizados no Pentium III e no Pentium 4 são módulos de
            memória com um barramento de apenas 16 bits (contra os 64 bits de um módulo de memória
            SDRAM ou DDR), mas em compensação são capazes de operar a frequências muito altas, 800
            MHz no padrão original e até 1066 MHz no mais recente, o que equilibra a balança. A partir do
            Pentium 4 (com o chipset i850) a Intel adotou uma arquitetura dual Rambus, onde os módulos
            são utilizados em pares, formando um barramento de 32 bits. Apesar da medida ter dobrado a
            velocidade de acesso à memória, trouxe a desvantagem de ter de utilizar dois módulos de
            memória ao invés de um, o que acaba saindo mais caro. Os módulos RIMM de 32 bits são um
            novo padrão que promete resolver este problema, trazendo de volta a flexibilidade de podermos
            utilizar os módulos de memória livremente.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "3Dfx"
        p.meaning = """
            Fabricante das placas de vídeo Voodoo. Foi uma das primeiras companhias a lançar placas de
            vídeo 3D e dominou o mercado durante algum tempo., mas acabou sendo comprada pela Nvidia
            em Dezembro de 2000, depois de atrasar muito o lançamento das placas Voodoo 4 e Voodoo 5,
            que quando foram finalmente lançadas não eram mais páreo para a GeForce da nVidia.
            Entre as placas e chipsets lançados pela 3dfx estão o Voodoo e Voodoo 2, usados em placas de
            vários fabricantes (como por exemplo as placas Monster 1 e Monster 2), e as placas Voodoo 3,
            Voodoo 4 e Voodoo 5, fabricadas exclusivamente pela 3Dfx.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "3D-Now!"
        p.meaning = """
            O processador K6 da AMD tinha um bom desempenho em números inteiros, mas ao mesmo
            tempo um coprocessador aritmético bastante fraco, que comprometia seu desempenho em jogos
            e aplicativos gráficos.Desenvolver um projeto de coprocessador aritmético demora anos. Por isso, a AMD optou por
            uma solução elegante para tentar corrigir este problema no K6-2. Seguiu o exemplo da Intel e
            incorporou novas instruções ao seu processador, o conjunto 3D-Now!, formado por 27 novas
            instruções que têm como objetivo agilizar o processamento de imagens tridimensionais,
            funcionando em conjunto com uma placa aceleradora 3D. Como acontece com as instruções
            MMX, é necessário que o software usado faça uso do 3D-Now!, caso contrário não existe ganho
            algum.
            O conjunto 3D-Now! Foi aperfeiçoado no Athlon e a partir do Athlon XP ganhou mais instruções,
            tornando-se compatível também com as instruções SSE do Pentium III. Com o reforço, o 3DNow! passou a ser chamado de 3D-Now! Professional.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "3G"
        p.meaning = """
            Os celulares de terceira geração, ou 3G estão começando a serem implantados no Japão e
            devem ainda demorar mais alguns anos para chegarem ao Brasil, onde ainda estamos vendo a
            transição do 2G para o 2.5G.
            O principal atrativo deste novo padrão é a maior velocidade de transmissão de dados. Estamos
            falando de 2 megabits, contra apenas 14.4 k do Wap e 144 k dos celulares 2.5G.
            Além de oferecerem acesso rápido à Web, os celulares 3G poderão ser utilizados para realizar
            videoconferência e para streaming de vídeo (clipes, seriados, etc.). De fato, vários protótipos de
            celulares 3G trazem chips decodificadores de vídeo em MPEG 2 ou MPEG 4, telas coloridas de
            alta resolução e câmeras de videoconferência.
            Assim como no 2.5G a transmissão de dados é feita através de pacotes, o que significa que o
            celular fica continuamente conectado à Web e o usuário paga apenas pelos dados transmitidos.
            Um detalhe importante é que os 2 megabits são compartilhados entre todos os celulares
            cobertos por cada torre, o que significa uma velocidade muito mais baixa na prática,
            principalmente nos horários de maior movimento.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "3GIO"
        p.meaning = """O 3GIO é um barramento de dados ultra-rápido que conta com o apoio da Intel para
eventualmente substituir o barramento PCI.
A versão inicial do 3GIO será capaz de transmitir apenas 2.5 gigabits por segundo, ou 312 MB/s,
pouco mais que o dobro dos slots PCI atuais. Este primeiro padrão começará a ser utilizado em
2004 segundo os planos da Intel. O padrão seguinte entrará em operação em 2005 e será 4
vezes mais rápido, atingindo 10 gigabits por segundo.
Ambos os padrões conviverão por algum tempo, mas felizmente serão intercompatíveis. Uma
placa 3GIO de 10 gigabits poderá trabalhar num slot de 2.5 gigabits (embora a performance
possa ser prejudicada) e vice-versa. As placas PCI continuarão sendo suportadas durante muito
tempo, pelo menos até o lançamento do próximo padrão. Lembre-se que as placas ISAdemoraram quase 10 anos para deixarem de ser suportadas nas placas novas depois do
surgimento do PCI.
Apesar de parecer apenas um "remendo" do PCI, o 3GIO elimina toda a carga de legado do
barramento antigo. O conector PCI foi mantido, mas toda a parte lógica foi muito modificada.
Juntos, os slots do 3GIO utilizam apenas 40 trilhas de dados, contra nada menos que 84 trilhas
do PCI tradicional, 150 trilhas do PCI de 64 bits e 108 trilhas do AGP. Sem dúvida uma economia
expressiva.
Mais uma característica importante do 3GIO é a sua topologia ponto a ponto. Ao contrário do
PCI, onde todos os dispositivos compartilham o mesmo barramento e apenas um pode transmitir
de cada vez, o 3GIO utiliza um switch para garantir que cada dispositivo disponha de uma
ligação exclusiva com o chipset e os demais componentes do PC. Graças a isto, vários
dispositivos podem transmitir o mesmo tempo e dispor do barramento a qualquer instante.
Isto é especialmente efetivo quando dois dispositivos ligados ao barramento 3GIO precisam
trocar dados entre sí, como por exemplo dados que vão de uma placa de rede para a outra.
Estas transferências podem ser feitas dentro do próprio barramento, sem ocupar a ponte sul do
chipset, nem muito menos o processador.
Está anunciada ainda uma versão do 3GIO destinada a notebooks, que substituirá os slots PCCard utilizados atualmente, que são uma extensão do barramento PCI. Mas, ainda não foi
divulgado se o novo padrão manterá compatibilidade com o atual. As placas PC-Card atuais por
exemplo, não podem ser instaladas em muitos notebooks antigos, com slots PCMCIA que são
baseados no barramento ISA. O encaixe é o mesmo, mas placas não funcionam.
Para completar, está previsto que o 3GIO permitirá também a conexão de dispositivos externos,
mantendo a mesma velocidade de transferência de dados, sem dúvida um grande avanço sobre
os 400 megabits do USB 2.0 e do Fireware, mas que será aproveitado por poucos periféricos."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "4G"
        p.meaning = """
            A quarta geração de telefones celulares ainda está em desenvolvimento, mas promete
            velocidades de transmissão bastante superiores aos celulares 3G: entre 20 e 40 megabits. Os
            celulares 4G de vem começar a ser usados no Japão por volta de 2006, (só Deus sabe quando
            chegarão por aqui :-). O 4G aumentará ainda mais o potencial dos celulares como plataforma de
            entretenimento, além de tornar a transmissão de dados mais barata em relação aos padrões
            anteriores.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "4i RDRAM"
        p.meaning = """
            Esta é uma tecnologia de memória Rambus sensivelmente mais barata que a tradicional, onde
            temos apenas 4 páginas de memória por chip, ao invés de 16 páginas. Em teoria, o fato de
            usarem menos páginas de memória tornaria os módulos 4i mais lentos, já que menos páginas de
            memória abertas, significa uma chance menor do chipset conseguir obter os dados de que
            necessita sem precisar abrir uma página inativa da memória.
            Porém, os chipsets que suportam memória Rambus, como o i850 são capazes de manter apenas
            64 páginas de memórias abertas simultâneamente. Como nestas soluções é preciso utilizar os
            módulos RIMM aos pares, teremos sempre pelo menos dois módulos de memória Rambus
            espetados na placa mãe. Se temos sempre pelo menos 8 chips por módulo, teremos então pelo menos 16 chips. Com 4 bancos por chip já teremos as 64 páginas que o chipset é capaz de
            manter abertas.
            Ou seja, os módulos 4i RDRAM já são capazes de oferecer o número de páginas de que o chipset
            pode tomar vantagem, por isso não há perda de desempenho em relação aos módulos de 16
            páginas, que são mais úteis em sistemas que utilizam poucos chips de memória, como por
            exemplo o Playstation 2, onde temos apenas 2 chips soldados à placa mãe.
            Em teoria, a arquitetura simplificada dos módulos 4i RDRAM permitiriam que, se produzidos em
            quantidade, pudessem custar o mesmo, ou até menos que os módulos de memória DDR. Porém,
            isso parece não importar tanto atualmente, já que além do chipset i850 da Intel, que está
            prestes a ser descontinuado, não temos mais nenhuma plataforma importante que utilize
            memórias Rambus, o que deixa pouco espaço para uma eventual massificação desta tecnologia.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "680x0"
        p.meaning = """
            Esta é a família de processadores, produzidos pela Motorola, que foram utilizados nos Macintoshs
            até a metade da década de 90. Existiram basicamente 5 versões, 6800, 68020, 68030, 68040 e
            68060. Em parceria com a Apple e a IBM, a Motorola lançou em 94 os chips Power PC, seus
            sucessores.
            Os Macintoshs da família Performa foram os últimos a utilizar os chips 680x0, a partir dos Power
            Macs passaram a ser usados os novos chips. Mais um fato importante é que as duas famílias são
            incompatíveis, os chips 680x0 possuem uma arquitetura CISC, enquanto os chip Power PC
            possuem um design inspirado na arquitetura RISC.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "80186"
        p.meaning = """
            O processador usado nos primeiros PCs, entre eles o PC XT, foi o 8088, uma variação do 8086.
            Depois, surgiram os PCs baseados no 80286, ou simplesmente 286. Mas, entre as duas
            gerações, existiu um modelo intermediário, pouco conhecido, mas igualmente importante.
            O 80186 é uma evolução do 8086, que trouxe algumas instruções novas e um sistema de
            tolerância à falhas. Apesar de não ter sido usado como processador em micros PC, o 80186
            tornou-se um componente bastante popular, sendo usado em controladores de HDs,
            controladores de interrupção entre vários outros periféricos. Nestas aplicações, o 80186 continua
            em uso até hoje.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "802.11b+"
        p.meaning = """Esta é uma evolução do padrão de redes sem fio IEEE 802.11b desenvolvido pela DLink. Este
não é um padrão aprovado pelo IEEE por isso é chamado apenas "802.11+" e não "IEEE
802.11+".
O 802.11b+ é suportado por um número relativamente pequeno de produtos, mas traz como
principal vantagem o aumento da taxa de transferência a curtas distâncias, que segundo os
fabricantes pode chegar a até 22 megabits, o dobro dos 11 megabits permitidos pelo 802.11b
tradicional, ao mesmo tempo em que mantém compatibilidade com o padrão antigo.
A mudança é transparente para o usuário. Ao conectar dois dispositivos 802.11b+ ele se
reconhecem e passam a trabalhar a 22 megabits. Caso sejam misturados com dispositivos
802.11b tradicionais a taxa de transmissão cai automaticamente para 11 megabits, respeitando
a velocidade dos dispositivos mais lentos.
Vale lembrar que os 22 megabits são atingidos apenas em distâncias muito curtas, apenas
alguns metros. A partir daí a velocidade cai vertiginosamente, se aproximando cada vez mais da
velocidade dos transmissores 802.11b tradicionais."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "A3D (Aureal 3D)"
        p.meaning = """
            A primeira empresa a desenvolver uma API de som tridimensional foi a Aureal, com seu Aureal
            3D, ou simplesmente A3D. As primeiras placas de som compatíveis com esta API, como a
            Monster Sound foram lançadas no início de 97. O A3D 1.0 permite simular 3 eixos: frente e trás,
            direita e esquerda e frente e baixo, aplicando filtros especiais para que o som realmente pareça
            vir de todas as direções, mesmo utilizando apenas duas caixas acústicas ou fones de ouvido.
            Estes filtros são capazes de distorcer sutilmente as ondas sonoras, conseguindo enganar nossos
            ouvidos, fazendo-nos pensar que elas vêem de diferentes direções. Estes filtros consomem uma
            enorme quantidade de poder de processamento e seu uso é o principal motivo dos chipsets de
            som atuais serem tão poderosos. A vantagem é que como tudo é processado na própria placa de
            som, não há quase utilização do processador principal. Existem claro algumas excessões,
            maioria das placas de som onboard quando compatíveis com o padrão processam os efeitos via
            software, o que consome cerca de 15% do desempenho de um Pentium III de 1.0 GHz. Veja
            também: EAX

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Abandonware"
        p.meaning = """
            É um software "abandonado", que não é mais vendido, nem conta com suporte por parte do
            fabricante. Apesar disso, a menos que o software seja disponibilizado como freeware, cópias não
            registradas continuam sendo ilegais, já que a lei de direitos autorias garante direitos ao criador
            por de 50 a 75 anos, dependendo do país. Um bom exemplo é o MS-DOS da Microsoft. O
            programa não é mais vendido, mas continua sendo ilegal copia-lo, empresta-lo etc. A Apple por
            sua vez disponibilizou como freewares várias versões antigas do MAC OS.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ABR"
        p.meaning = """
            Average Bit Rate. Esta é uma opção encontrada em muitos programas de compressão de áudio
            (seja em MP3 ou qualquer outro formato baseado em perda). O ABR é o método mais rápido de
            compressão, onde é utilizado o mesmo bit-rate em todos os trechos da música. Por exemplo, a
            maioria dos arquivos em MP3 utiliza um bit-rate de 128 kbits, onde temos 128 kbits de dados
            por segundo para representar a música. No ABR é usada a mesma quantidade de bits para
            representar tanto os trechos de silêncio no início e no final da faixa quanto para representar as
            partes mais movimentadas da música, onde vários instrumentos concorrem entre sí e com a voz
            do cantor. Você acaba com um silêncio de excelente qualidade, mas alguns trechos representados de forma precária. Este sistema é também chamado de CBR, ou "constant bit
            rate", mas o significado é o mesmo
            Em oposição temos o VBR ou "variable bit rate", um formato de compressão mais complexo e
            demorado, mas que permite obter arquivos de melhor qualidade, mesmo mantendo o mesmo
            bit-rate. O truque é economizar bits nos trechos menos movimentados, onde temos frequências
            mais ou menos constantes e descarregar a munição acumulada nos trechos mais movimentados,
            que passam a ser representados com mais bits e conseqüentemente uma qualidade maior. A
            desvantagem do sistema é que a compressão da música demora muito mais. É ideal para quem
            tem um PC rápido.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AC"
        p.meaning = """
            Aternating Current, corrente alternada. A forma como a eletricidade vem a partir da usina e
            consequentemente a partir das tomadas. A direção é alternada 60 vezes por segundo (50 na
            Europa). Veja também: DC
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Access"
        p.meaning = """
            Acesso. Leitura ou gravação de dados na memória RAM ou em outro meio qualquer, como um
            disco rígido. Os tempos de acesso variam muito de acordo com o dispositivo, por exemplo, a
            memória RAM pode ter tempos de acesso de 70, 60, 50, 10, 8, 7 ou mesmo 6 nanossegundos,
            dependendo da tecnologia usada. O HD por sua vez é muito mais lento, com tempos de acesso
            na casa dos 8 ou 9 milessegundos num HD atual.
            O tempo de acesso determina apenas o tempo necessário para o dispositivo começar a transferir
            dados e não a sua velocidade de transferência. Um módulo de memória PC-133 pode transferir
            dados, em condições ideais, a 1066 MB/s, enquanto um HD topo de linha chega perto dos 50
            MB/s. Veja que o HD demora por volta de um milhão de vezes mais tempo para começar a
            transferir dados, mas depois que inicia a transferência, a diferença cai para cerca de 20 vezes.
            Naturalmente, tanto a memória RAM quanto o HD são muito mais lentos que o processador,
            tanto em termos de tempo de acesso quanto em termos de velocidade de transferência. Por
            exemplo, um Athlon de 1.5 GHz executa um bilhão e meio de ciclos por segundo e processa 32
            bits de dados em cada ciclo. Ou seja, em condições idéias o processador precisa de dados a cada
            0,66 nanossegundo e processa 6 gigabytes de dados por segundo. Para diminuir a diferença
            entre o processador, a memória RAM e o disco rígido, são usadas várias categorias de memória
            cache, rápidas o bastante para acompanhar o processador. Leia também: Cache, Cache L1,
            Cache L2, Cache L3, Cache de Disco.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Access Time"
        p.meaning = """
            Tempo de acesso, o tempo que o dispositivo acesso demora para entregar os dados requisitados,
            ou armazenar a informação desejada. Quanto mais baixo for o tempo acesso, mais rápido será o
            dispositivo. Na memória RAM o tempo de acesso é medido em nanossegundos, sendo que as
            memórias SDRAM mais rápidas chegam a 6 nanos. Em HDs o tempo de aceso é bem mais alto, medido em milessegundos. Os HDs mais rápidos chegam a 8 milessegundos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Aceleração de Vídeo"
        p.meaning = """Placas de vídeo mais antigas, como as CGA e EGA usadas em micros 286, assim como as
primeiras placas padrão VGA não possuíam aceleração de vídeo. Isto significa que elas
limitavam-se a mostrar na tela as imagens enviadas pelo processador. Este tipo de placa
funcionava bem em ambientes texto como o DOS, onde a quantidade de informações a ser
mostrada no vídeo é pequena. Em ambientes gráficos como o Windows 95/98 porém, uma
quantidade enorme de dados deve ser processada para formar a imagem. Usando uma placa
sem aceleração, todo o trabalho tem que ser feito pelo processador, tornando o sistema bastante
lento.
Uma placa aceleradora alivia a carga sobre o processador, executando muitas das tarefas que
antes cabiam a ele. Ao arrastar uma janela por exemplo, o processador apenas transmitirá à
placa de vídeo: "Arrastar a janela x para a posição y" e a placa de vídeo fará o resto do
trabalho. Todas as placas de vídeo atuais possuem estes recursos. Se você abrir o painel de
controle do Windows, e abrir a janela "sistema", encontrará uma guia que permite diminuir ou
mesmo desativar a aceleração de vídeo, o que obviamente só deverá ser feito no caso de
problemas com a placa. Vale lembrar que esta aceleração visa apenas diminuir o trabalho do
processador quando lidamos com imagens bidimensionais, não tendo nada a ver com a geração
de gráficos 3D."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ACK"
        p.meaning = """
            Um comando suportado por vários sistemas e vários serviços e arquiteturas de rede, que
            confirma o recebimento de um pacote de dados, mensagem ou comando.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ACPI"
        p.meaning = """Advanced Configuration and Power Interface. É o modo de economia de energia utilizado pelos
PCs atuais. Micros mais antigos suportam o DPMA, que é o modo anterior. A diferença básica é
que no ACPI o gerenciamento de energia é feito pelo sistema operacional e não pelo BIOS. Isso
permite um gerenciamento muito mais avançado, permitindo recursos como diminuir a
frequência de operação do processador (um recurso incomum em desktops, mas presente na
maioria dos notebooks), desligar dispositivos, etc.
Graças ao ACPI, os PCs atuais permitem um gerenciamento de energia muito mais sofisticado
que os antigos, onde era possível apenas desligar o monitor e o HD. O avanço veio na forma de
dois novos modos, o modo de espera e o hibernar.
Ao entrar em modo de espera, não apenas o HD e o monitor, mas quase todo o PC é desligado,
incluindo o processador, o cooler, placa de vídeo ou som, etc. Apenas a memória RAM, partes da
placa mãe, modem e placa de rede continuam ativos.
A memória RAM continua sendo alimentada para manter os dados gravados e permitir que o PC
volte exatamente onde estava. É a única parte do PC que realmente não pode ser desligada sem
que seja necessário um novo boot. O modem permanece ligado para que a conexão não caia e a
placa de rede permanece alerta para acordar o PC caso o recurso de wake-on-lan esteja ativado
no Setup.
 Em modo de espera o PC consome de 15 a 20 Watts de energia, o mesmo que uma lâmpada
fluorescente e pode voltar à atividade em poucos segundos. Note que apenas o cooler do
processador é desligado, o exaustor da fonte continua funcionando, pois ainda é necessário que
ela forneça uma quantidade razoável de energia.
Para que a opção de entrar em modo de espera esteja disponível, é necessário que a sua placa
mãe ofereça suporte a ACPI. O Windows 98/2000 é capaz de detectar isto e ativar ou não o
suporte automaticamente. Veja que isto inclui apenas placas razoavelmente recentes, e mesmo
assim o suporte pode ser desativado caso você tenha alguma placa ISA que não suporte este
recurso.
Como opção, existe o hibernar (ou suspender) onde o conteúdo da memória RAM é gravado no
HD e o PC é realmente desligado. Ao liga-lo novamente o sistema simplesmente recupera os
dados e também volta exatamente onde estava. O tempo necessário depende da quantidade de
memória RAM que estiver instalada, quanto mais memória maior será o arquivo no HD e mais
demorará. Mas, geralmente ainda será bem mais rápido que um boot completo.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Active Directory"
        p.meaning = """
            Este é um recurso presente no Windows 2000 Server e Windows XP Server (quando for lançado)
            que cria uma interface para a administração dos recursos de rede. Usando o Active Directory o
            administrador pode visualizar e modificar todos os recursos da rede de forma centralizada, ao
            invés de ter fazê-lo micro por micro. O Active Directory é baseado no LDAP e é uma resposta
            direta ao NDS do Novell Netware.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Actuator"
        p.meaning = """
            Num HD, é o mecanismo de movimenta as cabeças de leitura. Basicamente é composto por um
            braço móvel em forma de triângulo. Na ponta do triângulo encontram-se as cabeças de leitura
            do HD, enquanto na base temos um eixo e dois eletroímãs, que controlados pela placa lógica do
            HD movimentam o mecanismo com uma velocidade e precisão espantosas. Em HDs muito
            antigos e em drives de disquete, é utilizado um motor de passo no lugar do actuator, por isso
            esses dispositivos são extremamente lentos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ActiveX"
        p.meaning = """
            Linguagem que pode ser usada para construir páginas Web dinâmicas, com scripts que rodam a
            partir do servidor. Apesar dos recursos, o ActiveX peca pelas incompatibilidades com vários
            browsers, bugs, sobrecarga do servidor devido à grande quantidade de processamento exigido e
            brechas de segurança. Apesar de tudo, muitos acreditam que o ActiveX é o futuro da Web.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ACR"
        p.meaning = """
            Advanced Communications Riser. Um padrão desenvolvido por uma associação de vários
            fabricantes, que inclui a AMD, Lucent, Motorola, 3Com, Nvidia, Texas Instruments e Via. Os slots
            ACR se parecem com um slot PCI invertido, na verdade os fabricantes optaram por aproveitar o
            mesmo encaixe para cortar custos, mas as semelhanças param por aqui, já que mudam a
            posição e sinalização elétrica do slot. Os slots ACR são Risers para a conexão de placas de som e modems de baixo custo, assim como
            os slots AMR. Muitas placas atuais trazem um slot ACR, mas os fabricantes evitam desenvolver
            placas com dois ou mais slots ACR para não diminuir o número de slots PCI da placa.
            A principal vantagem do ACR sobre o AMR é enquanto o AMR permite que o Riser inclua apenas
            modem e placa de som, no ACR o Riser pode conter praticamente todo tipo de dispositivos,
            desde modems e placas de som baratas, controlados via software, até placas de rede, modems
            ADSL ou ISDN, placas de som e modems controlados via hardware, etc.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Acrobat"
        p.meaning = """
            Formato de arquivo desenvolvido pela Adobe que permite que documentos sejam exibidos em
            qualquer micro com as fontes e layout corretos, alem de também suportar imagens, tabelas e
            recursos de segurança. A Adobe lançou no mercado dois produtos relacionados ao formato, o
            Acrobat Reader que permite apenas visualizar os arquivos e é gratuíto e o Acrobat Writer, que
            permite gerar os arquivos e é pago.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Adaptive Compression"
        p.meaning = """
            Algoritmo inteligente de compressão que altera o nível de compressão de acordo com o tipo de
            dados. Um exemplo de uso são vídeos, onde as cenas de maior movimentação devem receber
            um nível mais baixo de compressão do que as cenas de diálogos, onde há poucas mudanças de
            imagem.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ADC"
        p.meaning = """
            Analogue-to-Digital Converter, componente que faz conversão de um sinal analógico para digital.
            Todas as placas de som possuem um ADC, responsável por digitalizar os sons analógicos vindos
            do microfone ou outro dispositivo analógico qualquer.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Additive Colour"
        p.meaning = """
            Uma cor produzida através da mistura de diferentes tonalidades de algumas cores primárias.
            Num monitor as cores são obtidas através da mistura de pontos azuis, vermelhos e verdes.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ADSL"
        p.meaning = """
            Assimetric Digital Subscriber Line, tecnologia de acesso rápido que usa as linhas telefônicas
            oferecida em várias cidades. As velocidades variam em geral de 256 kbits a 2 mbps, dependendo do plano de acesso escolhido. A principal virtude é não usar o sistema telefônico
            comutado, dispensando o assinante de pagar pulsos, apenas a tarifa mensal.
            Para isso, é instalado um modem ADSL na casa do assinante e outro na central telefônica. Os
            dois modems estabelecem uma comunicação contínua, usando frequências mais altas que as
            utilizadas nas comunicações de voz, o que permite falar no telefone e usar o ADSL ao mesmo
            tempo. O modem instalado na central é ligado diretamente ao sistema do provedor, sem passar
            por outras centrais telefônicas.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Adware"
        p.meaning = """
            São programas, geralmente gratuítos, que mostram anúncios, na forma de banners incorporados
            à interface do programa, ou mesmo janelas pop-up. As propagandas são uma forma alternativa
            dos desenvolvedores ganharem dinheiro com o programa. Existem claro os contrários à idéia,
            que argumentam que, como acessam a rede para baixar os banners a serem exibidos, estes
            programas podem ser usados para investigar os hábitos de navegação do usuário. Muitas vezes
            existe a opção de comprar uma versão do programa que não mostra os anúncios.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AfterStep"
        p.meaning = """
            Uma interface gráfica para o Linux e Unix que é baseada na NEXTSTEP, outra interface para o X,
            que foi utilizada pela Apple como base para a interface Aqua do MacOS X. Apesar disso, o
            desenvolvimento da AfterStep continua independente, servindo como uma opção mais leve para
            os usuários das interfaces KDE e Gnome.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AGC"
        p.meaning = """
            Automatic Gain Control. É um recurso necessário para que o gravador ou leitor de CDs seja
            capaz de ler CDs regraváveis. Em comparação com os CDs prensados, os CDs regraváveis
            possuem uma taxa de refração muito baixa, em torno de 20 ou 25%. Para lê-los, é necessário
            aumentar a potência do laser de leitura, trabalho feito pelo AGC. Quase todos os gravadores são
            compatíveis, mas infelizmente apenas uma pequena parte dos leitores o são. Os CDs graváveis
            por sua vez podem ser lidos em praticamente qualquer leitor, já que oferecem uma refração de
            luz de até 80%
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AGP"
        p.meaning = """
            Acelerated Graphics Port. Barramento de dados extremamente rápido usado pela placa de vídeo.
            Aparece como um slot marrom na placa mãe. Existem várias versões do AGP, chamadas AGP 1X,
            2X, 4X e AGP Pro, o padrão mais novo. Os três primeiros, diferenciam-se pela velocidade: O AGP
            1X permite transmissão de dados a 266 MB/s, o AGP 2X trabalha a 533 MB/s, enquanto o AGP
            4X atinge 1066 MB/s. O AGP Pro por sua vez, diferencia-se dos demais por possuir uma
            capacidade maior de fornecimento elétrico. Enquanto os slots AGP tradicionais fornecem até 20
            Watts de eletricidade, os slots AGP Pro fornecem 50 Watts (AGP Pro 50) ou 110 Watts (AGP Pro
            110). Os slots AGP Pro são maiores que os tradicionais. Uma placa AGP comum pode ser usada
            sem problemas num slot AGP Pro, mas não o contrário.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AGP 8X"
        p.meaning = """
            Esta é a versão mais recente do barramento AGP, que apesar de manter a frequência de
            operação de 66 MHz passou a ser capaz de realizar 8 transferências por ciclo, atingindo incríveis
            2133 MB/s. Apesar desta velocidade não ser comparável com a da memória de vídeo das placas
            mais atuais, que não vão demorar muito para romper a barreira dos 10 GB/s, esta nova versão
            do AGP significa um grande ganho de desempenho para as placas de vídeo onboard, que
            utilizam memória RAM compartilhada como memória de vídeo.
            Um dos primeiros chipsets a utilizar o AGP 8X foi o nVidia nForce, onde ele é usado para
            alimentar o chipset de vídeo GeForce MX integrado. Um adendo é que para o AGP 8X fazer
            sentido é necessário que a placa mãe utilize memórias DDR ou Rambus, pois memórias PC-133
            não são capazes de atender todo o potencial nem mesmo do AGP 4X. No caso do nForce a
            solução para alimentar o chipset de vídeo foi o TwinBank, que permite combinar dois pentes de
            memória DDR PC-2100, atingindo um barramento de dados (teórico) de 4.2 GB/s.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AGP 3.0"
        p.meaning = """
            Esta é uma nomenclatura alternativa para o AGP 8X. Neste caso, o AGP 1.x engloba as versões
            1x e 2x, onde apesar da diferença na taxa de transferência de dados temos os mesmos
            requisitos elétricos (tensão, capacidade de alimentação, etc.). O 2.x refere-se ao AGP 4x, onde
            além de um novo aumento na taxa de transferência tivemos o estabelecimento de um padrão
            elétrico mais rígido, que estabelece que a placa mãe deve ser capaz de fornecer estavelmente
            uma quantidade maior de eletricidade para a placa de vídeo e a uma tensão mais baixa, apenas
            1.5v, contra os 3.3v do padrão anterior.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AGP Led"
        p.meaning = """
            As placas mãe para Pentium 4 baseadas no chipset i845, i845D ou futuros lançamentos da Intel
            baseados nestes dois projetos possuem um grave problema de compatibilidade com placas de
            vídeo AGP que utilizam tensão de 3.3V (as placas atuais utilizam 1.5V) o problema é tão grave
            que o simples fato de ligar o micro com uma destas placas pode queimar o controlador AGP,
            inutilizando a placa.
            Em teoria, apenas placas AGP antigas, 1X ou 2X podem utilizar 3.3V ou 1.5V, enquanto todas as
            de 4X obrigatoriamente utilizariam 1.5V. Mas, placas com chipsets Riva TNT2 (Pro e Ultra),
            GeForce256 DDR, GeForce2 Pro e GeForce2 Ultra podem utilizar 3.3V mesmo sendo vendidas
            como placas AGP 4X. O AGP Led é uma novidade presente em muitas placas i845 recentes, onde um sistema de
            segurança detecta a tensão utilizada pela placa de vídeo e paralisa a placa caso a placa utilize
            3.3V, evitando qualquer dano. Um led, posicionado próximo ao conector da fonte acende,
            avisando o usuário do problema.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Algoritmo"
        p.meaning = """ Algoritmo Ou Algorithm em Inglês. Um conjunto de cálculos matemáticos, usado para encriptar dados,
compactar arquivos, entre várias outras aplicações. Um arquivo compactado ou encriptado pode
ser usado apenas por quem tiver o algoritmo de desencriptação ou descompactação, que
permitirá reverter o processo."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Alias"
        p.meaning = """Apelido, pode ser usado em várias áreas, como por exemplo no e-mail. Caso você tenha uma
conta, fulano@fulano.com, e um alias fulaninho@fulano.com, todos os e-mails endereçados ao
alias será encaminhados para a conta real. O alias é um dos comandos básicos do Unix, que
permite personalizar os comandos do sistema, digitando por exemplo "on" ao invés de "mount /
mnt/cdrom" por exemplo. No Linux é possível criar aliases editando o arquivo ".bashrc",
presente no diretório de cada usuário, ou o arquivo /etc/bachrc, que vale para todos os usuários"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Alpha"
        p.meaning = """
            É ao mesmo tempo o nome de uma família de processadores RISC, quanto o nome dos sistemas
            baseados nele, ambos desenvolvidos pela Dec. Os servidores Alpha fizeram sucesso durante
            vários anos. Apesar de terem seu conjunto dei instruções próprio, os chips Alpha ganharam uma
            versão do Windows NT e de várias versões do Linux. Os Alpha foram usados por exemplo no
            Altavista.com.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ALU"
        p.meaning = """
            Arithmetic Logic Unit. Como o nome sugere, é a parte do processador principal encarregada de
            processar os cálculos de ponto flutuante. O termo ALU, dependendo da conotação, pode ser tanto
            usado em relação ao coprocessador aritmético como um todo, quanto em relação a apenas uma
            das unidades de execução que formam os coprocessadores modernos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Altair 8080"
        p.meaning = """Lançado em 1974 é considerado por muitos o primeiro computador pessoal da história. O Altair
era baseado no 8080 da Intel e vinha com apenas 256 bytes de memória, realmente bem pouco,
mesmo para a época.
No modelo básico, o Altair custava apenas 439 dólares na forma de Kit, isso em 1975, quando
começou a ser comercializado, em valores de hoje este valor equivale a quase 4.000 dólares.
Parece bastante, mas na época esse valor foi considerado uma pechincha, tanto que foram
vendidas 4.000 unidades em 3 meses, depois de uma matéria da revista Popular Eletronics. Esse
"modelo básico" consistia nas placas, luzes, chips, gabinete, chaves e a fonte de alimentação,
junto claro com um manual que ensinava como montar o aparelho. Existia a opção de compra-lo
já montado, mas custava 182 dólares a mais. Pouco tempo depois começaram a surgir vários
acessórios para o Altair: um teclado que substituía o conjunto de chaves que serviam para
programar o aparelho, um terminal de vídeo (bem melhor que ver os resultados na forma de
luzes :-), um drive de disquetes (naquela época ainda se usavam disquetes de 8 polegadas),
placas de expansão de memória e até uma impressora, para quem tivesse muito dinheiro,
claro :-)
Até mesmo Bill Gates ajudou, desenvolvendo uma versão do Basic para o Altair. O Altair era
realmente um sistema muito simples, que não tinha muita aplicação prática, mas serviu para
demonstrar a grande paixão que a informática podia exercer e que, ao contrário do que diziam
muitos analistas da época, existia sim um grande mercado para computadores pessoais."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Altivec"
        p.meaning = """
            O conjunto de instruções especiais que equipa os processadores G4 da Motorola, usados nos
            micros Macintosh. Este conjunto inclui tanto instruções 3D (como no 3D-Now! encontrado nos
            processadores AMD), quanto instruções multimídia (como o MMX).
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AMD 760"
        p.meaning = """
            Este foi o primeiro chipset para Athlon a suportar memórias DDR e foi produzido pela própria
            AMD. O AMD 760 é formado por dois chips, o AMD-761 (ponte norte) e o AMD-766 (ponte sul).
            Este chipset suporta tanto memórias DDR PC-1600 quanto memórias DDR PC-2100 e pode
            trabalhar tanto em conjunto com processadores que utilizam bus de 200 MHz quanto
            processadores que utilizam bus de 266 MHz. Salvo limitações por parte do BIOS, as placas
            baseadas neste chipset suportam todos os modelos do Athlon Thunderbird e Duron em formato
            soquete A além do Athlon XP.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AMD 760MP"
        p.meaning = """
            Esta é uma variação do chipset AMD-760 que além do suporte a memórias DDR e outros
            recursos do chipset original, oferece suporte a multiprocessamento. É possível utilizar tanto dois
            processadores Athlon MP, quanto dois processadores Duron baseados no core Morgan (as
            versões de 1.0 GHz em diante). As placas baseadas neste chipset trazem dois encaixes para
            processadores e são um pouco mais caras.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AMD 760MPX"
        p.meaning = """
            Esta é uma versão atualizada do chipset 760MP, destinada principalmente a servidores, que traz
            como novidade o suporte a slots PCI de 64 bits e/ou de 66 MHz proporcionado pelo uso de uma
            nova ponte sul, composta pelo chip 768.
            Os slots PCI de 64 bits são maiores que os comuns (que são slots de 32 bits e operam a 33 MHz,
            proporcionando um barramento de dados de 133 MB/s) mas trazem a vantagem de transferirem
            64 bits de dados por vez, o suficiente para dobrar a velocidade de transferência de dados,
            atingindo 266 MB/s. Os slots de 66 MHz novamente dobram a velocidade, atingindo 533 MB/s.
            Estes slots mais rápidos são importante em servidores que utilizam placas SCSI, Gigabit Ethernet
            ou outros tipos de periféricos muito rápidos. No futuro teremos o PCI-X, capaz de atingir
            velocidades ainda mais altas.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AMR"
        p.meaning = """
            A sigla AMR é a abreviação de "Audio Modem Riser". Este é um padrão de barramento que
            permite o encaixe de placas de som e modems controlados via software.
            O slot AMR se parece com um slot AGP, mas tem apenas 1/3 do tamanho deste. O objetivo é
            permitir a criação de componentes extremamente baratos para serem usados em micros de
            baixo custo.
            A vantagem é claro, o preço, já que uma placa de som ou modem AMR não custam mais de 5 ou
            7 dólares para o fabricante (um pouco mais para o consumidor final naturalmente). A
            desvantagem, por sua vez, é o fato destes componentes serem controlados via software, o que
            consome recursos do processador principal, tornando o micro mais lento. Usando ao mesmo
            tempo modem e placa de som AMR num Pentium III 800, a queda de performance é de mais de
            10%. Claro que existe a opção de desprezar o slot AMR e utilizar componentes tradicionais.
            Como o chip controlador é embutido no próprio chipset, as placas de som e modems AMR contém
            um número extremamente reduzido de componentes, basicamente as entradas e saídas de som,
            o CODEC e, no caso dos modems, o Relay (o componente que permite o acesso à linha
            telefônica).
            Apesar disso, o AMR não chegou a fazer muito sucesso, pois não oferece suporte a Plug-andplay, o que dificulta a instalação dos dispositivos por parte dos usuários e suporta apenas placas
            de som e modems, deixando de fora as placas de rede e outros dispositivos comuns atualmente.
            Pensando em resolver estas limitações vários fabricantes se reuniram para desenvolver o ACR,
            um padrão aberto que substitui o AMR com várias vantagens, mantendo o baixo-custo.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Analogue Video"
        p.meaning = """
            Vídeo Analógico, vídeo transmitido ou gravado na forma de sinais analógicos, como na TV ou
            numa fita de vídeo.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Anamorphic"
        p.meaning = """
            Este termo é usado em relação aos filmes em DVD. No cinema as telas são mais largas do que
            uma tela de TV. Para que seja possível assistir os filmes numa TV comum, os cantos da imagem
            devem ser cortados. O termo se refere a um vídeo que passou por essa formatação.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Anisotropic Filtering"
        p.meaning = """
            O anisotropic filtering melhora a qualidade das texturas aplicadas sobre superfícies inclinadas, o
            exemplo mais clássico é o texto de abertura dos filmes do StarWars. Em geral o efeito é melhor
            percebido em jogos de primeira pessoa, nas paredes e objetos mais próximos. Pense no
            Anisotropic Filtering como uma espécie de evolução dos velhos bilinear e trilinear filtering que
            encontramos nas configurações de quase todos os games.
            Essa imagem da ATI mostra bem o conceito, do lado esquerdo temos o texto aplicado usando o
            velho trilinear filtering e do lado direito temos o mesmo feito com nível máximo de qualidade do
            anisotropic filtering o que tornou o texto um pouco mais legível:
            A perda de desempenho é mais difícil de avaliar, pois os algoritmos usados tanto das placas da
            nVidia quanto nas placas da ATI são adaptativos, ou seja, eles utilizam um número de amostras
            proporcional ao ganho que pode ser obtido em cada cena. Isso faz com que a perda de
            desempenho seja maior nos jogos em que existe maior ganho de qualidade.
            É difícil traçar um padrão pois a perda de desempenho varia muito de game para game. Pode ser
            de 10% ou de 50% dependendo do título. A melhor técnica é simplesmente experimentar ativar
            o recurso e ver se você percebe uma melhora na qualidade ou perda perceptível no desempenho
            e depois pesar as duas coisas na balança.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Anodo"
        p.meaning = """
            Um dos componentes dos monitores CRT. Consiste em um eletrodo carregado com cargas
            positivas, que atraí cargas negativas, no caso os elétrons usados para criar a imagem.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Anonymous"
        p.meaning = """
            Nome normalmente utilizado para o login num servidor FTP, e indica tratar-se de um usuário
            anônimo, ou seja, não cadastrado na máquina em questão. A password a fornecer em seguida
            deve ser o e-mail do usuário. Em geral, usuários anônimos tem acesso a apenas alguns arquivos
            do servidor e não são todos os servidores que permitem o acesso.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ANSI"
        p.meaning = """
            American National Standards Institute, uma associação voluntária, formada por mais de 1.300
            membros, entre eles várias grande companhias. A ANSI se encarrega de estabelecer padrões
            para a indústria, compatibilizando linguagens de programação, protocolos de rede,
            especificações elétricas de vários componentes, etc. Entre as obras da ANSI está o padrão de caracteres ASCII.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Answer Mode"
        p.meaning = """
            Modo de resposta. Quando colocado neste modo, o modem é capaz de atender chamadas
            telefônicas, seja para receber faxes ou funcionar como uma secretária eletrônica, dependendo
            do programa instalado.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Anti-Aliasing"
        p.meaning = """
            Esta técnica permite suavizar os contornos em imagens, adicionando pontos de cores
            intermediários. O Anti-Aliasing é um recurso cada vez mais utilizado nos jogos 3D, com o
            objetivo de melhorar a qualidade de imagem, sobretudo ao se utilizar baixas resoluções. As
            placas da nVidia por exemplo oferecem o recurso de FSAA, que ao ser ativado, faz com que a
            placa renderize uma imagem 2 ou 4 vezes maior do que a que será exibida no monitor e em
            seguida diminua seu tamanho, aplicando um algoritmo de anti-aliasing, antes de exibí-la. Com
            isto as imagens ganham muito em qualidade.
            Usando FSAA 4x, é possível ter imagens a 640 x 480 com uma qualidade visual superior à obtida
            a 800 x 600 no mesmo jogo. Em compensação, como é preciso renderizar uma imagem 4 vezes
            maior, o desempenho da placa, e consequentemente o FPS cai a apenas um quarto do que seria
            obtido com o recurso desabilitado. Existem outras tecnologias que seguem o mesmo princípio,
            como por exemplo a SmootVision da ATI.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Apache"
        p.meaning = """O apache é um servidor Web extremamente popular, usado principalmente no Linux. A dupla é
bastante popular em servidores de páginas desde a popularização da Internet em 95 e segundo
muitas estatísticas é a mais usada em servidores Web atualmente, superando o Windows.
O Apache acompanha praticamente todas as distribuições Linux atuais. Uma vez instalado, basta
ativar o serviço "httpd" através do ntsysv, linuxconf, mcc, ou outra ferramenta disponível na
sua distribuição. Você pode usar ainda o comando "/etc/rc.d/init.d/httpd start".
A maior parte da configuração do Apache pode ser feita através de um único arquivo, o
httpd.conf, que pode ser encontrado no diretório "/etc/httpd/conf/" ou "/etc/apache". A
configuração mais importante neste arquivo é a porta TCP a ser usada pelo servidor, o default é
a porta 80.
O Apache também possui uma versão for Windows, que pode ser usada em substituição ao IIS
da Microsoft. Porém, devido à maneira como o Windows gerencia a geração de novos processos,
e threads, o desempenho da versão Windows do Apache não é o mesmo da versão for Windows.
As primeiras versões chegavam até mesmo a perder para o IIS em desempenho, mas os
desenvolvedores vêm fazendo um grande esforço para melhorar seu desempenho em ambiente
Windows. As versões atuais já são muito mais rápidas (embora ainda sejam mais lentas que no
Linux) e possuem uma segurança muito boa. Mesmo no Windows, o Apache é uma solução
muito interessante para quem quer fugir dos problemas de segurança do IIS e ao mesmo tempo
procura um servidor Web rápido. Você pode baixar o Apache for Windows no O Apache é compatível com PHP, Perl, CGI e até mesmo ASP, bastando para isso instalar os
módulos adequados. No caso do ASP é preciso utilizar o chiliasp, disponível em
http://www.chiliasp.com
O mais interessante é que apesar de todos os recursos o Apache é distribuído sobre a licença
GNU, ou seja, além de ser gratuíto, o código fonte está disponível para quem quiser estudar, ou
mesmo alterar o programa. http://www.apache.org/"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Aperture Grill"
        p.meaning = """
            Nos monitores CRT tradicionais é utilizada uma folha de metal com vários orifícios, chamada
            shadow mask, que tem a função de isolar as células de fósforo, impedindo que o feixe do canhão
            de elétrons destinada a cada célula atinja também as células vizinhas, o que deixaria a imagem
            borrada. No monitores Sony Trinitron é utilizado um outro método de separação, chamado de
            aperture grill. Ao invés de uma grade, temos vários fios metálicos verticais, presos entre sí nas
            bordas e por dois fios horizontais posicionados de forma a dividir a área em três partes iguais e
            evitar que os fios vibrem com facilidade, o que causaria distorções na imagem.
            Esta tecnologia permite que esta série de monitores tenham uma tela 100% plana, mas em
            compensação traz um pequeno inconveniente: os dois fios horizontais criam duas sombras
            bastante discretas que dividem a imagem em três partes. É possível notá-las facilmente
            colocando o brilho e contraste no máximo e visualizando uma imagem clara. Muitos não se
            importam com as sombras, mas outros não conseguem conviver com elas.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "API"
        p.meaning = """
            Application Programming Interface, um conjunto de funções e sub-rotinas usadas pelos
            programas que informam ao sistema operacional como executar determinada tarefa. Por
            exemplo, os jogos 3D são construídos com base no D3D, OpenGL ou Glide. De forma
            semelhante, qualquer programa for Windows, escrito em C++ ou qualquer outra linguagem,
            pode usar qualquer uma das mais de 1000 funções que abrem janelas, abrem ou gravam
            arquivos, e outras tarefas semelhantes. É o fato de usarem APIs diferentes que fazem os
            programas serem incompatíveis com outros sistemas operacionais.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Apollo"
        p.meaning = """
            Uma série de chipsets fabricados pela Via, que engloba chipsets destinados a vários
            processadores. O Apollo original era um chipset destinado ainda ao Pentium 1, pouco depois
            surgiu o Apollo Pro, destinado a placas para processadores Pentium II e Celeron. A série
            destinada a processadores Pentium III é composta pelos chipsets Apollo Pro 133, 133A e 266
            (com suporte a memórias DDR), com o reforço dos chipsets Apollo KX 266 e KT 266, destinados
            aos processadores Athlon e Duron, da AMD.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Appaloosa"
        p.meaning = """
            Esta será a terceira geração do AMD Duron, construída numa arquitetura de 0.13 mícron. A
            primeira geração foi o Duron Spitfire, que foi substituído pelo Duron Morgan, que trouxe suporte
            às instruções SSE e outras melhorias no desempenho, além de um consumo elétrico mais baixo.
            A terceira versão trará um consumo ainda mais baixo e será capaz de atingir frequências mais
            altas, próximas dos 2.0 GHz, graças à arquitetura de 0.13 mícron. Especula-se que a AMD
            poderá aproveitar para aumentar o cache do Duron para 256 KB, o que traria também um
            grande ganho de desempenho. O Duron Appaloosa será lançado na segunda metade de 2002.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Apple I"
        p.meaning = """A Apple foi fundada em 1976, depois que o projeto do Apple I foi recusado pela Atari e pela HP.
Uma frase de Steve Jobs descreve bem a história: "Então fomos à Atari e dissemos "Ei, nós
desenvolvemos essa coisa incrível, pode ser construído com alguns dos seus componentes, o que
acham de nos financiar?" Podemos até mesmo dar a vocês, nós só queremos ter a oportunidade
de desenvolvê-lo, paguem-nos um salário e podemos trabalhar para vocês. Eles disseram não,
fomos então à Hewlett-Packard e eles disseram "Nós não precisamos de vocês, vocês ainda nem
terminaram a faculdade ainda". O Apple I não foi lá um grande sucesso de vendas, vendeu
pouco mais de 200 unidades, mas abriu caminho para o lançamento de versões mais poderosas.
O Apple I usava um processador da Motorola, o 6502, que operava a apenas 1 MHz. O Apple I
vinha com 4 KB de memória, e saídas para teclado, terminal de vídeo e para uma unidade de
fita. Existia também um conector reservado para expansões futuras."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Apple II"
        p.meaning = """Apesar do começo difícil, o Apple I foi logo aperfeiçoado. Surgiu então o Apple II, lançado no
final da década de 70. Este sim fez um certo sucesso, apesar do preço salgado para a época,
US$ 1298, que equivalem a quase 9.000 dólares em valores corrigidos. O Apple II vinha com 4
KB de memória, como o primeiro modelo, a novidade foi uma ROM de 12 KB, que armazenava
uma versão da Basic. A memória RAM podia ser expandida até 52 KB, pois o processador
Motorola 6502 era capaz de endereçar apenas 64 KB de memória, e 12 KB já correspondiam à
ROM embutida. Um dos "macetes" naquela época era uma placa de expansão, fabricada pela
Microsoft (sim, eles já existiam naquela época :-), que permitia desabilitar a ROM e usar 64 KB
completos de memória. O Apple II já vinha com teclado e usava uma televisão como monitor. O
aparelho já vinha com uma unidade de fita K7, mas era possível adquirir separadamente uma
unidade de disquetes. Uma variação do Apple II, o Apple IIc, lançado em 79, é considerado por
muitos o primeiro computador portátil da história, pois tinha até um monitor de LCD como
opcional. Só faltavam mesmo as baterias"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Appliance"
        p.meaning = """
            A tradução mais simples para este tema é simplesmente "ferramenta". No mundo da
            informática, as Appliances são computadores pré-configurados para executar uma tarefa
            específica, como servir para compartilhar a conexão com a Web ou como um firewall para a
            rede, como um kiosque multimídia, como um sistema de caixa registradora e leitor de código de
            barras, um centro de multimídia, um centro de controle de um sistema de automatização
            doméstica e assim por diante. As possibilidades são quase infinitas.
            A chave para desenvolver uma boa Appliance é a facilidade de uso. É o tipo de dispositivo que
            deve ser o mais parecido possível com um eletrodoméstico, do tipo que o usuário simplesmente
            liga na tomada (ou na rede) e sai usando, sem precisar de nenhuma configuração complicada
            nem de treinamento. Esta é a diferença básica entre uma Appliance e um PC: o PC pode fazer
            muitas coisas, mas é complicado de usar, enquanto a Appliance é fácil de usar mas por outro
            lado só faz uma coisa.
            Ao contrário do que pode parecer, as Appliances nem sempre são dispositivos complicados de
            construir. Pelo contrário, na maioria das vezes temos um PC comum, montado em algum tipo de
            gabinete especial, acoplado num leitor de código de barras ou o que mais for necessário para
            executar suas tarefas, rodando uma instalação personalizada do Linux. Muitas mantém um
            servidor Apache ativo, para que o usuário possa fazer toda a administração via rede.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Applet"
        p.meaning = """
            Um pequeno programa que executa algumas tarefas numa Web Page. Os Applets podem ser
            feitas em várias linguagens, mas a mais utilizada é o Java. Estes pequenos programas são
            automaticamente instalados ao se acessar a página.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AppleTalk"
        p.meaning = """
            Um padrão primitivo de redes desenvolvido pela Apple para equipar o Macintosh original, na
            década de 80, mas que mais tarde acabou sendo usado em toda a sua linha de produtos. As
            interfaces AppleTalk eram muito baratas, mas em compensação transmitiam a apenas 230
            Kbits, o que era pouco até mesmo para a época. Em compensação existia uma grande
            versatilidade, já que as interfaces podiam ser utilizadas para ligar os Macs em rede sem custos
            adicionais. Atualmente os Macs incluem interfaces de rede Ethernet, o que permite ligá-los aos
            PCs mais facilmente.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "APM"
        p.meaning = """
            Advanced Power Management. Sistema avançado de gerenciamento de energia que permite
            diminuir o consumo elétrico do computador desligando o monitor e o HD sempre que o PC ficar
            ocioso durante o tempo mínimo configurado. Hoje em dia temos à disposição o ACPI, um modo
            de economia que oferece muito mais recursos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Archie"
        p.meaning = """
            Este é um serviço de busca de arquivos armazenados em servidores FTP. Os arquivos podem ser
            localizados por nome ou por uma palavra chave contida no arquivo (no caso de documentos de texto ou html). Foi importante no início da Internet, mas é um serviço pouco utilizado
            atualmente.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Arcnet"
        p.meaning = """
            A Arcnet é uma arquitetura de rede antiga, que existe desde a década de 70. É claro que de lá
            pra cá houveram avanços, mas não o suficiente para manter as redes Arcnet competitivas frente
            às redes Ethernet e outras tecnologias modernas. Para você ter uma idéia, as redes Arcnet são
            capazes de transmitir a apenas 2.5 mbps e quase não existem drivers for Windows para as
            placas de rede. Os poucos que se aventuram a usá-las atualmente normalmente as utilizam em
            modo de compatibilidade, usando drivers MS-DOS antigos.
            Atualmente as redes Arcnet estão em vias de extinção, você não encontrará placas Arcnet à
            venda e mesmo que as consiga, enfrentará uma via sacra atrás de drivers para conseguir fazêlas funcionar, isso se conseguir.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Argon"
        p.meaning = """
            Este é mais um nome exótico e pouco conhecido, mas é o nome código do projeto da AMD que
            atingiu maior sucesso até hoje, nada menos que o Athlon. O Argon, ou Athlon, divide-se em três
            arquiteturas, K7, K75 e Thunderbird.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Arpanet"
        p.meaning = """ARPA vem de Advanced Research Project Agency, uma instituição militar Americana que na
década de 50 abraçou um projeto ambicioso: interligar os computadores de várias bases
militares, centros de pesquisa e universidades. Nos primórdios da rede eram utilizados modems
e linhas telefônicas convencionais e a primeira comunicação bem sucedida foi conseguida
apenas em 69, com um simples "LO" (um hello incompleto). a partir daí o sistema passou a
evoluir cada vez mais rápido, tornando-se o embrião da Internet atual.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ARJ"
        p.meaning = """
            Um formato de compactação de arquivos bastante conhecido, mas não tão utilizado quando o
            ZIP. Alguns programas suportam ambos os formatos, é o caso por exemplo do Power Archiver,
            um programa gratuíto que permite compactar e descompactar arquivos em vários formatos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Artefact"
        p.meaning = """"Sujeiras" que aparecem em imagens escaneadas, filmes digitalizados, música, ou em qualquer
processo que exija uma conversão de analógico para digital. Além das interferências do
ambiente, existe o problema da falta de fidelidade do aparelho digitalizador, já que sempre
existe alguma perda na conversão."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Article"
        p.meaning = """
            Artigo, é geralmente usado em relação a uma mensagem postada em um grupo de discussão
            (newsgroup).
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ASCII"
        p.meaning = """
            American Standard Code for Information Interchange, é ainda o código de caracteres de texto
            mais usado. Cada caractere de texto ASCII ocupa 8 bits de dados (1 byte), o suficiente para 256
            combinações diferentes, que incluem caracteres, números e símbolos diversos. Na gíria, "ASCII"
            também é usado em relação a um arquivo de texto puro, sem formatação. Mais detalhes sobre
            o padrão ASCII podem ser vistos em: http://www.jimprice.com/jim-asc.htm O padrão mais atual
            que vem substituindo o ASCII gradualmente é o Unicode, onde são usados 2 bytes para cada
            caracter, permitindo o suporte a 65.000 caracteres e símbolos diferentes. A vantagem do
            Unicode é conter caracteres de várias línguas: Japonês, Chinês, etc.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ASCII Terminal"
        p.meaning = """
            Este é outro nome para os antigos terminais burros, que exibiam apenas texto, conectados a um
            servidor central, quase sempre rodando alguma versão do Unix. Geralmente a conexão era feita
            através de uma placa multiserial, já que uma porta serial é capaz de atender com folga a banda
            necessária para enviar texto para cada terminal. Apesar desta solução ainda ser suportada pelo
            Linux, não é vantajoso utiliza-la, já que por quase o mesmo valor poderíamos ligar os PCs em
            rede através de placas Ethernet e cabos de par trançado e ter terminais leves capazes de rodar
            aplicativos gráficos com um bom desempenho.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ASIC"
        p.meaning = """
            Application Specific Integrated Circuit, um processador construído para executar uma tarefa
            específica, ou seja, um processador dedicado. Exemplos de processadores dedicados são os
            coprocessadores aritméticos e os chipsets de vídeo.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ASP"
        p.meaning = """
            Active Server Pages, linguagem de programação para a Internet, que vem sendo bastante
            usada, por ter bons recursos e ser fácil de aprender se comparado a outras linguagens como o C.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ASP (2)"
        p.meaning = """
            Application Service Provider, empresa que vende softwares ou soluções para pequenas, médias e
            grandes empresas. Em alguns casos, um ASP também pode ser um órgão governamental ou mesmo uma entidade sem fins lucrativos, dedicada a dar suporte às empresas.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ASP +"
        p.meaning = """
            Também conhecida como Asp.Net, será a próxima geração da linguagem ASP. O .Net indica que
            a linguagem visa criar uma plataforma de desenvolvimento para os serviços .Net com os quais a
            Microsoft pretende aumentar sua participação na área de serviços ia Web. O ASP + possui vários
            recursos entre eles o suporte a código escrito em outras linguagens, como o Visual Basic, C++ e
            Perl. Os scripts em ASP + não são compatíveis com os em ASP, mas nada impede de rodar os
            dois tipos no mesmo servidor. A extensão dos arquivos ASP + é .ASPX
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ASPI"
        p.meaning = """
            Advanced SCSI Protocol Interface, interface desenvolvida pela Adaptec que se tornou padrão
            para placas SCSI. Não confundir com ASP, que é uma linguagem de programação para páginas
            Web.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Assembly"
        p.meaning = """
            O Assembly foi provavelmente a primeira linguagem de programação da história, surgida na
            década de 50, época em que os computadores ainda usavam válvulas. A idéia do assembly é
            usar um comando em substituição a cada instrução de máquina. A lógica continua sendo
            basicamente a mesma, a vantagem é usar comandos amigáveis ao invés de endereços binários.
            Outra facilidade trazida pelo assembly é o uso de variáveis, onde uma certo espaço de memória
            é reservado para um certo dado. É possível por exemplo criar a variável "Valor1", reservando 16
            bits da memória e armazenar nela um número qualquer. Durante o programa, sempre que
            desejar usar este número, basta chamar a variável Valor1 anteriormente criada. Como o
            compilador utiliza instruções específicas para o processador da máquina, é preciso desenvolver
            uma versão diferente da linguagem para cada sistema onde ela for ser utilizada.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Assembler"
        p.meaning = """Montador. Este é o programa que transforma o código escrito na linguagem Assembly em
linguagem de máquina, substituindo as instruções, variáveis pelos códigos binários e endereços
de memória correspondentes. Os compiladores de várias linguagens de alto nível fazem a
compilação dos programas em duas etapas, na primeira transformando o código fonte em código
Assembly e em seguida gerando o binário com a ajuda de um Assembler.
Um erro comum é usar o termo Assembler em substituição do Assembly, o que ocorre muito
freqüentemente, devido à semelhança dos termos. "Assembler" soa como uma tradução de
"Assembly" mas na verdade ambos são termos estrangeiros, com significados diferentes.
O termo também pode ser usado em relação a um "montador" de micros. Um "PC Assembler"
pode não ser um programa, mas sim um técnico de carne e osso (nem sempre bem pago :-) que
trabalha para algum integrador de PCs. """
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Assíncrono (Asynchronous)"
        p.meaning = """
            Transferências de dados em que os dispositivos envolvidos não são sincronizados. Exemplos são
            as antigas memórias EDO e FPM, que utilizavam tempos de espera para poderem acompanhar a
            placa mãe. Na prática, a velocidade da memória continuava sendo a mesma, apenas o módulo
            passava a responder a cada dois ou três ciclos ao responder a cada um. Atualmente este termo
            é usado também em relação a chips sem sinal de clock. Veja: Chips assíncronos
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AT"
        p.meaning = """
            Advanced Tecnology, como era chamado o 286 lançado pela IBM em 84 (na época fazia
            sentido :-) Hoje é mais usado para se referir a gabinetes que não usam fonte ATX.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ATA"
        p.meaning = """
            Esta é a especificação para as interfaces e discos rígidos IDE. O primeiro padrão foi o ATA-1, que
            incluía as interfaces PIO Mode 0, 1 ou 2, usadas em micros 386 e 486. O ATA-2 já incluía as
            interfaces PIO Mode 3 e PIO Mode 4, além de suportar o multiword DMA, que embora ainda não
            tão eficiente quanto o Ultra DMA suportado pelos HDs atuais, já agilizava a transferência de
            dados. As interfaces ATA-2 também são chamadas de EIDE ou Fast ATA.
            O ATA-3 foi uma revisão do ATA-2, que corrigiu alguns problemas e melhorou um pouco o
            desempenho do multiword DMA. Este padrão inclui as interfaces IDE Pio Mode 4 mais recentes,
            usadas as últimas placas 486 e nas primeiras placas para Pentium.
            O ATA 4 equivale ao Ultra DMA 33, o ATA 5 equivale ao UDMA 66 enquanto o ATA 6 equivale ao
            UDMA 100. Os três padrões também são chamados de respectivamente Ultra ATA 2, Ultra ATA 4
            e Ultra ATA 5.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ATA 33"
        p.meaning = """
            É o mesmo que UDMA 33, Ultra ATA 2 ou ainda ATA 4. São as interfaces IDE capazes de
            transmitir dados a 33 MB/s. Na prática as taxas máximas são um pouco menores, pois estes 33
            MB/s incluem sinais de modulação, controle e retransmissões, mas a grosso modo estas
            interfaces, geralmente encontradas em placas mãe fabricadas entre 97 e 99 são suficientes para
            utilizar HDs de 20 ou 30 GB sem perda de performance. Naturalmente é possível utilizar HDs
            maiores e mais rápidos, mas nestes casos a interface pode representar um gargalo,
            principalmente ao utilizar dois HDs na mesma interface IDE ou vários HDs ligados em RAID.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ATA 66"
        p.meaning = """
            O mesmo que UDMA 66, Ultra ATA 4 ou ainda ATA 5. Estas interfaces já são capazes de
            transmitir dados a 66 MB/s (um pouco menos na prática) e são geralmente encontradas em
            placas mãe fabricadas em 2000 e 2001. O desempenho é suficiente para os HDs fabricados até
            2001 e nos modelos de baixo/médio custo fabricados em 2002, mas pode ser um gargalo nos
            HDs topo de linha. Para ativar o ATA 66 é preciso que tanto o HD quanto a placa mãe suportem este modo e é
            necessário utilizar um cabo IDE de 80 vias. Caso um destes requisitos não seja cumprido, o HD
            operará em modo ATA 33.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ATA 100"
        p.meaning = """
            Este é o padrão de interfaces IDE predominante no final de 2001. O desempenho é suficiente
            mesmo para os HDs topo de linha atuais mas, claro, fatalmente vai tornar-se um gargalo nos
            HDs do futuro. Atualmente poucos HDs conseguem superar a marca de 30 MB de transferência
            interna (quando os dados são lidos pelas cabeças de leitura e transferidos), mas a taxa pode
            subir bastante ao ser utilizado cache de disco, onde uma pequena quantidade de dados é
            transferida na velocidade máxima suportada pela interface. É por isso que existe sempre algum
            ganho (apesar de muito pequeno) ao utilizar interfaces ATA 100 mesmo em HDs relativamente
            lentos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ATA 133"
        p.meaning = """
            Este é um novo padrão de interfaces IDE que vem sendo adotado por vários fabricantes
            (liderados pela Maxtor), onde a interface IDE é capaz de transferir dados a 133 MB/s. Assim
            como no ATA 66 e ATA 100 é preciso usar um cabo IDE de 80 vias, caso contrário a interface
            passa a operar em modo ATA 33. Estes cabos acompanham as placas mãe atuais e também
            podem ser comprados avulsos, por isso não são mais um problema. Algumas placas mãe e HDs
            fabricados partir do final de 2001 já oferecem suporte a este padrão, apesar do ganho de
            desempenho (por enquanto) ser mínimo ou nenhum.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ATAPI"
        p.meaning = """Advanced Technology Packet Interface, padrão que permite instalar CD-ROMs, Zips, drives de
fita e outros periféricos em interfaces IDE, que originalmente foram projetadas para acomodar
apenas discos rígidos. Um "ATAPI CD-ROM" nada mais é do que um drive de CD-ROM IDE."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Atary 800"
        p.meaning = """
            Este é mais um computador pessoal lançado no final da década de 70. Apesar de ser mais
            vendido como um video-game, o Atari 800 também podia ser usado como um computador
            relativamente poderoso, chegou a ser usado em algumas universidades.
            O Atary 800 foi o antecessor do Atari 2600, conhecido por aqui. Ele vinha de fábrica com 16 KB
            de memória RAM, que podiam ser expandidos para até 48 KB, com mais 10 KB de memória
            ROM. O sistema operacional era o Atari-OS, uma versão do Basic. Originalmente, o sistema
            vinha apenas com a entrada para os cartuchos, com o sistema operacional ou jogos, mas era
            possível adquirir separadamente uma unidade de disquetes e um teclado, que o transformavam
            num computador completo. Não existiram muitos programas para o Atari, o foco foram sempre
            os jogos, o principal uso do Atari como computador era de poder programar em Basic, por isso
            seu uso em escolas.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Atenuação (de sinal)"
        p.meaning = """
            A atenuação ocorre com qualquer sinal, tanto digital quanto analógico, transmitido através de
            cabos. Quanto maior for o comprimento do cabo, maior é a atenuação, até o ponto do sinal
            tornar-se fraco a ponto de não ser mais entendido pelo destinatário. De uma forma geral, os
            sinais analógicos podem ser transmitidos a distâncias mais altas que os digitais, pois utilizam
            uma grande gama de frequências, enquanto os sinais digitais trabalham apenas com dois sinais
            distintos (os bits 1 e 0, representados por diferentes tensões elétricas). Isso explica por que nas
            redes Ethernet, onde são usados cabos próprios para redes a distância máxima é de 100 metros
            (usando cabos de par trançado) ou 185 metros (usando cabos coaxiais) enquanto em
            tecnologias como o ADSL, onde os sinais são modulados e transmitidos na forma de um sinal
            analógico é possível atingir distâncias de vários quilômetros, mesmo usando fios telefônicos
            comuns, de qualidade muito mais baixa que os cabos de rede.
            Em compensação, o ADSL é uma tecnologia muito mais cara que o padrão Ethernet e a
            velocidade de transmissão é de apenas 8 megabits a até 300 metros ou 2 megabits a até 3 KM,
            enquanto as redes Ethernet já ensaiam a migração do Gigabit para o 10 Gigabit Ethernet.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Athlon"
        p.meaning = """Do K6 ao K6-3, pouca coisa mudou na arquitetura dos processadores AMD. O K6-2 trouxe as
instruções 3D-Now! Enquanto o K6-3 ganhou um cache L2 que trabalha na mesma frequência do
processador e passou a utilizar o cache encontrado na placa mãe aproveitado na forma de um
cache L3.
Foram melhoradas também as técnicas de produção, o que permitiu o lançamento de
processadores trabalhando à frequências mais altas. O núcleo do processador, assim como o
coprocessador aritmético porém, não foram mudados em praticamente nada. Basicamente foram
adicionados apenas alguns "acessórios" ao K6, que o tornaram mais rápido.
Durante muito tempo, a AMD prometeu um novo processador, onde fosse solucionado o velho
problema de desempenho dos processadores AMD em aplicativos gráficos e que finalmente fosse
capaz de apresentar um desempenho igual ou superior a um processador Intel equivalente em
todos os aplicativos. Quando finalmente foi lançado, o K7 como era chamado até então passou a
ser chamado de Athlon.
O Athlon é seguramente o projeto mais bem sucedido da AMD e passou por uma grande
evolução desde a primeira versão. A primeira geração ainda era fabricada numa técnica de 0.25
mícron e usava cache L2 externo. A segunda geração, chamada K75 já utilizava uma técnica de
0.18 mícron e foi capaz de atingir frequências de até 1.0 GHz. A terceira geração é o Athlon
Thunderbird, onde o cache L2 foi incorporado ao processador. A geração atual é o Athlon
Palomino que incorporou mais alguns recursos que melhoraram o desempenho do processador e
diminuíram seu consumo elétrico. O core Palomino é utilizado nos processadores Athlon XP,
Athlon MP e Athlon 4 (para notebooks). A próxima geração será o Athlon Thoroughbred, que será
produzido numa arquitetura de 0.13 mícron, seguido pelo Athlon Barton."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Athlon 4"
        p.meaning = """
            Esta é uma versão de baixo consumo do Athlon XP destinada a notebooks. A arquitetura é
            exatamente a mesma (core Palomino, 0.18 mícron), mas o processador opera a frequências mais baixas, utiliza tensão mais baixa e possui o sistema PowerNow!, que ajusta dinâmicamente
            a frequência de operação do processador de acordo com a demanda dos aplicativos, tudo para
            economizar o máximo possível de energia.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Athlon 64"
        p.meaning = """
            Esta é a versão desktop do Hammer, o processador de 64 bits da AMD que será o sucessor do
            Athlon. Embora seja um processador de 64 bits, o Athlon 64 mantém compatibilidade com os
            aplicativos de 32 bits atuais, basicamente o Athlon 64 é um processador de 32 bits, com uma
            arquitetura semelhante à do Athlon, com registradores e instruções extras, que o transformam
            num processador de 64 bits completos. Estas partes extras podem ser ativadas ou desativadas
            de acordo com o software que estiver sendo utilizado no momento.
            Ao rodar aplicativos de 32 bits ele oferece um desempenho um pouco superior ao de um Athlon
            do mesmo clock, graças ao controlador de memória integrado e outras otimizações. O Hammer
            possui dois estágios de pipeline a mais que o Athlon, o que permite que ele atinja frequências de
            operação um pouco mais altas. Ou seja, ao rodar aplicativos de 32 bits ele é um passo
            evolucionário, não uma revolução.
            As possibilidades de ganhos de desempenho mais expressivos surgem ao rodar aplicativos de 64
            bits. Neste caso o programa passa dispor de mais registradores (áreas de memória ultra rápida
            dentro do processador, uma espécie de cache nível 0) e possibilidade de endereçar quantidades
            muito maiores de memória RAM.
            Naturalmente estas vantagens não se aplicam a todos os tipos de programas de forma uniforme.
            Um bando de dados de grande por pode ter um ganho de desempenho fabuloso, enquanto um
            aplicativo de escritório pode apresentar um desempenho pouco superior ao de sua versão de 32
            bits.
            A aposta do Athlon 64 é oferecer uma plataforma que possa ao mesmo tempo rodar os
            aplicativos de hoje com um desempenho competitivo quanto rodar os aplicativos de 64 bits de
            amanhã. É uma vantagem estratégica sobre o Pentium 4, que apesar de atingir clocks mais
            altos, continua sendo um processador de 32 bits.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Athlon MP"
        p.meaning = """
            Esta é a série do Athlon baseada no core Palomino que oferece suporte a multiprocessamento.
            Na verdade, o Athlon XP também suporta multiprocessamento, mas a AMD incluiu uma trava
            nestes processadores que impede que sejam usados em sistemas SMP, para evitar que
            prejudicassem as vendas do Athlon MP, que é consideravelmente mais caro. Apesar disso, os
            Duron com core Morgan (que é baseado no Palomino) não possuem a trava, o que permite usálos em sistemas dual de baixo custo.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Athlon XP"
        p.meaning = """
            Uma versão do Athlon baseada no core Palomino, lançada pela a AMD em Outubro de 2001. O
            XP vem de "Extreme Performance", mas ficou óbvio que a idéia era pegar carona no lançamento
            do Windows XP da Microsoft. O Athlon XP marcou a volta do índice de desempenho nos
            processadores AMD. Apesar do motivo ser justo, já que o Pentium 4 é capaz de operar a
            frequências muito mais altas que o Athlon, apesar de acabar perdendo na maioria dos casos, a
            iniciativa causou uma certa polêmica entre os usuários. As versões iniciais do Athlon XP foram: 1500+ (1.33 GHz), 1600+ (1.4 GHz), 1700+ (1.46 GHz),
            1800+ (1.5 GHz) e 1900+ (1.6 GHz). Por ser baseado no core Palomino o Athlon XP é mais
            rápido que um Athlon Thunderbird da mesma frequência, um XP de 1.33 GHz ganha facilmente
            de um Thunderbird de 1.4 GHz por exemplo.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ATM"
        p.meaning = """Uma tecnologia de transmissão de dados que divide o fluxo de dados a serem transmitidos em
pequenos blocos de 53 bytes cada um. Estes blocos são chamados de células, e podem ser
processados de forma assíncrona. Entre várias outras aplicações, o ATM é usado nos sistemas
ISDN e ADSL de acesso rápido à Internet. No Speedy, o serviço de acesso via ADSL oferecido
pela Telefonica, o termo ATM ganha um outro significado, pois é usado em relação às instalações
antigas, onde cada cliente possui um IP fixo. Nas instalações mais recentes, o sistema passou a
ser chamado de "megavia" e os usuários passaram a utilizar IP dinâmico, mas em compensação
podem escolher entre um número maior de provedores."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ATX"
        p.meaning = """
            O padrão de design para as placas e gabinetes modernos, prevê medidas definidas para as
            placas mães, gabinetes e modificações na fonte de alimentação. Atualmente, quase todos os
            gabinetes e fontes vendidos são ATX. Uma placa mãe ATX não pode ser instalada em um
            gabinete AT antigo. Existem ainda as placas Mini-ATX e Flex-ATX
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ATX12V"
        p.meaning = """
            Este é um novo padrão de fontes de alimentação desenvolvido pela Intel para uso em conjunto
            com o Pentium 4. As fontes ATX12V possuem em conector adicional de 4 pinos, que deve ser
            encaixado na placa mãe, junto com o conector de força principal. Este segundo conector reforça
            a saída de 12V da fonte, assegurando que o processador sempre tenha energia suficiente para
            funcionar com estabilidade, mas ao mesmo tempo impede que sejam utilizadas fontes ATX
            comuns.
            A Asus e a Tyan (seguidos por outros fabricantes) apareceram então com um padrão alternativo,
            onde a placa mãe traz um conector para um dos plugs de alimentação da fonte (os mesmos
            utilizados pelo HD e CD-ROM) que pode ser usado no lugar do conector ATX12V, permitindo que
            os usuários utilizem fontes ATX comuns em conjunto com suas placas para P4, se necessário.
            Mais recentemente a Tyan começou a produzir algumas placas que dispensam completamente o
            segundo conector, operando apenas com o conector ATX padrão.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AU"
        p.meaning = """
            Formato de arquivo de som sem compressão tradicionalmente usado por programas UNIX/Linux,
            mas também adotado como formato de áudio padrão para a linguagem Java. Os arquivos AU (de
            audio) utilizam a extensão .au.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AUI"
        p.meaning = """
            Este é um conector de 15 pinos, semelhante ao conector do joystick da placa de som,
            encontrado em algumas placas de rede antigas. Este conector se destina à conexão com cabos
            coaxiais 10Base5, um padrão anterior aos atuais cabos 10Base2, onde o cabo é mais grosso com
            quase 1 centímetro de diâmetro e as estações são conectadas através de transceptores. Este tipo
            de rede, camada Thicknet não é mais utilizada atualmente, pois é uma arquitetura cara e pouco
            eficiente.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "AVI"
        p.meaning = """
            É a extensão usada por vários formatos de vídeo. A sigla vem de "Audio Video Interleave". Os
            arquivos AVI podem conter vídeo e áudio em vários formatos, que vão de vídeo sem compressão
            ao Divx, passando pelo MPEG 2 e outros formatos. Além do vídeo, o áudio também pode ser compactado, em MP3 por exemplo. Para assistir o vídeo, é necessário ter instalado o codec
            adequado, mas normalmente os players suportam vários formatos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Avatar"
        p.meaning = """
            Um personagem que representa você em um meio digital qualquer, como num jogo ou mesmo
            num chat com este recurso. A palavra vêm do Sânscrito.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "B2B"
        p.meaning = """
            Business to Business, negócios entre empresas, envolvendo produtos, serviços ou parcerias. Este
            termo é mais usado em relação aos sites que promovem este tipo de comércio, oferecendo toda
            a praticidade e infra-estrutura necessária, cobrando em troca uma mensalidade ou comissão
            sobre as transações.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "B2C"
        p.meaning = """
            Back to Mon (de volta pra mamãe), gozação que descreve o triste fim de muitas empresas
            pontocom depois que a bolha especulativa finalmente estourou.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BABT"
        p.meaning = """
            British Approval Board for Telecommunications, um selo de aprovação para modems que existe
            na Inglaterra, uma espécie de controle de qualidade, como o selo de pureza do café que temos
            por aqui
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Backbone"
        p.meaning = """
            Links de alta velocidade, usados geralmente como a espinha dorsal de grandes redes. A Internet
            é formada por inúmeros backbones que interligam as redes de universidades, empresas,
            provedores de acesso, etc. A organização lembra muito nosso sistema circulatório, onde as veias
            e artérias (backbones) se dividem em vários capilares. Estas divisões são feitas através de
            roteadores, que dividem o link do backbone em vários links mais estreitos (conexões Ethernet de
            100 megabits por exemplo) que podem novamente ser divididas através de novos roteadores, ou
            dispositivos mais baratos, como hubs. Na outra ponta está o usuário, que geralmente recebe um
            link de 256 kb, ou mesmo uma simples conexão via modem.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Backdoor"
        p.meaning = """
            Porta dos fundos. É uma porta aberta no sistema, não documentada, que permite ao criador ter
            acesso a ele (legitimamente ou não). As backdoors podem ser criadas tanto pelo responsável,
            como um meio de acesso emergêncial ao sistema, quanto por alguém interessado em invadi-lo,
            roubar informações etc. Neste último caso, o meio mais usado é convencer algum usuário do
            sistema a executar o programa que abrirá a backdoor, enviando-o via e-mail com algum
            estratagema, uma comunicação do chefe, um jogo, etc.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Background Process"
        p.meaning = """
            É usado em relação a um programa que está sendo executado em segundo plano, sem receber
            comandos do usuário. Este recurso é muito usado quando se opera o Linux em modo texto. É
            possível deixar a compactação de um grande arquivo, ou outra tarefa demorada sendo
            executada em background enquanto trabalha-se em outra coisa. Alguns processos ficam em
            background sem nunca solicitar comandos ao usuário (alguns daemons por exemplo), enquanto
            a maioria fica em background apenas temporariamente
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Backlight"
        p.meaning = """
            Encontrada em monitores LCD, e telas de cristal líquido em geral é uma fonte de luz nos cantos
            ou atrás da tela, que permite ver a imagem no escuro, além de melhorar bastante o contraste e
            brilho da imagem.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Back Office"
        p.meaning = """
            Uma suíte de aplicativos da Microsoft voltada para o mercado empresarial. Não confundir com o
            Trojam Back Orifice.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Back-Orifice"
        p.meaning = """
            Trojan bastante famoso, que uma vez instalado no micro da vítima, abre a máquina a acesso
            externo, permitindo quase tudo, até mesmo ejetar CDs ou resetar o micro remotamente. O BackOrifice opera de uma forma muito semelhante aos programas de administração remota, com
            possibilidade de alterar a porta TCP escutada pelo programa, ou mesmo estabelecer uma senha
            de acesso, tanto que algumas pessoas chegam a utiliza-lo para tal. O problema é que o BO não
            dá nenhum aviso ou advertência ao usuário e é difícil de detectar uma vez ativo. A menos que o
            executável seja alterado, ele aceitará comunicações de qualquer um através da porta 31337. Ou
            seja, basta que alguém mal intencionado faça uma varredura de portas em algumas centenas de
            micros para encontrar alguns com o BO server ativo e começar a brincar, ou então enviar o
            executável, que possui pouco mais de 100 kb para algumas vítimas escolhidas, usando um
            estratagema qualquer e esperar que algumas executem o arquivo.
            O programa foi desenvolvido por um grupo de crackers chamado Cult of the Dead Cow
            Communications, encontrado no endereço http://www.cultdeadcow.com/
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Backslash"
        p.meaning = """Barra invertida, a tecla \ do teclado. "Slash" é a barra comum, usada em urls e na estrutura de
diretório do linux, "coma" é um espaço e "dot" é um ponto. "Dot slash" é o "./", usado para
executar arquivos no prompt do Linux."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Backup"
        p.meaning = """
            Cópia de segurança. Copiar dados em um meio separado do original, de forma a protegê-los de
            qualquer eventualidade. Essencial para dados importantes.
            Os backups podem ser feitos em vários tipos de mídias, incluindo CDs graváveis ou regraváveis,
            fitas DAT, ou até mesmo um segundo HD. Cada tecnologia oferece seus prós e contras, as fitas
            DAT por exemplo oferecem uma grande capacidade e um custo por megabyte muito baixo, mas
            em compensação o drive é muito caro, os CDs são muito baratos, mas não armazenam uma
            grande quantidade de dados e assim por diante. A melhor opção varia de acordo com a
            quantidade de dados, a regularidade dos backups, o nível de confiabilidade necessário e o
            quanto pode ser investido.
            Além do backup total, simplesmente copiar todos os dados, existe o backup incremental, que
            consiste em copiar apenas os arquivos que foram alterados desde o último. Praticamente todos
            os programas de backup suportam esse recurso, descobrindo quais arquivos foram alterados
            através do número de bytes ou dos atributos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Backside Bus"
        p.meaning = """
            É o barramento rápido que conecta o núcleo do processador ao cache L2 em processadores que
            trazem cache L2 incluído no cartucho do processador, mas composto de chips separados, como
            nos processadores Pentium II e nos processadores Pentium III e Athlon em formato de cartucho.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Balanceamento de carga (load balancing)"
        p.meaning = """
            Hoje em dia, praticamente todos os grandes sites e portais armazenam suas páginas em algum
            tipo de sistema de banco de dados, que monta as páginas dinâmicamente, sempre que
            solicitadas pelos clientes, juntando um conjunto de registros. Enquanto o site tiver pouco
            tráfego, digamos umas 20 ou 30 mil pageviews por dia, provavelmente um único servidor, de
            configuração média dará conta do recado sozinho. Mas, imagine que derrepente a audiência
            deste site aumentou muito, foi para 5 milhões de pageviews por dia, que é o que um grande
            portal costuma ter. Provavelmente, um único servidor, mesmo que tenha 2 ou 4 processadores,
            não vai dar conta de todo este tráfego.
            Entra em cena então a idéia de balanceamento de carga, onde vários servidores ligados em rede
            dividem entre sí as requisições. Temos então uma ou várias máquinas que cuidam de repartir as
            requisições entre os servidores, de modo que cada um cuida de parte das requisições e envia de
            volta as páginas prontas, que serão enviadas aos usuários.
            Todos os servidores mantém uma cópia integral de todos os dados do site, já que de qualquer
            forma cada servidor precisará de todos os dados para atender as requisições que chegarem até
            ele. Um software de controle se encarrega então de sincronizar os dados entre os servidores
            automaticamente. Caso algum dos servidores precise ser desligado, seja por alguma falha, ou então para algum tipo de manutenção, os outros continuam trabalhando normalmente. Ao
            voltar, o programa de controle sincroniza o servidor com os demais e ele volta à ativa.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bandwidth"
        p.meaning = """
            Largura de banda, se refere à capacidade de transmissão de uma rede ou um tipo qualquer de
            conexão. A largura de banda de uma conexão via modem é de 56 Kbits :-) Este termo pode ser
            usado também com relação à quantidade de dados que podem ser transferidos através de uma
            interface num determinado período de tempo. Por exemplo, um slot AGP 1X trabalha a 66 MHz e
            32 Bits por transferência, resultando numa banda de 266 MB por segundo.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Banias"
        p.meaning = """
            Apesar do nome exótico, o Banias vem sendo levado bastante a sério pelos projetistas da Intel.
            Todos os chips Intel atuais, Pentium III, Pentium 4 e Celeron são chips destinados a apresentar
            um bom desempenho, sem muita preocupação com o consumo elétrico. Esta é uma boa
            estratégia quando se está desenvolvendo processadores para micros de mesa, onde um bom
            cooler resolve, mas é uma grande desvantagem em se tratando de notebooks, que são
            alimentados por baterias e devem ser o mais compactos possível.
            A idéia do Banias é um chip que concorra diretamente com o Crusoé da Transmeta e o C3 da
            Via, impedindo que eles abocanhem uma parte muito grande de um mercado que hoje é
            dominado pela Intel.
            Inicialmente acreditava-se que o Banias seria um projeto novo, desenvolvido com o objetivo de
            apresentar uma melhor relação consumo/desempenho, mas recentemente a Intel divulgou que
            desistiu da idéia e resolveu construí-lo com base na arquitetura do Pentium III. O projeto ainda
            está em estágios iniciais, por isso o chip será lançado apenas em 2003.
            É complicado pensar com um ano e meio de antecedência, mas imaginando o mercado a que o
            chip se destina, é compreensível que a Intel aproveite a arquitetura do Pentium III. Veja que o
            Banias é um chip destinado a notebooks ultra compactos, onde é mais importante um
            processador econômico e que dissipe pouco calor do que um monstro de 5 GHz. Fora o Crusoé e
            o Cyrix C3, qual é o processador mais econômico atualmente? Se respondeu que é o mobile
            Pentium III (ou mobile Celeron, já que a arquitetura é a mesma) você acertou.
            Um problema é que a arquitetura do Pentium III não oferece uma elasticidade tão grande em
            termos de frequência de operação quanto o Pentium 4 ou o Athlon, mas novamente, voltamos ao
            ponto do baixo consumo elétrico, que é a prioridade neste caso, aliado a um custo de
            desenvolvimento igualmente baixo, já que estão reciclando e não criando nada novo.
            Este chip coexistirá com a versão mobile do Pentium 4, que será lançada futuramente.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Banner"
        p.meaning = """
            Faixa. Atualmente é usado com relação às propagandas encontradas na Internet. Uma imagem
            retangular que quando clicada leva ao site do anunciante. Antigamente os banners eram aqueles
            impressos com letras garrafais, impressos em folhas de formulário contínuo, gerados por alguns
            programas.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Barton"
        p.meaning = """
            O AMD Barton, que deverá ser lançado no final de 2002 será um Athlon Turbinado, que graças
            ao uso do SOI provavelmente chegará perto da casa dos 3.5 GHz, produzido numa técnica de
            0.13 mícron. O SOI é uma tecnologia desenvolvida pela IBM, que permite usar uma camada
            mais fina de silício na produção dos transístores do processador, o que melhora a estabilidade
            dos sinais elétricos e diminuir a resistência elétrica dos materiais. Isso se traduz num menor
            consumo elétrico e na possibilidade do processador trabalhar com estabilidade a frequências
            mais altas.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bash"
        p.meaning = """
            O bash é um dos interpretadores de comandos do Linux. A sigla vem de "Bourne Again Shell",
            enfatizando que o Bash é uma versão aperfeiçoada do interpretador Bourne. Um interpretador
            de comandos é pequeno um programa que interpreta os comandos dados pelo usuário e os
            executa. No MS-DOS por exemplo, o interpretador de comandos é o Command.com. Apesar do
            Bash ser atualmente o interpretador de comandos para Linux mais usado, ele não é o único.
            Existem vários outros interpretadores, com pequenas diferenças nos recursos, comandos ou nas
            sintaxes.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BASIC"
        p.meaning = """Beginner's All-purpose Symbolic Instruction Code. O BASIC é uma linguagem de programação
voltada para principiantes, desenvolvida durante os anos 60. Praticamente todos os primeiros
computadores pessoais lançados durante a década de 70 traziam compiladores BASIC. Os
programas em BASIC são construídos através da combinação de comandos simples, baseados
em palavras do Inglês e rodam linha a linha, à medida que são "traduzidos" para linguagem de
máquina pelo interpretador. Os compiladores BASIC atuais são bem mais rápidos e mais flexíveis
que os desta primeira geração e, apesar de ainda não serem tão rápidos quanto programas em
C, já são capazes de fazer praticamente tudo que é possível em outras linguagens Um exemplo
de linguagem popular atualmente que é baseada no BASIC é o Visual Basic da Microsoft."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Baud"
        p.meaning = """Este é mais um termo relacionado a modems, que indica o número de vezes que o tom muda
numa ligação via modem. Os primeiros modems, de até 1.200 bips, trabalhavam com apenas
duas tonalidades, um som mais alto representava um bit 1, enquanto um som mais baixo
representava um bit 0. Nestes modems, o número de bauds representava o número de bits que
era possível transmitir por segundo. Naquela época, dizer "modem de 1200 bips" ou "modem de
1200 bauds" era a mesma coisa. Atualmente, os modems utilizam uma modulação muito mais
sofisticada, transmitindo vários bits em cada baud. Os modems de 14.400 bips por exemplo,
transmitem a apenas 2.400 bauds."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Baud Rate"
        p.meaning = """
            Uma medida de velocidade para modems. Indica o número de bauds, ou seja de sinais sonoros
            transmitidos por segundo. Não corresponde à taxa de transmissão em bits, pois nos modems
            atuais cada baud transporta vários bits.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BBUL"
        p.meaning = """Este é um novo encapsulamento para processadores desenvolvido pela Intel. O nome vem de
"Bumpless Build-Up Layer", uma designação que enfatiza a principal característica, que é a
inexistência de pontos de solda (bumps) entre o processador e o encapsulamento.
Nos encapsulamentos atuais, o waffer de silício (onde é construído o processador) é montado
sobre uma camada de cerâmica, metal ou mesmo algum tipo de plástico resistente. O objetivo
do encapsulamento é naturalmente proteger o processador e tornar seus contatos acessíveis.
Porém, por melhor que seja o encapsulamento, ele sempre aumenta a distância entre o
processador e o chipset, adiciona instabilidade na forma de pontos de contato imperfeitos, e
assim por diante.
Atualmente, tanto a Intel quanto a AMD (a partir do Athlon XP) utilizam o encapsulamento OLGA
em seus processadores, onde é usado um tipo de plástico ultra-resistente ao invés de cerâmica.
Como o plástico é um material muito mais fácil de trabalhar, é possível produzir um
encapsulamento "sob-medida" parta o processador, com um nível de imperfeições reduzido ao
mínimo. Estima-se que graças à nova estrutura o Athlon XP será capaz de atingir frequências
até 20% maiores do que seria possível com o encapsulamento antigo, de cerâmica.
A Intel pretende agora dar o próximo passo, com o BBUL. A idéia é que ao invés de "encaixar" o
processador no encapsulamento, o encapsulamento "cresça" em torno do processador, criando
uma estrutura virtualmente perfeita, como se ambos formassem uma única estrutura, com a
vantagem adicional de ser muito mais flexível, permitindo criar encapsulamentos com vários
processadores, entre outras possibilidades. Seria um sistema parecido com o que o nosso
organismo usa para construir e reparar nossos ossos, ir depositando pequenas quantidades de
cálcio até ter um osso completo.
Segundo a Intel, com a ajuda da nova tecnologia será possível produzir processadores com mais
de 1 bilhão de transístores, que serão até 10 vezes mais rápidos que os processadores atuais,
considerando dois chips do mesmo clock, sem falar das possibilidades de produzir processadores
operando à frequências mais altas, que surgirá com o avanço da tecnologia. O primeiros
processadores com o novo encapsulamento estão previstos para 2006 ou 2007."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BBS"
        p.meaning = """
            Bulletin Board Service. Os primeiros serviços online, bem antes da Internet, onde a conexão era
            feita via modem, na época ainda modelos de 1200 ou 2400 bips. Os servidores eram em geral
            PCs comuns, com algumas poucas linhas de telefone que mantinham um grupo de discussão,
            arquivos para downloads e jogos online no caso dos maiores. Alguns BBS chegaram a ter mais
            de 5.000 usuários, como no caso do Mandic e do STI. Mas, mesmo nestes casos bem sucedidos,
            os BBSs formavam comunidades isoladas e por isso entraram em extinção quando o acesso à
            Internet começou a tornar-se popular.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BBS (2)"
        p.meaning = """
            BIOS Boot Specification. Este é um recurso suportado por praticamente todos os BIOS
            encontrados nas placas mãe atuais. Através do BBS é possível estabelecer no Setup a ordem em
            que BIOS procurará o sistema operacional, ordenando todos os dispositivos disponíveis, como
            HD, CD-ROM, rede, disquete, Zip, etc. A vantagem deste sistema sobre a antiga seleção de ordem de procura do boot que tínhamos à
            disposição desde os antigos 386 é que caso o carregamento do sistema operacional encontrado
            no primeiro dispositivo (o HD por exemplo) falhe por qualquer motivo o BIOS assumirá de volta
            o controle e tentará carregar o sistema a partir do segundo dispositivo da lista (o CD-ROM por
            exemplo) e assim por diante, até que consiga carregar algum sistema operacional ou caso as
            opções acabem.
            Graças ao BBS o sistema não fica mais travado tentando carregar o sistema a partir do disquete
            ou CD-ROM quando a mídia não possui sistema operacional algum.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BEDO"
        p.meaning = """
            Lançadas depois das memórias EDO, mas antes das SDRAM usadas atualmente, as memórias
            BEDO utilizam uma espécie de Pipeline para permitir acessos mais rápidos. Em um Bus de 66
            MHz, as memórias BEDO são capazes de funcionar com temporização de 5-1-1-1, quase 30%
            mais rápido que as memórias EDO convencionais, que trabalham a 5-2-2-2. O mais interessante
            é que o custo de produção das memórias BEDO era praticamente o mesmo das memórias EDO e
            FPM. O maior impedimento à popularização das memórias BEDO foi a falta de suporte por parte
            dos chipsets Intel, que suportavam apenas memórias EDO e SDRAM. No final, as sucessoras das
            memórias EDO acabaram sendo as memórias SDRAM, que apesar de um pouco mais caras,
            oferecem uma performance levemente superior às BEDO e desfrutam de compatibilidade com
            todos os chipsets modernos. Na verdade, as BEDO nunca foram utilizadas em larga escala.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Benchmark"
        p.meaning = """
            Medidor de desempenho. São programas usados para medir o desempenho de um computador,
            seja em processamento bruto, como por exemplo o número de instruções de ponto flutuante que
            são processadas por segundo, quanto o desempenho dentro de algum aplicativo em especial.
            Existem atualmente inúmeros programas de benchmark como o SPECmark, Linpack, etc. Alguns
            benchmarks de boa qualidade para medir o desempenho de micros PC podem ser baixados em:
            http://www.ziffdavis.com/
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BeOS"
        p.meaning = """
            O BeOS é um sistema operacional desenvolvido pela Be Inc. desde o início da década de 90. A
            idéia foi desde o início desenvolver o sistema a partir do zero, sem nenhum tipo de software de
            legado que pudesse atrapalhar o desempenho ou a estabilidade do sistema, como temos por
            exemplo no Windows 95/98/SE/ME, que ainda mantém uma grande quantidade de código de 16
            bits herdado do Windows 3.1.
            Com esta diretriz, os desenvolvedores ficaram livres para explorar novas idéias e acrescentar
            recursos inéditos ao sistema, que tornou-se uma plataforma bastante sólida para aplicativos
            multimídia, com um bom gerenciamento de memória, um sistema de arquivos capaz de
            gerenciar partições de vários terabytes e um bom desempenho.
            Inicialmente o BeOS rodava no BeBox, uma plataforma proprietária que logo foi descontinuada,
            conforme o BeOS foi portado primeiro para os Macs e em seguida para micros PC.
            O grande problema do BeOS foi sempre a falta de aplicativos, o que manteve o sistema restrito a
            um pequeno grupo de usuários. Para tentar impulsionar a popularização do sistema, a Be
            começou a oferecê-lo gratuitamente para uso pessoal, mas nem mesmo isso deu muito resultado, pois já existiam então concorrentes livres como o Linux e o Free BSD, que já
            possuíam uma lista de aplicativos bem mais extensa que a do BeOS.
            A Be acabou sendo comprada pela Palm em 2001, que está utilizando a tecnologia no
            desenvolvimento do PalmOS 5, que será utilizado na próxima geração de Palms, que serão bem
            maios poderosos e baseados em chips ARM.
            Apesar disso, o BeOS ainda conta com muitos usuários fiéis, que prometem manter o
            desenvolvimento do sistema.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Beowulf"
        p.meaning = """
            Os Clusters Beowulf são formados por vários computadores interligados em rede. Não é
            necessário nenhum hardware sofisticado, um grupo de PCs de configuração mediana ligados
            através de uma rede Ethernet de 100 megabits já são o suficiente para montar um cluster
            beowulf capaz de rivalizar com muitos supercomputadores em poder de processamento. A idéia
            é criar um sistema de baixo custo, que possa ser utilizado por universidades e pesquisadores
            com poucos recursos.
            O primeiro cluster beowulf foi criado em 1994 na CESDIS, uma subsidiária da NASA e era
            formado por 16 PCs 486 DX-100 ligados em rede. Para manter a independência do sistema e
            baixar os custos, os desenvolvedores optaram por utilizar o Linux.
            Estes clusters não servem para processar dados em tempo real (um game qualquer por
            exemplo), mas apenas para processar grandes quantidades de dados, que podem ser quebrados
            em pequenas partes e divididos entre os vários computadores. Uma área onde são populares é
            na aplicação de efeitos especiais e renderização de imagens para filmes de cinema. Há inclusive
            casos de filmes como Shrek e Final Fantasy que foram feitos inteiramente em clusters beowulf.
            Veja também: Cluster
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bezel"
        p.meaning = """
            Termo em Inglês, usado para descrever o painel de plástico frontal, encontrado em drives de
            disquetes, CD-ROMs e outros drives que são encaixados nas baias do gabinete.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BGA"
        p.meaning = """Ball Grid Array. Este é um tipo de conexão de microchips muito usado atualmente, onde o chip
possui pequenos pontos de solda na sua parte inferior, que são soldados diretamente na placa
mãe. O chip é encaixado e a solda é feita numa câmara de vapor a aproximadamente 180
graus, temperatura em que a solta de funde mas que ainda não é suficiente para derreter os
demais componentes da placa mãe, incluindo os conectores plásticos e os chips, que suportam
temperaturas um pouco mais altas. O BGA é utilizado por vários componentes, entre eles
chipsets e chips de memória, destinados principalmente a portáteis. Existe ainda uma série do
processador C3 da Via que utiliza este tipo de conexão como forma de cortar custos. As placas
mãe já vem com os processadores soldados, mas existe o inconveniente de não ser possível
atualizar o processador. A Via chama o C3 neste formato de "EBGA", onde o "E" vem de
"Enhanced". """
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Big Drive"
        p.meaning = """Na história do PC já existiram vários limites para o tamanho máximo de HD suportados pela
placa mãe. Na época dos 486 tivemos o limite de 504 MB, que foi superado graças ao LBA. Mais
tarde tivemos os limites de 8 e 32 GB que ainda atingem muitas placas mãe em uso.
A "última fronteira" é o limite de 128 GB (ou 137 GB, se você considerar um GB como
1.000.000.000 de bytes como fazem os fabricantes de HDs) que afeta as placas mãe que não
sofrem mais dos limites anteriores. Este limite surge por que o BIOS reserva apenas 28 bits para
o endereçamento do HD, o que permitem endereçar até 268.435.456 setores de 512 bytes cada.
O padrão Big Drive desenvolvido pela Maxtor em parceria com outros fabricantes, soluciona o
problema, reservando 48 bits, suficientes para endereçar HD's de até 144 petabytes, capacidade
que só será atingida daqui a algumas décadas.
Quase todas as placas mãe novas à venda atualmente já são compatíveis com a tecnologia.
Muitas placas antigas podem ser atualizadas através de um upgrade de BIOS."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bigfoot"
        p.meaning = """
            Uma família de HDs produzidos pela Quantum, que utilizam discos de 5 ¼, bem maiores que os
            discos rígidos de 3 ½ que usamos atualmente. Além de pesados, estes HDs ocupavam uma das
            baias de 5 ¼ do gabinete, o espaço de um CD-ROM. Apesar do tamanho, estes HDs eram muito
            lentos e pouco confiáveis se comparados com outros modelos da época, mas pelo menos eram
            relativamente baratos. Fizeram um certo sucesso até serem substituídos pelos Quantum LCT, a atual família de HDs de baixo custo da Quantum, que continua apresentando um desempenho
            apenas medíocre. LCT vem de "Low Cost Technology".
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Big Water"
        p.meaning = """
            Este é um padrão de formato de placa mãe que está sendo desenvolvido pela Intel para
            substituir o ATX. Segundo a Intel o padrão é "revolucionário", mas pouco foi divulgado sobre ele
            até agora.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bimar"
        p.meaning = """Este é um verbo genuinamente Brasileiro. Eu bimo, tu bimas, ele bima... Bimar significa
transferir informações usando o infravermelho do Palm ou de outros portáteis. Graças à
facilidade de uso e a popularização destes aparelhos, bimar está se tornando comum em muitos
círculos, onde a moda é simplesmente bimar seu cartão de visitas para o Palm do interessado,
ao invés de entregar aquela velha folha de cartolina. O termo vem de "beam" ou raio de luz,
neste caso de luz infravermelha"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Binary"
        p.meaning = """
            Binário, sistema numérico usado em computação que consiste em apenas dois valores, 1 e 0.
            Todas as operações que são possíveis no sistema decimal, assim como processamento de texto,
            sons, imagens e outros dados analógicos podem ser feitos usando o sistema digital.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Biochip"
        p.meaning = """
            Os biochips são personagens importantes na engenharia genética. Basicamente, são microchips
            especialmente desenvolvidos para detectar reações químicas, que vêm ajudando enormemente
            vários projetos, entre eles o mapeamento do genoma humano.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BIOS"
        p.meaning = """Basic Input / Output System, sistema básico de entrada e saída. A primeira camada de software
do sistema, responsável por "dar a partida" no micro. O BIOS fica armazenado em um chip na
placa mãe."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "B.I.O.S."
        p.meaning = """
            (Bicho ignorante operando o sistema) - Termo pejorativo usado em relação à dummies. Mais
            uma daquelas piadinhas de técnico e bem velha por sina
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bit"
        p.meaning = """
            Qualquer circuito eletrônico é baseado em transístores, componentes extremamente simples,
            que permitem apenas dois estados: podem estar ligados ou desligados. Já que todo tipo de dado
            a ser processado precisa ser codificado em seqüências destes dois valores, foi criado o sistema binário, que permite representar qualquer tipo de informação, ou de operação aritmética através
            da combinação dos números 1 e 0, chamados de bit. Um único bit permite apenas duas
            combinações (1 ou 0), dois bits permitem 4 combinações, 3 bits permitem 8 combinações e
            assim por diante. Com 8 bits, temos o suficiente para um caracter de texto no sistema ASCII,
            com 24 bits temos o suficiente para um ponto numa imagem true-color, com 128 bits, temos o
            suficiente para gerar uma sofisticada chave de encriptação, e por aí vai
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bit Depth"
        p.meaning = """
            Número de bits usados para representar cada ponto de uma imagem digitalizada. Quanto mais
            bits por ponto, mais cores e melhor será a fidelidade da imagem, porém, maior será o arquivo
            gerado. Por exemplo, uma imagem de 1000 x 1000 pixels com 8 bits de cor ocupa pouco menos
            de 1 MB em disco, enquanto a mesma imagem, digitalizada com 24 bits de cor ocupará quase 3
            MB. Para diminuir isto, existem os formatos de compressão, como o JPG, que consegue diminuir
            quase que indefinidamente o espaço em disco ocupado pela imagem em troca de uma perda
            progressiva da qualidade e o PNG, que oferece uma redução de espaço limitada, mas não causa
            perda de qualidade.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bit-rate"
        p.meaning = """
            Num arquivo de áudio ou vídeo, o Bit-rate é o número de bits usados por segundo, para
            representar o conteúdo a ser exibido. Quanto maior for o bit-rate, maior será a qualidade, assim
            como o tamanho do arquivo. No MP3 por exemplo, o bit-rate padrão para ter uma qualidade
            próxima à do CD é 128 kbits, para qualidade de rádio são necessário 64 kbits, enquanto para ter
            qualidade de telefone são necessários apenas 32 kbits. O mesmo se aplica aos formatos de
            vídeo. Existem formatos com bit-rate fixo, e também de bit-rate variável, onde o bit-rate muda
            de acordo com o trecho, respeitando um limite estabelecido. Assim, num vídeo em Divx,
            podemos ter um bit-rate de 1000 kbits numa cena com pouca movimentação, e 6000 kbits numa
            cena de ação, com mudanças de tela mais rápidas. Veja também: VBR.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bitmap"
        p.meaning = """
            Formato onde cada ponto da imagem é representado por um certo número de bits, sem
            compactação. Em um bitmap com 24 bits de cor, cada ponto consumirá 3 bytes de memória. O
            oposto é uma imagem vetorial, onde a imagem é formada por formas geométricas. A diferença
            básica entre os dois formatos é que uma imagem de bitmap não pode ser ampliada sem perda
            de qualidade, já que os pontos estouram, enquanto uma imagem vetorial pode ser ampliada ou
            reduzida indefinidamente, pois bastará que o programa gráfico refaça os cálculos que formam a
            imagem a cada alteração.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Blade Server"
        p.meaning = """
            Este é um tipo especial de servidor, constituído por uma única placa, que contém um ou mais
            processadores, memória RAM, HDs e outros periféricos e pode ser encaixada num único rack,
            junto com vários outros servidores similares. Os vários servidores são interligados através de
            algum tipo de barramento rápido (geralmente alguma tecnologia proprietária) e podem ser
            configurados para oferecerem recursos como tolerância à falhas, balanceamento de carga, etc.
            Este tipo de servidor é projetado para ocupar pouco espaço e consumir pouca energia. Como os
            servidores ficam ligados continuamente, por anos à fio, um baixo consumo elétrico representa uma grande economia à longo prazo e o fato de ocuparem pouco espaço diminui os custos de
            hospedagem em data centers.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Blower"
        p.meaning = """
            Este é um tipo de cooler geralmente utilizado em gabinetes 1U e 2U, destinados a servidores,
            que puxa o ar frio de fora e o joga diretamente sobre o processador e demais componentes,
            montado sempre na horizontal. Como estes modelos de gabinete são baixos demais para os
            coolers atuais, é usado apenas um dissipador no processador e de um a quatro blowers, que
            jogam o ar frio, substituindo ao mesmo tempo o exaustor da entrada frontal e o fan do
            processador.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bluecurve"
        p.meaning = """
            Este é o desktop padrão do Red Hat Linux, incluído a partir da versão 8.0. O objetivo do
            Bluecurve é resolver os problemas de compatibilidade entre o KDE e o Gnome, fazendo com que
            os dois gerenciadores e seus respectivos aplicativos tenham uma aparência semelhante, que a
            área de transferência funcione entre os dois sem problemas e assim por diante. A idéia é que o
            sistema funcione da mesma forma, seja qual for o gerenciador escolhido.
            O Bluecurve gerou uma certa resistência entre os desenvolvedores ligados ao KDE, pois na
            realidade o KDE foi suprimido, tendo parte de suas bibliotecas reduzidas ou substituídas em favor das bibliotecas do Gnome, que são a base do Bluecurve. "O Red Hat está castrando o KDE"
            disse um desenvolvedor.
            Apesar disso, o Bluecurve fez sucesso entre os usuários, pois realmente facilita as coisas,
            principalmente para quem está começando no Linux. O visual também é bastante polido, com
            antialising de fontes, ícones bem feitos e um conjunto de aplicativos bem escolhido.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Blue Screen of Death"
        p.meaning = """
            A mundialmente conhecida tela azul do Windows, que fez sua aparição mais famosa durante
            uma apresentação do Windows 98, feita por Bill Gates durante a Comdex (a Americana) de
            1998. A causa mais comum da tela azul são erros de GPF, que ocorrem com frequência ao
            utilizar programas de 16 bits, nativos do Windows 3.x no Windows 95, 98, Se ou ME. Os
            sistemas baseados na família NT, como o NT 4, 2000 e XP rodam os programas de 16 bits numa
            máquina virtual, por isso não padecem deste problema, embora tenham a desvantagem de não
            rodarem vários programas que precisam se acesso direto ao hardware. Nestes sistemas a tela
            azul ainda pode aparecer em algumas situações, como erros de hardware ou caso alguns bugs
            específicos sejam explorados, mas elas são muito mais raras.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bluetooth"
        p.meaning = """O Bluetooth é uma tecnologia de transmissão de dados via sinais de rádio de alta freqüência,
entre dispositivos eletrônicos próximos. A distância ideal é de no máximo 10 metros e a distância
máxima é de 100 metros, atingida apenas em situações ideais. Um dos trunfos é o fato dos
transmissores serem baratos e pequenos o suficiente para serem incluídos em praticamente
qualquer tipo de dispositivo, começando por notebooks, celulares e micros de mão, passando
depois para micros de mesa, mouses, teclados, joysticks, fones de ouvido, etc. Já tem gente
imaginando um "admirável mundo novo Bluetooth" onde tudo estaria ligado entre sí e à
Internet, onde a cafeteira poderia ligar para o seu celular para avisar que o café acabou, ou a
geladeira te mandar um mail avisando que está sem gelo... sinceramente acho que existem usos
mais úteis para essa tecnologia, mas tem louco pra tudo... :-)
A maior ameaça para a popularização do Bluetooth são os transmissores 802.11b, outra
tecnologia de rede sem fio que transmite a 11 megabits (contra 1 megabit no Bluetooth) e tem
um alcance maior. O 802.11b é voltado para redes sem fio e é um padrão mais caro, embora os
preços estejam caindo para patamares próximos aos do Bluetooth."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BNC"
        p.meaning = """
            Vem de Baionet Naur Conector, que poderia ser traduzido para "conector em forma de baioneta".
            É o conector usado em cabos de rede coaxiais, onde existe apenas um cabo de cobre, coberto
            por camadas de isolamento e blindagem.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BNC (2)"
        p.meaning = """
            Um tipo de conector de vídeo encontrado em alguns monitores profissionais, onde existem cinco
            cabos separados, três para os sinais de cor (verde, azul e vermelho) e dois para os sinais de
            sincronismo horizontal e vertical. O objetivo de usar cabos separados é diminuir o nível de
            interferência, obtendo a melhor qualidade de imagem possível.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BogoMIPS"
        p.meaning = """MIPS falsos. Esta expressão aparece nas relas de login de algumas distribuições do Linux,
indicando o número de MIPS do processador usado na máquina. MIPS são milhões de instruções
por segundo. Um 486 de 100 MHz processa uma instrução por ciclo, então tem 100 MIPS. Um
Pentium III de 500 MHz processa (teoricamente) duas instruções por ciclo então tem 1000 MIPS
e assim por diante.
Como este número não indica o desempenho real do processador, já que isso depende da
quantidade de cache, etc. usam o "BogoMIPS" para indicar que o usuário não deve dar muita
importância ao número."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Book A"
        p.meaning = """
            Como é conhecido o documento que contém as especificações físicas do DVD, padronizado em
            1996. Pouco tempo depois, sugiram o Book B (com as especificações para o DVD-Video), o Book
            C (com as especificações do DVD-Audio), Book D (DVD-R, ou DVD gravável) e finalmente o Book
            E (DVD-RAM, ou DVD regravável).
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Boot"
        p.meaning = """Bootstrap. É o processo de inicialização do micro, onde é lido primeiramente o BIOS e em
seguida carregado o sistema operacional e programas. O termo bootstrap poderia ser traduzido
para o Português como "levantar-se puxando as próprias botas". A idéia tem uma certa
semelhança com o processo de boot de um PC, onde ele se inicializa sozinho.
Durante o Boot, são checados os componentes instalados no PC, contada a memória RAM,
realizados testes rápidos para verificar se tudo está funcionando adequadamente e se não
existem conflitos de Hardware, etc. Terminados os testes, o BIOS irá procurar o sistema
operacional, na ordem estabelecida na opção "Boot Sequence" do Setup. A lista inclui o drive de
disquetes, o HD, o CD-ROM, ou mesmo boot através do chip de Boot da placa de rede (caso
tenha). Ao localizar o sistema operacional o BIOS executa os arquivos que iniciam seu carregamento e dá lugar a ele. A partir daí é com a Janela, o Pingüin, o Diabinho ou que mais
esteja instalado no PC"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Boot Drive"
        p.meaning = """
            Drive de boot, a unidade de disco usada para dar boot no micro. Normalmente é o disco rígido,
            mas pode ser um disquete, CD-ROM, Zip, ou qualquer outra unidade de armazenamento de
            dados. Existe ainda a opção de dar boot através da placa de rede, neste caso é preciso gravar
            uma ROM com o software necessário e encaixa-la no soquete disponível da placa de rede. Neste
            caso, o PC dará boot utilizando os arquivos disponibilizados por outro PC da rede.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Boot Manager"
        p.meaning = """
            Um pequeno programa, instalado no setor de boot do HD, que permite instalar vários sistemas
            operacionais no mesmo micro. Toda vez que o micro for ligado, o Boot manager será carregado
            e perguntará qual dos sistemas operacionais deve ser carregado. Exemplos de Boot Managers
            são o lilo do Linux, o NTBoot do Windows NT e 2000 e o Boot Magic do Partition Magic.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Boot ROM"
        p.meaning = """
            Um chip de memória ROM instalado na placa de rede, que permite à estação acessar o servidor
            de arquivos da rede e a partir dele baixar o software necessário para o boot. Quase todas as
            placas de rede vêm com um soquete para encaixar o chip de boot, que geralmente é vendido
            separadamente.
            Como as estações dão boot através da rede, não são necessários os HDs, o que permite
            economizar algum dinheiro. Apesar de terem estado fora de moda durante muito tempo, as
            estações diskless estão voltando a fazer algum sucesso, em conjunto com servidores Linux.
            Neste caso, deve ser instalado no servidor um software como o LTSP (http://www.ltsp.org) e as
            estações devem usar placas de rede com ROMs gravadas com o software do http://rom-omatic.com ambas as soluções são gratuitas.
            Com isto, os terminais podem rodar todos os aplicativos gráficos instalados no servidor com um
            bom desempenho. Esta solução, assim como outras similares oferece seus prós e contras.
            Os prós são a economia, a possibilidade de centralizar todos os aplicativos e arquivos no
            servidor, o que facilita a tarefa de configuração e backups do sistema. Os contras são que as
            estações passam a ser inteiramente dependentes do servidor e da rede, de modo que qualquer
            problema em um dos componentes da rede ou uma pane no servidor paralisaria o trabalho em
            todas as estações.
            O mais comum atualmente, principalmente nos ambientes dominados pelo Windows é cada
            estação ter seu HD e os softwares necessários e baixar apenas arquivos através da rede.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Boot Sequence "
        p.meaning = """Seqüência de Boot. É uma opção encontrada no Setup, que permite definir a ordem em que o
BIOS procurará o sistema operacional a ser inicializado. Estão disponíveis opções como "A, C",
onde será acessado primeiro o drive de disquetes e em seguida o disco rígido, "C,A, CD-ROM"
 (primeiro o disco rígido, em seguida o drive de disquetes, por último o CD-ROM), e assim por
diante. Os BIOS mais recentes suportam também boot através de discos Zip, LS-120 e até
mesmo cartões de memória Flash."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Boot Sector"
        p.meaning = """Também chamado de trilha MBR, ou trilha zero, o setor de boot do HD armazena informações
sobre o sistema operacional instalado, quais arquivos devem ser carregados para inicializar o
sistema etc.
O BIOS é muito limitado neste sentido, embora seja capaz de contar a memória e reconhecer os
periféricos instalados (via plug-and-play) o BIOS não tem a mínima idéia do que fazer em
seguida. O setor de boot funciona como um ponto de partida, assim que o POST é concluído, o
BIOS lê o setor de boot e segue as instruções que estiverem gravadas nele, que iniciarão o
carregamento do sistema operacional.
Geralmente o boot é feito através do HD, mas de acordo com o que for configurado na opção
"Boot Sequence" no Setup o BIOS pode procurar o boot também no disquete, no CD-ROM, num
disco Zip ou até mesmo tentar dar boot através da rede.
Caso o setor de boot seja danificado por qualquer motivo, não será mais possível dar boot pelo
HD. Ao instalar qualquer sistema operacional, este irá reescrever o setor de boot, deixando as
instruções que permitirão ao BIOS carregá-lo. É possível instalar mais de um sistema
operacional no mesmo HD usando um gerenciador de boot (como o lilo do Linux) que é um
programinha que ficará encarregado de lhe perguntar, a cada boot, qual sistema operacional
deve ser carregado.
Para limpar o setor de boot do HD, você pode dar boot usando um disquete de boot do Windows
95 ou 98 e usar o comando "FDISK /MBR".
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bot"
        p.meaning = """
            Vem de "robot", ou robô. Um bot é um programa que vasculha a Internet em busca de
            informações, com pouca ou nenhuma intervenção do usuário. Os bots também são muito
            populares nos canais de IRC, onde podem automatizar muitas operações. É possível programas o
            boot para automaticamente enviar uma mensagem sempre que entrar em um canal, enviar
            respostas automáticas para frases pré programadas, automatizar o envio e recebimento de
            arquivos, etc.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BPI"
        p.meaning = """
            Bits per Inch ou bits por polegada. É uma medida de densidade para fitas destinadas à
            armazenar dados, como as famosas fitas DAT. Quanto mais bits por polegada, maior será a
            capacidade de armazenamento por fita
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bps"
        p.meaning = """
            Bits per second, é usada para medir a velocidade de modems e redes em geral. Refere-se ao
            números de bits transmitidos por segundo, lembrando que 8 bits equivalem a 1 byte. Um
            modem de 56 k atinge no máximo pouco mais de 8 KB/s.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bridge"
        p.meaning = """
            Ponte, serve para conectar duas redes distintas, permitindo comunicações entre elas. O bridge
            pode ser um dispositivo dedicado ou então um PC com duas placas de rede, configurado para
            executar esta função.
            À primeira vista pode parecer que o bridge tem a mesma função de um hub comum, mas as
            aplicações são bem diferentes. Um hub permite conectar vários PCs, que passam a fazer parte
            de um único segmento de rede, onde todos os dados transmitidos por um PC são transmitidos a
            todos, o que diminui o desempenho da rede conforme aumenta o tráfego de dados e a
            quantidade de PCs. O Bridge permite unir dois ou mais hubs, transformando-os em uma única
            rede, onde os PCs conectados a cada hub tornam-se um segmento de rede distinto. Isso faz toda
            a diferença, pois o bridge é capaz de examinar os pacotes e transmitir os pacotes apenas ao
            destinatário correto, isso previne a saturação da rede, mesmo que existam muitos PCs. As
            limitações são que o bridge pode conectar apenas redes que utilizem a mesma arquitetura
            (Ethernet por exemplo) e que utilizem o mesmo protocolo de rede (TCP/IP por exemplo). No
            máximo é possível juntar uma rede que utilize cabos de par trançado com outra que utilize
            cabos coaxiais.
            Os switches, seguidos pelos roteadores são os próximos degraus da escala evolutiva.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Brightness"
        p.meaning = """
            O ajuste de brilho do monitor. Nos monitores CRT, o brilho é ajustado através da variação da
            intensidade do feixe de elétrons que forma a imagem, quanto mais potente o feixe, mais brilho.
            Nos monitores LCD o brilho é ajustado variando a intensidade dos LEDs ou das lâmpadas que
            iluminam a tela.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Broadband"
        p.meaning = """
            Banda Larga, uma forma qualquer de acesso rápido à Internet, como acesso via cabo, ADSL,
            satélite, etc.
            Já existem várias tecnologias de acesso rápido disponíveis. O ADSL e o acesso via cabo são sem
            dúvida as duas tecnologias mais difundidas, mas ambas possuem seus problemas. O ADSL
            oferece um custo de implementação muito alto, que acaba tendo de ser financiado pela
            operadora. Com isso, apensar de em teoria todos que possuem uma linha telefônica poderem
            utilizar o ADSL, o serviço está disponível em poucas áreas. O acesso via cabo também é caro e
            está limitado às áreas cobertas pelas redes de TV a cabo.
            Um terceiro meio é o acesso via satélite, que se divide em duas modalidades. O unidirecional,
            onde a banda larga é apenas para download e continua sendo necessário um modem para fazer
            o upload e o acesso bidirecional, onde os dados são transmitidos nos dois sentidos. O acesso via satélite está disponível em praticamente todas as regiões, já que a área de cobertura dos
            satélites é muito grande, mas esbarra novamente no custo da infra-estrutura, ainda mais cara
            que o ADSL. Uma quarta tecnologia é o acesso via rede elétrica, que novamente tem potencial
            para atingir todas as casas, mas que assim como o ADSL é muito caro.
            A solução definitiva para o problema do acesso rápido seria levar uma rede de fibra óptica a
            todas as casas, o que permitiria velocidades de acesso muito mais altas, com possibilidade de
            expansão quase indefinida no futuro, aproveitando os mesmas casos. Mas, este é um sonho que
            ainda deve demorar várias décadas para se concretizar, novamente por causa do problema do
            custo.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Broadcast"
        p.meaning = """
            Este termo costuma ser traduzido como "radio difusão", apesar de atualmente este termo ter
            ganho novos significados. Um sinal de broadcast é irradiado para uma grande área geográfica,
            um bom exemplo são os sinais de TV. Numa rede de computadores, um sinal de broadcast é um
            aviso enviado simultâneamente para todos os micros da rede. Existem vários exemplos de sinais
            de broadcast, como por exemplo os avisos de colisões de pacotes enviados pelas placas ou
            (numa rede onde é usado um servidor DHCP e as estações são configuradas para obter o
            endereços IP automaticamente) os sinais enviados pelas estações quando se conectam à rede
            para entrar em contato com o servidor DHCP. Todas as estações recebem este sinal, mas apenas
            o servidor DHCP responde.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Browser"
        p.meaning = """
            O mesmo que Navegador, programas usados para visualizar páginas Web, como o Internet
            Explorer, Netscape, Opera, Konqueror, etc. No início os navegadores eram meros visualizadores
            de páginas em html, mas eles foram evoluindo e incorporando novas funções. Hoje em dia um
            navegador como o Internet Explorer é quase um sistema operacional completo, capaz de rodar
            aplicativos (Java, XML, Active-X, etc.) entre muitas outras funções. É por isso que tornou-se tão
            complexo desenvolver um navegador e torna-lo compatível com todas as tecnologias. É muita
            coisa a ser implementada.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "BTW"
        p.meaning = """By the Way, é uma abreviação geralmente usada em grupos de discussão: "A propósito",
"Falando nisso..." etc."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bubble Jet"
        p.meaning = """Esta é a tecnologia utilizada nas impressoras jato de tinta da Canon. A tinta é aquecida, parte se
evapora, formando bolhas, que expiram tinta no papel, permitindo a impressão. O nome "bubble
jet" é marca registrada da Canon. As impressoras jato de tinta da HP usam um sistema
parecido, mas chamado de Ink Jet."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Budget"
        p.meaning = """"Orçamento". Este termo é usado em várias situações. Por exemplo, um "budget PC" é um PC de
baixo custo, montado ou comprado por quem tem um orçamento apertado. Outro exemplo é o
"Power budget" é a quantidade de energia que um novo processador deve consumir de modo a
atender aos interesses do mercado; afinal, muitos torcem o nariz para comprar um processador
que esquente muito ou que obrigue a levar junto um cooler monstruoso."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Buffer"
        p.meaning = """Uma pequena área de memória ultra-rápida usada para melhorar a velocidade de acesso a um
determinado dispositivo. É encontrado em HDs, gravadores de CD, modems, e muitos outros.
Apesar de serem sinônimos, o termo "buffer" é mais usado em relação aos dispositivos
anteriormente citados enquanto o termo "cache" é mais usado com relação aos processadores e
memória RAM.
Embora não seja errado dizer "tenho um gravador com 2 MB de cache", é mais elegante usar o
termo buffer, assim como soa estranho dizer "tenho um processador com 512 KB de buffer" ao
invés de usar o termo cache."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Buffer Overflow"
        p.meaning = """
            Os Buffers são áreas de memória criadas pelos programas para armazenar dados que estão
            sendo processados. Cada buffer tem um certo tamanho, dependendo do tipo e quantidade de
            dados que ele irá armazenar.
            Um buffer overflow ocorre quando o programa recebe mais dados do que está preparado para
            armazenar no buffer. Se o programa não foi adequadamente escrito, este excesso de dados pode
            acabar sendo armazenado em áreas de memória próximas, corrompendo dados ou travando o
            programa, ou mesmo ser executado, que é a possibilidade mais perigosa. Se um programa
            qualquer tivesse uma vulnerabilidade no sistema de login por exemplo, você poderia criar um
            programa que fornecesse caracteres de texto até completar o buffer e depois enviasse um
            executável, que acabaria rodando graças à vulnerabilidade.
            Um caso famoso foi descoberto ano passado (2000) no Outlook Express. Graças à uma
            vulnerabilidade, era possível fazer com que um e-mail executasse arquivos apenas por ser
            aberto! Bastava anexar um arquivo com um certo número de caracteres no nome, que ele seria
            executado ao ser aberta a mensagem. Naturalmente, a Microsoft se apressou em lançar um
            patch e alertar os usuários para o problema. Felizmente, pelo menos por enquanto, não foi
            descoberta mais nenhuma vulnerabilidade tão perigosa no Outlook. Semanalmente são
            descobertas vulnerabilidades de buffer overflow em vários programas. Algumas são quase
            inofensivas, enquanto outras podem causar problemas sérios. O próprio Codered se espalhou tão
            rapidamente explorando uma vulnerabilidade do IIS da Microsoft. Com isto, o worm podia
            contaminar servidores desprotegidos simplesmente enviando o código que explora o bug, sem
            que ninguém executasse nenhum arquivo.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Buffer Underrun"
        p.meaning = """
            A gravação de um CD é um processo razoavelmente lento que não pode ser interrompido de
            maneira alguma, caso contrário a mídia que está sendo gravada será perdida. O problema que mais atormenta os usuários de gravadores de CD é o famoso “Buffer Underrun”, uma situação
            onde a gravação é interrompida por falta de dados.
            Todo gravador de CD possui um pequeno buffer, de 2 ou 4 MB nos drives mais recentes e 1 MB
            ou 512 KB em gravadores mais antigos ou de baixa qualidade. Este buffer funciona como uma
            “poupança” guardando dados que serão usados caso haja qualquer interrupção momentânea no
            fornecimento de dados para o gravador, evitando a perda da mídia. Assim que o gravador volta
            a receber dados, o buffer é novamente preenchido, mais ou menos como a represa de uma usina
            hidrelétrica.
            O Buffer underrun ocorre justamente quando o buffer do gravador se esvazia e a gravação é
            abortada por falta de dados. A solução neste caso é gravar novamente o CD numa velocidade
            mais baixa, ou tentar descobrir a causa do problema.
            Sistemas operacionais com o Windows 95/98/SE/ME, que não possuem um bom suporte à
            multitarefa são muito mais sucesptíveis a este tipo de problema, neles você deve tomar o
            cuidado de desativar protetores de tela, antivírus ou qualquer outro programa residente e ainda
            evitar executar tarefas pesadas no PC enquanto estiver gravando.
            No Windows 2000 e principalmente no Linux o cenário já é muito mais tranquilo, pois a
            multitarefa real proporcionada pelos dois sistemas permite usar o micro quase que normalmente
            sem perder mídias, desde que claro o HD seja capaz de fornecer a quantidade de dados
            necessária com uma certa folga.
            Lembre-se que apesar de atingirem 30, até 40 MB/s de taxa de transferência contínua, os HDs
            atuais ainda ficam na casa dos 5 a 6 MB/s ao transferir arquivos fragmentados, ou pequenos
            arquivos espalhados em áreas não contínuas do HD, que é o cenário mais comum na gravação
            de CDs. Desfragmentar o HD antes da gravação ajuda a diminuir o problema.
            A maioria dos gravadores de 16X em diante já são compatíveis com o Burn-Proof, um recurso
            que permite “paralisar” a gravação do CD quando o buffer se esvazia e recomeçar do mesmo
            ponto quando mais dados estiverem disponíveis. Este sistema resolve de uma vez por todas o
            problema, perimtindo gravar sempre na velocidade máxima perimtida pelo gravador
            (respeitando o suportado pela mídia) sem se preocupar com a velociade do HD ou com o sistema
            operacional usado.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bug"
        p.meaning = """Inseto em inglês, é usado com relação a qualquer tipo de falha de programação num programa.
O termo surgiu na década de 40, quando um inseto entrou nos circuitos de um computador
causando um curto circuito. Existem várias versões sobre quando, onde e qual foi o inseto que
entrou para a história, mas segundo o http://ei.cs.vt.edu o inseto era uma traça, que foi
encontrada por Grace Murray Hopper no Mark II em 1944. Naquela época os defeitos eram muito
comuns, pois os computadores eram formados por válvulas que se queimavam com muita
facilidade, mas este foi um caso tão peculiar que Grace "anexou" o inseto ao seu diário:"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Burn-in"
        p.meaning = """
            Um tipo de teste onde são executadas tarefas que visam exigir o máximo do sistema durante
            longos períodos, de forma a testar sua estabilidade. Este tipo de teste é muito comum em
            reviews de placas mãe, feitos por vários sites e é extremamente válido, pois a maior parte dos
            problemas de placas mãe e processadores só se manifesta em situações de uso intenso e
            prolongado. Em geral se aceita que uma placa mãe trave no máximo uma vez num teste de
            Burn-in de 24 horas, que equivale a algumas semanas de uso normal do sistema.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Burn-Proof"
        p.meaning = """
            Uma tecnologia desenvolvida pela Sanyo que aumenta a segurança na gravação de CDs. Ao
            ocorrer algum erro inesperado, um problema de buffer underrun, etc. a gravação é
            automaticamente interrompida. A grande vantagem, é que ao invés da mídia ser inutilizada,
            como aconteceria normalmente, é possível terminar a gravação ao ser solucionado o problema.
            Esta tecnologia é suportada por muitos gravadores de CD, que gravam a 12x ou mais, já que
            quanto mais alta a taxa de gravação, maior é a possibilidade de surgirem problemas de buffer
            underrun ou outros erros.
            Tudo é feito automaticamente pelo gravador, sem intervenção do usuário. No caso de um buffer
            underrum por exemplo o gravador paralisaria a gravação, esperaria até que o buffer estivesse
            cheio e então continuaria do ponto onde parou, como se nada tivesse acontecido.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Burst Mode"
        p.meaning = """
            Modo de acesso suportado por vários tipos de memória e cache que consiste em vários acessos
            seqüenciais, realizados antes que o anterior termine. Isto permite melhorar bastante a
            velocidade dos acessos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bus"
        p.meaning = """
            Barramento, meio de transmissão de dados entre dois ou mais componentes. Exemplos são os
            barramentos PCI, AGP e ISA da placa mãe, que ligam os periféricos ao chipset e
            consequentemente ao processador.
            Os barramentos se dividem em duas grandes categorias, os barramento seriais e os barramentos
            paralelos. Os barramentos seriais transmitem dados através de um único par de fios (um para
            enviar, outro para receber) de forma serial, onde um bit trafega de cada vez. Exemplos são as
            portas seriais, portas USB e o novíssimo Serial ATA desenvolvido pela Intel, para substituir as
            interfaces IDE, capaz de transmitir a 150 MB/s logo em sua primeira versão. Os barramentos paralelos por sua vez utilizam um número maior de fios para transmitir vários
            bits de cada vez. Nas portas paralelas por exemplo temos 8 bits por transferência, no
            barramento PCI temos 32 bits e assim por diante.
            As duas tecnologias possuem seus prós e contras. Os barramentos seriais são mais baratos e
            sofrem menos com o problema de interferência, mas em compensação são mais lentos do que
            poderiam ser caso fossem utilizados vários pares de fios em conjunto com a mesma tecnologia.
            Apesar disso alguns barramentos seriais são muito rápidos, como é o caso do Serial ATA e
            também do USB 2.0, capaz de transmitir a 400 megabits
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Bus Mastering"
        p.meaning = """
            É uma característica suportada por alguns tipos de barramento, entre elas as portas IDE da
            placa mãe, que permite que a controladora conectada ao mesmo se comunique diretamente com
            outros dispositivos do barramento sem passar pelo processador.
            Um HD com os drivers de Bus Mastering instalados é capaz de acessar diretamente a memória,
            sem ter que recorrer ao processador, o que além de melhorar o desempenho, não consome
            tempo de processamento, deixando o processador livre para fazer outras coisas. HDs UDMA
            utilizam o Ultra DMA, enquanto HDs Pio Mode 4 utilizam o Mult. Word DMA 2. Em ambos os
            casos é necessário instalar os drivers de Bus Mastering que acompanham sua placa mãe a fim
            de ativar este recurso. O Windows 98/SE/ME, além do 200 e do XP já possuem drivers de Bus
            Mastering para a grande maioria das placas mãe, dispensando a instalação dos drivers do
            fabricante.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Byte"
        p.meaning = """
            É uma unidade de armazenamento de dados. Cada byte é formado por 8 bits e é suficiente para
            256 combinações diferentes. É por isso que no sistema de caracteres ASCII é usado um byte
            para representar cada caracter. Com 256 combinações é possível incluir todas as letras,
            números e ainda um punhado de caracteres especiais e símbolos. No conjunto Unicode, onde são
            incluídos também caracteres do Japonês, Chinês, Árabe e outras línguas são usados 2 bytes para
            cara caracter, o que permite 65 mil caracteres diferentes.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "C"
        p.meaning = """
            O C foi desenvolvido durante a década de 70, mas ainda é largamente utilizado. A grande
            vantagem do C é permitir escrever tanto programas extremamente otimizados para a máquina,
            como seria possível apenas em Assembly, e ao mesmo tempo vir com várias funções prontas,
            como uma linguagem de alto nível, que podem ser utilizadas quando não for necessário gerar
            um código tão otimizado. Esta flexibilidade, permitiu que o C fosse usado para desenvolver a
            maioria dos sistemas operacionais, como o Unix, Linux e o próprio Windows. Usando o
            compilador adequado, o C pode ser usado para desenvolver programas para várias plataformas
            diferentes.
            A maior parte dos aplicativos para Linux são escritos em C e compilados usando o compilador
            GCC, desenvolvido pela Free software Fundation. Programas gráficos utilizam bibliotecas como o
            GTK, que permite criar janelas, botões, etc. Como a grande maioria dos programas têm seu
            código aberto (uma inesgotável fonte de estudos) e praticamente todas as distribuições Linux
            incluem o GCC, editores como o Emacs e o Vi, além de outras ferramentas necessárias, acaba
            sendo bem mais fácil aprender C no Linux do que em outras plataformas. Existem ainda
            ferramentas de programação visual baseadas no C, como o Kdevelop, também disponível na
            maioria das distribuições Linux.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "C++"
        p.meaning = """
            O C++ mantém os recursos do C original, mas traz muitos recursos novos, como recursos
            orientados a objetos, sendo também bem mais fácil de utilizar. O C++ é bastante usado
            atualmente para desenvolver muitos programas para várias plataformas.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "C2C"
        p.meaning = """
            Consumer to Consumer. Este é mais um dos termos da moda nos negócios on-line e aplica-se a
            sites que promovem negócios entre os próprios usuários, como sites de classificados e os
            tradicionais sites de leilões, como o Arremate, Mercado Livre, etc. que são o exemplo mais rico.
            Outras siglas semelhantes são B2B (negócios entre empresas) e B2C (vendas diretas ao
            consumidor).
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "C5X"
        p.meaning = """Este é mais um processador da Via/Cyrix, que será o sucessor do Erza (veja neste mesmo
dicionário). O C5X será produzido numa arquitetura de 0.13 mícron e trará um processador
aritmético melhorado. A versão inicial será lançada na segunda metade de 2002 e operará a 1.1
GHz, com a promessa de uma versão de 1.3 GHz até o final do mesmo ano. O C5X usará uma
arquitetura diferente da do Erza, com mais unidades de execução (mais desempenho) mas ao
 mesmo tempo mais estágios de pipeline (menor desempenho por ciclo em troca da possibilidade
de atingir frequências de operação mais altas), um total de 16, contra os 12 do Erza. Outra
novidade será a inclusão de um cache L2 de 256 KB (o Erza tem apenas 64 KB)."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "C5XL"
        p.meaning = """
            Será uma versão simplificada do C5XC, que trará apenas metade das unidades de execução e
            apenas 64 KB de cache L2. Este processador será bem mais barato e será capaz de operar a
            frequências mais altas, até 1.5 GHz segundo a Cyrix. Em compensação o desempenho não será
            dos melhores. Será uma alternativa de baixo custo e baixo consumo, que tem a chance de fazer
            algum sucesso nos notebooks ou talvez até nos handhelds e outros portáteis
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "C5YL"
        p.meaning = """
            Será uma versão ainda mais simplificada do C5X, provavelmente sem o cache L2. Este
            processador provavelmente será destinado a micros de mão e outros dispositivos portáteis, já
            que o desempenho será muito fraco para ser usado em PCs.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cache"
        p.meaning = """
            Memória ultra rápida que armazena os dados e instruções mais utilizadas pelo processador,
            permitindo que estas sejam acessadas rapidamente. O cache passou a ser utilizado a partir dos
            micros 386, quando os processadores começaram a tornar-se mais rápidos que a memória RAM.
            Quanto maior a quantidade, ou quanto maior a velocidade, maior será a eficiência do cache.
            Geralmente o cache é divido em dois níveis, chamados de cache L1 (level 1) e cache L2. Um
            Pentium III Coppermine, por exemplo, tem 32 KB de cache L1 e 256 KB de cache L2, ambos
            operando na freqüência do processador. Alguns processadores, como o K6-3 e o Pentium 4 Xeon
            utilizam também cache L3.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cache de Disco (ou Buffer de disco)"
        p.meaning = """O cache não é essencial apenas para a memória RAM. Um dos grandes responsáveis pelo
desempenho dos HDs atuais é novamente o ilustre cache. Apesar disso, o cache de disco
funciona de uma forma um pouco diferente do cache da memória RAM.
Em primeiro lugar temos uma pequena quantidade de cache instalada no próprio HD. Este cache
pode ser de 512 KB, 1 MB, 2 MB, ou até mais, dependendo do modelo. A função deste primeiro
cache é basicamente a seguinte:
Geralmente ao ler um arquivo, serão lidos vários setores seqüenciais. A forma mais rápida de
fazer isso é naturalmente fazer com que a cabeça de leitura leia de uma vez todos os setores da
trilha, passe para a próxima trilha seguinte, leia todos os seus setores, passe para a próxima e
assim por diante. Isso permite obter o melhor desempenho possível. O problema é que na
prática não é assim que funciona. O sistema pede o primeiro setor do arquivo e só solicita o
próximo depois de recebê-lo e certificar-se de que não existem erros.
Se não houvesse nenhum tipo de buffer, a cabeça de leitura do HD acabaria tendo que passar
várias vezes sobre a mesma trilha, lendo um setor a cada passagem, já que não daria tempo de
ler os setores seqüencialmente depois de todo tempo perdido antes de cada novo pedido.
 Graças ao cache, este problema é resolvido, pois a cada passagem a cabeça de leitura lê todos
os setores próximos, independentemente de terem sido solicitados ou não. Após fazer sua
verificação de rotina, o sistema solicitará o próximo setor, que por já estar carregado no cache
será fornecido em tempo recorde.
Os dados lidos pelas cabeças de leitura, originalmente são gravados no cache, e a partir dele,
transmitidos através da interface IDE ou SCSI. Caso a interface esteja momentaneamente
congestionada, os dados são acumulados no cache e, em seguida transmitidos de uma vez
quando a interface fica livre, evitando qualquer perda de tempo durante a leitura dos dados.
Apesar do seu tamanho reduzido, o cache consegue acelerar bastante as operações de leitura de
dados. Claro que quanto maior e mais rápido for o cache, maior será o ganho de performance.
Para complementar este primeiro nível de cache, os sistemas operacionais criam um segundo
cache de disco usando a memória RAM. No Windows 95/98 esta quantidade é fixa, mas a partir
do Windows 2000 o tamanho do cache de disco varia de acordo com a quantidade de memória
RAM disponível. Neste cache ficam armazenados também últimos dados acessados pelo
processador, permitindo que um dado solicitado repetidamente possa ser retransmitido a partir
do cache, dispensando uma nova e lenta leitura dos dados pelas cabeças de leitura do HD. Este
sistema é capaz de melhorar assustadoramente a velocidade de acesso aos dados quando estes
forem repetitivos, o que acontece com freqüência em servidores de rede ou quando é usada
memória virtual.
Isso explica o por quê dos grandes servidores utilizarem vários gigabytes de memória RAM. Além
da memória consumida pelos aplicativos, é essencial que tenham um enorme cache de disco.
Assim, ao invés de ler os dados a partir do HD, o servidor pode trabalhar na maior parte do
tempo lendo os dados a partir do cache na memória RAM que será sempre muito mais rápido."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cache Hit"
        p.meaning = """
            Um cache hit ocorre quando o dado de que o processador precisa está localizado no cache. O
            contrário, um cache miss ocorre quando o dado não está no cache e o processador precisa
            acessá-lo na memória RAM, perdendo tempo. Em geral, num processador atual com 32 KB de
            cache L1 e 256 KB de cache L2 (ou mais) o índice de cache hit fica em torno de 98%.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cache Inclusivo/Cache Exclusivo"
        p.meaning = """
            Em se tratando de cache, tanto o Athlon quanto o Duron possuem uma vantagem estratégica
            sobre o Pentium III e Celeron. Nos dois processadores da AMD o cache L2 é exclusivo, isto
            significa que os dados depositados no cache L1 e no cache L2 serão sempre diferentes. Temos
            então um total de 386 KB de dados e instruções depositados em ambos os caches do Athlon
            (128 de L1 + 256 de L2) e 192 KB depositados em ambos os caches do Duron, que possui
            apenas 64 KB de cache L2.
            No Pentium III e no Celeron o cache é inclusivo, isto significa que os 32 KB do cache L1 serão
            sempre cópias de dados armazenados no cache L2. Isto significa que na prática, o Pentium III é
            capaz de armazenar apenas 256 KB de dados e instruções somando ambos os caches, enquanto
            o Celeron é capaz de armazenar apenas 128 KB, menos que o Duron.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cache L1"
        p.meaning = """
            A primeira camada de cache do sistema, encontrada sempre dentro do próprio processador (com
            excessão apenas para os micros 386). O cache L1 trabalha sempre na mesma freqüência do
            processador e com tempos de latência extremamente baixos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cache L2"
        p.meaning = """
            Encontrado ou embutido no processador, ou na placa mãe, dependendo do sistema. Mesmo no
            caso dos processadores atuais, que trazem tanto cache L1 quanto cache L2 embutidos, operando
            à mesma freqüência do processador, os tempos de latência do cache L2 sempre serão mais
            altos, garantindo uma velocidade de acesso mais baixa que no L1.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cache L3"
        p.meaning = """
            O primeiro processador a utilizar cache L3 foi o K6-3, onde tanto o cache L1 e o L2 vinham
            embutidos no processador, sendo o cache da placa mãe aproveitado na forma do cache L3.
            Sistemas semelhantes também são usados em alguns servidores, onde chegam a ser usados
            vários MB de L3. O Pentium 4 Xeon da Intel também utiliza cache L3, mas embutido no próprio
            núcleo do processador.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cache Server"
        p.meaning = """
            Usado em algumas redes, é um servidor que armazena todas as páginas, ou mesmo arquivos
            baixados, repassando-os aos usuários que os solicitarem novamente. Isto serve tanto para
            agilizar as transferências de dados já baixados, quanto para diminuir o tráfego de dados através
            do link com a Internet. Neste ponto, o cache server tem um funcionamento semelhante ao de
            um servidor proxy, porém mais limitado. O cache server apenas armazena arquivos, não serve
            para compartilhar a conexão, nem para barrar acessos não autorizados ou acrescentar qualquer
            segurança.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Capacitor (ou Condensador)"
        p.meaning = """
            O capacitor é um componente usado em quase topo tipo de dispositivo eletrônico. Ele permite
            armazenar cargas elétricas na forma de um campo eletrostático e mantê-la durante um certo
            período, mesmo que a alimentação elétrica seja cortada. Os capacitores são usados nas fontes
            de alimentação, nas placas mãe e em inúmeros outros componentes. A função mais comum é
            retificar e estabilizar a corrente elétrica, evitando que variações possam danificar qualquer
            dispositivo. É justamente por causa dos capacitores que nunca devemos tocar nos componentes
            internos da fonte de alimentação sem os cuidados adequados. Você pode levar um choque
            considerável mesmo que a fonte esteja desligada da tomada.
            Os capacitores são também a base da memória RAM, onde para cada bit de dados temos um
            capacitor e um transístor. O transístor se encarrega de ler e gravar o bit, enquanto o capacitor
            armazena-o. Quando o capacitor está descarregado temos um bit 0 e quando está carregado temos um bit 1. Como no caso da memória o capacitor mantém sua carga por apenas alguns
            milésimos de segundo, os dados precisam ser reescritos continuamente. É por isso que a
            memória RAM é volátil.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Capacitância"
        p.meaning = """
            Todos os condutores possuem uma certa capacidade de concentrar energia e manter a carga
            durante um certo período de tempo, característica que é a base do funcionamento dos
            capacitores. Em algumas situações quanto maior a capacitância melhor, como por exemplo nas
            células de memória, onde quanto mais tempo a célula conservar sua carga elétrica, menor será
            o número de ciclos de refresh necessários por segundo, fazendo com que o módulo consuma
            menos energia e tenha um melhor desempenho.
            Em compensação, existem áreas onde uma alta capacitância é um sério obstáculo, como por
            exemplo nos transístores que compõe a parte lógica do processador. Quanto maior a
            capacitância, mais tempo o transístor demora para perder sua carga e mudar de estado, o que
            limita a frequência de operação do processador. Como em outras áreas, o desafio é conseguir
            desenvolver materiais nos dois extremos, de acordo com a área de aplicação.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Carrier Sense"
        p.meaning = """Sensor mensageiro ou verificação de mensageiro. Em redes Ethernet todos os dados que passam
através do hub são repassados a todas as estações. Naturalmente só o destinatário realmente lê
o pacote, mas o sinal é distribuído para todas.
Como apenas uma estação pode transmitir de cada vez, antes de transmitir qualquer pacote de
dados o PC "escuta" o cabo, para verificar se alguém mais está transmitindo dados. Caso o cabo
esteja livre ele transmite, caso contrário espera um certo tempo antes de tentar novamente.
Esta verificação é chamada de carrier sense.
Mesmo assim, ainda existe uma pequena possibilidade de duas estações escutarem o cabo ao
mesmo tempo e como conseqüência tentarem transmitir os dados ao mesmo tempo, fazendo
com que as transmissões colidam em algum ponto do cabo. Sempre que isso acontece, a
primeira estação que detectar o problema emite um sinal de alta frequência que "limpa" o cabo,
eliminando ambos os sinais e alertando as demais estações. As duas esperam então um tempo
aleatório antes de tentarem transmitir novamente, caso haja outra colisão elas esperam um
tempo maior e assim vai até que finalmente consigam transmitir.
As colisões de pacotes aumentam conforme cresce o número de PCs da rede. Em redes muito
grandes ou muito congestionadas as colisões podem prejudicar consideravelmente o
desempenho da rede. A solução é substituir os hubs por switchs, que embora um pouco mais
caros já são capazes de isolar as transmissões, enviando cada pacote diretamente ao
destinatário, diminuindo em muito o número de colisões.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cardbus"
        p.meaning = """
            Este termo se refere aos slots PCMCIA de 32 bits. Existem dois padrões de slots PCMCIA, os de
            16 bits, baseados no barramento ISA e utilizado em notebooks antigos, 386 e 486 e os slots de
            32 bits, que são baseados no barramento PCI, naturalmente muito mais rápido graças ao
            suporte a bus mastering e à frequência de operação de 33 MHz (contra os 8 MHz dos slots de 16 bits). Apesar de ambos os padrões serem intercompatíveis até certo ponto, o barramento de
            dados dos slots de 16 bits não é suficiente para interfaces de rede de 100 megabits,
            controladoras SCSI e outros periféricos rápidos. Os slots PCMCIA de 32 bits também são
            comumente chamados de slots PC Card.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CAS"
        p.meaning = """
            Column Address Strobe. Do ponto de vista do processador, a memória RAM é dividida em linhas
            (Row) e colunas (Column). Cada acesso é feito enviando os valores CAS e RAS, que
            correspondem a estes endereços de linha e coluna. Combinados os dois endereços é acessado o
            bit de dados desejado. Em geral existe no Setup a opção de configurar o valor CAS, como sendo
            de 2 ou 3 tempos. A opção 2 é a que oferece melhor desempenho, enquanto a opção 3
            geralmente permite que o módulo de memória suporte trabalhar a frequências mais altas.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Case Sensitive"
        p.meaning = """Um sistema que diferencia caracteres maiúsculos e minúsculos nos comandos e senhas. É caso
por exemplo do Linux, onde "XF86Config" é muito diferente do comando "xf86config" por
exemplo. É diferente do que temos no DOS e no Windows, onde tanto faz digitar "fdisk", "FDisk"
ou "fdIsK". Este termo também se aplica a linguagens de programação, o C por exemplo, onde
"if" é um comando e "IF" um erro.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cat 5"
        p.meaning = """
            Categoria 5. Os cabos de rede são classificados de acordo com a sua qualidade e capacidade de
            transmissão de dados. Existem várias categorias de cabos, desde os cabos Cat 1, os mais
            antigos, que não são adequados à redes, passando pelos Cat 3, adequados para redes de 10
            mbps e, finalmente, os Cat 5, que podem ser usados tanto em redes Ethernet de 10 quanto de
            100 megabits e são os mais comuns hoje em dia.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cat 5e"
        p.meaning = """
            Os cabos de par trançado categoria 5e também são certificados para o uso em redes de 10 e 100
            megabits, mas também nas redes Gigabit Ethernet, que transmitem (como o nome sugere :-)
            dados a 1 gigabit por segundo. Os cabos categoria 5e são os mais comuns atualmente, com uma
            qualidade um pouco superior aos Cat 5.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cat 6"
        p.meaning = """
            Um novo padrão de cabos de cobre que suporta frequências de até 550 MHz e utiliza cabos de 4
            pares, semelhantes ao cabos de categoria 5 e 5e. Este padrão não está completamente
            estabelecido, mas o objetivo é usa-lo nas redes gigabit Ethernet. Resta saber se este padrão terá
            fôlego para substituir os cabos cat 5, que também suportam Gigabit Ethernet e ao mesmo tempo
            resistir à investida dos cabos de fibra óptica.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cat 7"
        p.meaning = """
            Os cabos de rede categoria 7 são um novo padrão de cabos de rede de par trançado, capazes de
            trabalhar com frequências de 600 MHz, em contraste com os cabos cat 5 e cat 5e que suportam
            frequências de até 400 MHz. Os cabos cat 7 também utilizam 4 pares de fios, porém utilizam
            conectores mais sofisticados e são muito mais caros. Este padrão de cabos também deve ser
            suportado em algum padrão de rede Gigabit Ethernet, ou talvez venha a ser utilizado em alguma
            arquitetura de rede ainda mais rápida.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CAV"
        p.meaning = """
            Constant Angular Velocity ou velocidade angular constante. Este termo se refere aos CD-ROMs
            recentes, todos os modelos a partir de 16X e muitos dos de 12x onde a velocidade de rotação do
            CD é fixa, independentemente da trilha que esteja sendo lida pelo leitor. Com isto, a velocidade
            de leitura varia, sendo mais alta nas trilhas externas (que são mais longas) e menor,
            aproximadamente metade, nas trilhas mais internas do CD. Os CD-ROMs que utilizam este modo
            de leitura geralmente trazem avisos como "48x Max", indicando que os 48x são a velocidade
            máxima que o leitor é capaz de atingir, ao ler trilhas externas. Nas trilhas intermediárias ou
            principalmente nas internas, a velocidade de leitura vai caindo até chegar à aproximadamente
            24x. Como os CDs são gravados a partir do centro, na maior parte do tempo o CD-ROM opera a
            velocidades bem mais baixas, atingindo o máximo apenas ao ler as últimas trilhas de um CD
            cheio.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CBS"
        p.meaning = """
            CAS Before RAS, modo de acesso à memória onde são feitos quatro acesso consecutivos à
            memória enviando apenas um endereço de linha (RAS) e em seguida quatro endereços de
            coluna (Veja: Cas). Isto permite ganhar tempo, acelerando a leitura dos dados. Este modo vem
            sendo usado a partir das memórias FPM.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CD"
        p.meaning = """Originalmente, o Compact Disk, ou simplesmente CD, foi desenvolvido para armazenar música, e
substituir os antiquados discos de vinil com vantagens. Como num CD o som é gravado no
formato digital, com uma amostragem de 44.100 Hz, e 16 bits de resolução, temos um som
completamente livre de ruídos, e com uma qualidade quase perfeita. Não demorou muito para os
fabricantes perceberem que, com um mínimo de esforço, o CD também poderia ser usado para gravar dados. Criou-se então uma distinção: os CDs destinados a gravar música passaram a ser
chamados de CD-DA, ou "Compact Disk Digital Audio" enquanto os destinados à gravação de
dados passaram a ser chamados de CD-ROM, ou "Compact Disk Read Only Memory"."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CD-R"
        p.meaning = """
            CD Recordable, ou CD gravável. Durante vários anos, os CDs foram mídias somente para leitura.
            Você podia comprar um programa em CD, mas se por algum motivo precisasse copiá-lo teria que
            usar disquetes, Zip-drives ou algum outro dispositivo. Atualmente porém, vemos uma grande
            popularização dos gravadores de CD-ROM, que em um futuro próximo provavelmente se
            tornarão tão populares quanto as unidades de disquete. Qualquer usuário com 300 ou 400
            dólares, ou bem menos que isso, caso opte por um gravador usado, pode comprar um gravador
            e sair gravando CDs com dados ou mesmo CDs de música, sem muita dificuldade.
            Como quase todo mundo hoje em dia possui um drive de CD-ROM, a possibilidade de gravar CDs
            é útil também para o transporte de dados. Neste ramo, o CD revela-se uma opção bem
            interessante em termos de custo-beneficio, já que possui uma capacidade equivalente à de 6.5
            discos Zip de 100 MB, ou mais de 400 disquetes, sendo que uma boa mídia gravável chega a ser
            vendida por menos de 2 reais, com muitas opções abaixo da marca de 1 real.
            Outro recurso interessante é o recurso de multisessão, que permite deixar um CD gravado
            "aberto". Através deste recurso suportado por qualquer gravador e programas de gravação
            atuais, é possível gravar uma quantidade pequena de dados, 100 MB por exemplo, e depois ir
            gravando mais dados até que a capacidade total do CD seja preenchida, diminuindo bastante o
            número de mídias necessárias para fazer backups diários ou mesmo para transportar pequenas
            quantidades de dados.
            Assim como nos drives de CD-ROM, a velocidade de gravação também é mostrada em múltiplos
            de 150 KB/s. Um gravador 1x será capaz de gravar CDs a uma velocidade de 150 KB/s, um CD
            2x a 300 KB/s, um de 4x a 600 KB/s e assim por diante. Gravando a 1x, um CD cheio demora
            cerca de uma hora para ser gravado, demorando apenas meia hora a 2x ou cerca de 15 mim a
            4x. Mesmo gravadores mais rápidos podem ser configurados para gravar CDs a 2x ou mesmo 1x
            caso seja necessário.
            Um CD prensado comum é composto de três camadas: uma camada de plástico de cerca de 1,2
            mm de espessura, uma camada de alumínio, ouro ou platina onde são gravados os dados, e
            sobre ela uma camada protetora de verniz. Em um CD-R, também temos estas três camadas, a
            diferença é que temos uma quarta camada, entre o plástico e a camada reflexiva, justamente a
            camada onde são gravados os dados. Esta fina camada é composta de produtos sensíveis ao
            calor, que tem sua composição química alterada devido ao calor gerado pelo feixe laser do
            gravador, muito mais potente que o usado na leitura do CD. As partes da superfície queimadas
            pelo laser ficam opacas e criam pequenas bolhas, deixando de refletir a luz do leitor,
            substituindo sulcos dos CDs prensados.
            Atualmente existem pelo menos 5 substâncias diferentes (Cyanine, Phthalocyanine, Metallized Azo,
            Advanced Phthalocyanine e Formazan) que podem ser usadas para formar a camada de gravação dos
            CD-Rs. Todas estas substâncias são orgânicas, um tipo de plástico ou combustível, e justamente
            por isso podem ser queimadas pelo laser do gravador. Cada uma estas substâncias foi
            desenvolvida por uma companhia diferente, que detêm sua patente.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CD-RW"
        p.meaning = """
            CD ReWritable ou CD regravável. Comparados com mídias magnéticas, como os discos Zip ou
            mesmo os disquetes, os CDs graváveis trazem a desvantagem de não permitirem regravação. Se
            você gravar um CD hoje, e amanhã precisar alterar um único arquivo das centenas que foram
            gravados, terá que gravar outro disco. Para solucionar este inconveniente, surgiram os CDs
            regraváveis, que podem ter seu conteúdo alterado livremente, praticamente com a mesma
            facilidade que temos com mídias magnéticas como Zips e disquetes.
            A mágica é permitida pela substância usada na composição da camada de gravação dos CDs
            regraváveis. Enquanto em um CD gravável a camada de gravação é queimada pelo laser,
            tornando-se inalterável após a gravação, a mídia regravável pode ser alterada entre o estado
            cristalino e o opaco através de laseres de intensidades diferentes. Esta técnica é bem
            interessante, pois com o laser, o material é fundido, mas de acordo com a temperatura de fusão,
            ele assume características diferentes ao esfriar. Um temperatura mais alta torna o material
            opaco, enquanto um laser um pouco mais fraco o faz voltar ao estado original. Segundo os
            fabricantes, este tipo de mídia pode ser reescrita mais de 1.000 vezes antes de começar a
            apresentar qualquer problema, mas isto depende da qualidade: algumas mídias começam a
            apresentar erros depois de poucas regravações.
            O maior problema com os CDs regraváveis, porém, é a compatibilidade. Um CD-R reflete mais de
            70% da luz que é refletida por um CD prensado, e por isso pode ser lido por praticamente
            qualquer drive sem muita dificuldade. No caso de um CD-RW, a refração é bem menor, cerca de
            apenas 20%.Para ler estas mídias o leitor precisa ser equipado com um circuito especial,
            chamado AGC "automatic gain control", ou controle automático de ganho. Este circuito, que é
            embutido na cabeça de leitura é capaz de detectar a baixa taxa de reflexão da mídia, e
            aumentar a intensidade do laser de leitura. Temos então um laser bem mais forte do que o
            usual, para compensar a baixa reflexão da mídia, fazendo com que o laser refletido tenha uma
            intensidade parecida com o normal.
            Além disso, os CDs regraváveis ainda trazem mais alguns inconvenientes. Como a taxa de
            refração luminosa é bem mais baixa, a leitura do CD é mais difícil, tornando as mídias
            regraváveis muito mais sensíveis a arranhões, poeira, sujeira, etc. Trabalhando com mídias
            regraváveis você deverá ser especialmente cuidadoso quanto ao armazenamento.
            Outro problema reside na durabilidade, que é muito menor do que a dos CDs convencionais e à
            sensibilidade dos CDs a leituras sucessivas. Acontece que o material que compõe os CDs
            regraváveis é sensível à mudanças de temperatura. por outro lado, devido à baixa refração
            luminosa, o leitor é forçado a utilizar um laser muito mais forte que o normal para lê-los. O
            resultado é que após ser lido varias vezes, uma mídia regravável começa a apresentar
            corrompimento nos dados, principalmente mídias de baixa qualidade.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Celeron"
        p.meaning = """
            Processador lançado pela Intel em 98 com o objetivo de ser o sucessor do Pentium MMX no
            mercado de baixo custo. As primeiras versões de 266 e 300 MHz não tinham cache L2, e por isso
            acabaram sendo grandes fiascos de vendas. A partir do 300A foram incorporados 128 KB de
            cache L2, que garantiram um desempenho próximo ao de Pentium II do mesmo clock. O Celeron
            continuou evoluindo, mantendo-se como uma opção de processador de baixo custo, mas bom
            desempenho.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cell"
        p.meaning = """
            Um chip modular, que vem sendo desenvolvido através de uma aliança entre a Toshiba, Sony e
            IBM. A idéia é criar uma espécie de super-chip, que possa ser usado em praticamente todo tipo
            de dispositivo, desde um Handheld ou celular até um Supercomputador. Os chips seriam
            relativamente complexos, trazendo internamente componentes necessários para executar as
            mais diversas funções. De acordo com a aplicação que determinada série de chips fosse ter,
            certas partes do chip seriam desativadas, deixando apenas o necessário para a dada função. Os
            componentes serão desabilitados ainda em fábrica, sendo impossível liga-los novamente. Um
            celular usaria uma versão do chip com a maior parte dos componentes desabilitados, enquanto
            um supercomputador usaria vários chips trabalhando em paralelo.
            A princípio a idéia pode parecer excêntrica, afinal, pra quê produzir um chip complexo e vende-lo
            com quase tudo desabilitado por 20 dólares para ser usado num telefone celular, enquanto
            outras séries do mesmo chip seriam vendidas por 300 dólares para equiparem um
            supercomputador? A grande vantagem vem de se produzir um maior número de chips. Hoje em
            dia, uma fábrica de processadores pode custar facilmente mais de 1 bilhão de dólares para ser
            produzida, fora os custos de desenvolvimento. Pra produzir 10 chips, ou 20 milhões, o
            investimento inicial será o mesmo.
            Cada vez mais as empresas estão chegando à conclusão de que vale mais à pena produzir uma
            única linha de chips e vender a maior quantidade possível, mesmo que com preços diferentes.
            De qualquer forma, o Cell não é para amanhã, é apenas uma idéia. O desenvolvimento do chip
            deve demorar pelo menos 4 anos e custará 400 milhões de dólares. É isto que torna o mercado
            de alta tecnologia, tão interessante, é preciso anos para projetar um novo processador, que deve
            manter-se atual ao ser lançado. Os projetistas precisam pensar nas demandas do mercado com
            anos de antecedência.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Centaur"
        p.meaning = """
            Também conhecida como IDT, esta foi uma pequena fabricante de processadores que tentou
            (sem muito sucesso) competir com a Intel e AMD, lançando um processador chamado C6. Mais
            tarde a Centaur acabou sendo comprada pela Via, que abocanhou também a Cyrix, unindo as
            duas equipes para projetar os atuais processadores C3.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Centrino (Intel)"
        p.meaning = """Um notebook ideal deve ser leve, ter uma boa autonomia de bateria e hoje em dia também ter
uma interface de rede wireless integrada. Para um fabricante de processadores como a Intel, um
notebook ideal é um que além de um processador Intel leve um chipset e uma placa de rede
wireless da mesma marca. O Centrino é uma tentativa de juntar estes dois pontos de vista.
Para melhorar a autonomia da bateria e permitir que o notebook seja mais leve (bateria menor,
cooler mais simples, etc.) desenvolveram um Pentium 4 de baixo consumo, chamado Banias, um
projeto derivado do antigo Intel Tinma.
O Banias tem menos estágios de pipeline que o Pentium 4 e mais cache L2, 1 MB completo. Isso
faz com que ele opere a frequências mais baixas mas em compensação seja mais rápido por
ciclo de clock.
  Para melhorar a relação de desempenho e consumi elétrico foi adicionado um sistema
relativamente agressivo de economia de energia. Ele não chega a ser tão eficiente quanto o do
Crusoé por exemplo, mas já cumpre bem o seu papel.
A economia é feita diminuindo a frequência de operação e tensão usadas pelo processador
quando ele está ocioso, quando o notebook estiver operando a baterias ou de acordo com a
configuração do usuário. Na primeira leva o Banias foi lançado em versões de 900 MHz a 1.6
GHz. Em todas as versões a frequência de operação mínima é de apenas 600 MHz, onde o
processador opera utilizando uma tensão de apenas 0.96V e consome apenas 6 Watts. Este
modo econômico ainda conserva desempenho suficiente para a maior parte dar tarefas, como
fazer uma apresentação, navegar na web, gravar um CD ou até mesmo assistir um DVD. A idéia
é que nós passamos a maior parte do tempo fazendo coisas simples no micro e não existe
necessidade do processador operar a toda drenando os ampéres da bateria todo o tempo.
Na frequência máxima os processadores consomem bem mais, mas ainda dentro da faixa de
tolerância para um notebook. O Banias de 1.6 GHz consome 24.5 Watts, enquanto o de 1.1 GHz
consome 12 Watts.
Junto com o Banias a Intel lançou dois novos modelos de chipsets, o 855PM e o 855GM. Estes
dois chipsets são versões aperfeiçoadas do i845 (usado em placas de baixo custo para o Pentium
4). Eles oferecem suporte a memórias DDR PC266 e mantém o mesmos recursos básicos, mas
possuem um consumo elétrico muito mais baixo (menos da metade do i845) e, o principal, são
compatíveis com o sistema de gerenciamento de energia do processador.
Para completar o trio a Intel lançou também uma placa de rede Wireless, batizada de
Pro/Wireless 2000 card. Esta é uma placa 802.11b no formato mini-PCI usado em notebooks, em
futuras versões é possível que o controlador wireless venha integrado no próprio chipset.
A "plataforma Centrino" é um conjunto destes três componentes: Processador, Chipset e placa
Wireless. Para poder vender seus notebooks sob a marca é necessário que o fabricante utilize os
três de uma vez.
Os fabricantes que optarem por utilizar apenas o processador, ou apenas o processador e o
chipset não poderá usar a marca Centrino, mas apenas a marca "Pentium-M" que é o nome
comercial do Banias."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Centronics (interface)"
        p.meaning = """
            Foi o primeiro padrão de portas paralelas, ou portas de impressoras bidirecionais. O conector
            possui 25 pinos e a porta transmite a aproximadamente 150 KB/s. As portas Centronics foram
            substituídas pelas portas ECP e EPP usadas atualmente, que possuem compatibilidade retroativa
            com elas.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CEO"
        p.meaning = """
            Chief Executive Officer ou diretor executivo. O CEO não é necessariamente o presidente de uma
            empresa, apesar da sua função ser igualmente importante. O CEO é o principal responsável
            pelas decisões referentes às estratégias da empresa ou a novos produtos, é o responsável por
            estabelecer e atingir as metas de faturamento além de ser o principal porta-voz da empresa.
            Geralmente o CEO também é o executivo mais bem pago. Muitos recebem mais de um milhão de
            dólares por ano.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CERT"
        p.meaning = """
            Computer Emergency Response Team. Este é um órgão criado em 1988 com o objetivo de tratar
            de assuntos referentes à segurança da Internet e das redes em geral. O Cert mantém o
            http://www.cert.org, um site sobre segurança bastante completo que alerta sobre novos vírus e
            vulnerabilidades, oferece correções e disponibiliza um extenso material de estudo sobre
            segurança de redes.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CFML"
        p.meaning = """
            ColdFusion Markup Language, uma linguagem de script baseada em tags, utilizada para
            desenvolver páginas Web dinâmicas, através do ColdFusion. As tags são incluídas em páginas
            HTML e permitem acessar bancos de dados, exibindo dados em resposta a uma entrada do
            usuário. As páginas criadas neste formato proprietário utilizam a extensão CFM.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CFM"
        p.meaning = """
            Cubic Feet per Minute, ou pés cúbicos por minuto. Esta é uma medida de desempenho para os
            fans usados nos coolers. Quanto maior é o CFM, melhor é o desempenho do fan. Apesar de na
            maioria das vezes os coolers com fans de maior CFM serem mais eficientes, esta não é uma
            regra, pois a eficiência do cooler também depende do desenho e dos materiais usados no
            dissipador.
            Um cooler com dissipador de cobre é capaz de absorver mais calor que um com dissipador de
            alumínio, o que faz uma diferença considerável em processadores que geram muito calor, como
            o Athlon ou o Pentium 4. O número de aletas ou de barbatanas e sua espessura, também é um
            fator essencial. Quanto mais aletas, maior é a área de dissipação de calor e quanto mais finas
            forem, mais rápida é a dissipação.
            Até mesmo a textura do metal pode ajudar. Alguns fabricantes vêm utilizando coolers com
            aletas texturizadas, ao invés de metal liso, o que ajuda a aumentar o atrito com o ar, fazendo
            com que ele retire mais calor do metal.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CGI"
        p.meaning = """
            Common Gateway Interface. Os scripts CGI são pequenos programas, rodados a partir do
            servidor que permitem adicionar vários recursos a uma página Web. Os programas são
            executados a partir de solicitações do navegador, retornando a resposta desejada. Os scripts CGI
            podem desempenhar desde funções bem simples, quanto interagir com grandes bases de dados
            e geralmente são escritos em linguagem Perl.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Checksum"
        p.meaning = """
            É um sistema de checagem que consiste em verificar um arquivo ou pacote de dados utilizando
            um código enviado no início da transmissão. O código é usado pelo receptor para verificar se a transmissão está completa e se o arquivo não está corrompido. Tanto as camadas TCP quanto
            UDP oferecem este recurso. O CRC também é usado por drives de disquetes, HDs, CD-ROMs, etc.
            Se ao tentar descompactar um arquivo gravado num disquete você receber um erro de CRC,
            significa que a mídia está com defeito. Os disquetes não são mesmo muito confiáveis.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Chicago"
        p.meaning = """
            Este era o nome código do Windows 95. Foi usado nos primeiros betas, quando o nome
            comercial ainda não havia sido divulgado.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Child Process (processo filho)"
        p.meaning = """Durante a execução e qualquer programa, é comum que ele crie sub-processos ou processos
filhos que são pequenas tarefas executadas pelo programa como se fossem processos
separados.
Esta é uma manobra feita para melhorar o desempenho do programa, pois vários processos
separados podem ser processados simultâneamente pelo sistema operacional. Naturalmente de
tempos em tempos é preciso matar estes sub-processos, daí surgem algumas fases estranhas
para quem não é da área, como "killing the children" (uma tradução literal seria "matando as
crianças") "start the child reaper", etc. Existe até uma piada sobre um bloco de código
supostamente encontrado no código do Solaris (o sistema operacional desenvolvido pela Sun):
* We don't want people to have to make incorrect
* assumptions about this function...
*/
child_reaper = current;
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Chipkill"
        p.meaning = """
            Uma tecnologia desenvolvida pela IBM, com aplicação sobretudo em servidores e em outros tipos
            de máquinas de alta confiabilidade. Permite que o BIOS da placa mãe detecte bits defeituosos na
            memória RAM e os desabilite, algo parecido com a tática de marcar os setores defeituosos do
            HD. Existem várias implementações possíveis para esta tecnologia, algumas exigem
            modificações nos chips de memória, outras permitem usar memórias comuns.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Chips assíncronos"
        p.meaning = """
            Esta é uma idéia que vem ganhando destaque entre os desenvolvedores de chips. A idéia é
            construir chips capazes de operar sem um sinal de clock, o que permite reduzir o consumo
            elétrico e até mesmo aumentar o desempenho. Um processador é como um emaranhado de
            filamentos e chaves. Todos sabemos que não existe um condutor perfeito, a cada vez que um
            impulso elétrico percorre o processador, parte da energia se perde na forma de calor. Sendo
            assim, quanto mais alta a freqüência de operação, maior é o consumo e a dissipação de calor. O
            problema é que o sinal de clock está sempre ativo. Mesmo que o processador não tenha nada a
            processar, os impulsos elétricos continuam sendo enviados.
            Os chips assíncronos, por sua vez são capazes de processar dados conforme a necessidade, sem
            necessariamente haver sincronismo entre os diferentes componentes do processador. A
            economia de energia neste caso é muito grande, pois o chip só funciona quando há dados para processar. Também existe a possibilidade de haver grandes ganhos de desempenho, pois os
            componentes internos do processador poderão trabalhar isoladamente à sua capacidade
            máxima, sem serem retardados por componentes mais lentos.
            Esta é uma idéia que parece maravilhosa no papel, mas é bem mais complicada de colocar em
            prática. Em primeiro lugar, como não existe mais o farol do sinal de clock, é preciso projetar o
            processador com muito mais cuidado, planejando a forma como os dados trafegarão dentro do
            chip, colocar buffers nos locais certos, para que dados não sejam perdidos pela diferença de
            velocidade entre os componentes, etc. Enfim, é um mundo novo a ser explorado.
            Companhias como a IBM, Intel, Sun e Philips vêm investindo no desenvolvimento de chips
            assíncronos, que devem chegar ao mercado nos próximos anos. A Philips por exemplo
            desenvolveu um chip assíncrono para o uso em pagers, que consome apenas 1/6 da energia do
            modelo tradicional.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Chipset"
        p.meaning = """
            Conjunto de chips. É o principal componente da placa mãe, formado geralmente por dois chips,
            contém os controladores de acesso à memória, controladores do barramento IDE, AGP e ISA, e
            vários outros componentes essenciais. Alguns chipsets atuais trazem também vídeo e até
            mesmo memória cache (como num projeto da micron) embutidos.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Choke packet"
        p.meaning = """
            Este é um tipo especial de pacote de rede, que tem um papel importante na Internet e em
            grandes redes. Sempre que um roteador fica congestionado, passa a emitir choke packets para
            os principais emissores de dados. Ao receberem os pacotes, os emissores diminuem a
            quantidade de dados enviados. Caso o emissor seja outro roteador (repassando dados vindos de
            outros pontos da rede) ele poderá procurar também uma rota alternativa para o envio dos
            dados.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Chorus"
        p.meaning = """
            Efeito de eco utilizado para melhorar a qualidade do som. Suportado por alguns programas e
            aparelhos de som.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CI"
        p.meaning = """
            Circuito integrado, vários componentes que são encontrados na forma de chips, em vários tipos
            de placas. O circuito integrado surgiu durante a década de 60, quando os fabricantes de
            transístores perceberam que era possível combinar vários transístores no mesmo Waffer de
            silício, formando circuitos completos, ao invés de separar todos os transístores e usá-los um a
            um. Naquela época a taxa de aproveitamento dos waffers de silício era muito baixa, de apenas
            20% (de cada 5 transístores, apenas um funcionava), daí a dificuldade em fabricar um circuito
            com 10 ou 100 transístores sem que nenhum deles apresentasse defeito, o que inutilizaria todo
            o CI.
            Mas, depois de algum tempo passaram a conseguir produzir waffers de silício de melhor
            qualidade, onde apenas algumas áreas do waffer eram defeituosas. Era possível então
            aproveitar todos os CIs das partes boas, perdendo apenas os poucos que caíssem nas áreas ruins.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cilindro"
        p.meaning = """
            Um HD armazena os dados em discos magnéticos, chamados de platters. Cada platter tem dois
            lados e geralmente os HDs trazem dois ou três platters, totalizando 4 ou 6 lados
            respectivamente. Dentro da área de cada platter os dados são organizados na forma de trilhas,
            que possuem a forma de círculos concêntricos, como um conjunto de anéis um dentro do outro,
            numeradas de 0 ao número de trilhas do HD a partir da trilha mais externa. Cada trilha é
            dividida em vários setores, cada um com 512 bytes de dados.
            O HD possui uma cabeça de leitura para cada face de disco, mas todas as cabeças estão presas
            na mesma peça de metal, o braço de leitura, por isso não possuem movimento independente:
            para onde uma vai, todas vão.
            Já que obrigatoriamente todas as trilhas estarão sempre sob a trilha de mesmo número de seu
            respectivo disco, passamos a usar o termo cilindro, que corresponde à todas as trilhas de mesmo
            número. Por exemplo, o cilindro 0 é formado por todas as trilhas número 0, em todas as faces de
            disco.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CIO"
        p.meaning = """
            Chief Information Officer, diretor de tecnologia e informação. É o responsável pela implantação e
            gerenciamento de sistemas. Muitas vezes o CIO também cuida do site de comércio eletrônico da
            empresa.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CISC"
        p.meaning = """
            Complex Instruction Set Computer. Computadores que executam diretamente um conjunto
            complexo de instruções, como o 486. Os processadores atuais incorporam um núcleo RISC
            (Reduced Instruction Set Computer), sendo chamados de híbridos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "ClawHammer"
        p.meaning = """
            Esta será a próxima geração de processadores AMD, um processador de 64 bits. O ClawHammer
            será compatível tanto com programas de 64 bits escritos especialmente para ele, quanto com os
            programas de 32 bits atuais, graças à sua arquitetura VLIW, capaz de processar várias
            instruções como se fossem uma só. O ClawHammer poderá processar duas instruções de 64 bits,
            ou quatro instruções de 32 bits por ciclo. Segundo a AMD, o ClawHammer será o processador
            destinado ao mercado doméstico mais rápido, tanto ao executar programas de 64 bits, quanto
            programas de 32 bits.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Clean Room"
        p.meaning = """
            Sala limpa, um local com temperatura controlada e completamente livre de partículas de poeira,
            onde discos rígidos são fabricados, ou onde podem ser abertos para manutenção. Abrir um HD
            fora de uma sala limpa condenará o equipamento, pois como os discos giram a velocidades
            muito altas, qualquer partícula de poeira que entre em contato com uma das cabeças de leitura
            é suficiente para causar um bom estrago nos discos magnéticos. O HD continuará funcionando mas, poucos minutos depois, começarão a surgir inúmeros setores defeituosos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CLI"
        p.meaning = """
            Comand Line Interface, ou interface de linha de comando. Este termo é bastante usado em
            literatura técnica com relação ao prompt de comando do Linux ou outros sistemas baseados no
            Linux. “Down to CLI” por exemplo é uma expressão que diz que a apartir deste ponto o usuário
            terá que recorrer à boa e velha linha de comando para configurar alguma faceta do sistema.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Clock"
        p.meaning = """
            Praticamente todos os circuitos eletrônicos utilizam um cristal de quartzo para controlar o fluxo
            de sinais elétricos responsáveis pelo seu funcionamento. Cada transístor é como um farol, que
            pode estar aberto ou fechado para a passagem de corrente elétrica. Este estado pode alterar o
            estado de outros transístores mais adiante, criando o caminho que o sinal de clock irá percorrer
            para que cada instrução seja processada. De acordo com o caminho tomado, o sinal irá terminar
            num local diferente, gerando um resultado diferente.
            Um cristal de quartzo vibra 14.7 milhões de vezes por segundo. A cada pulso do cristal, o
            circuito gera um certo número de clocks, de acordo com a sua frequência de operação. Dentro
            de cada ciclo de clock deve haver tempo suficiente para que o sinal percorra todo o processador
            e todas as operações necessárias sejam concluídas. Existe sempre uma frequência máxima de
            operação suportada pelo circuito, determinada pela técnica de produção usada (0.18 ou 0.13
            mícron por exemplo), pelo projeto do processador, pelo número de transístores, etc.
            Existem processadores capazes de atingir frequências de operação mais altas que outros,
            mesmo dentro da mesma técnica de produção. O Pentium 4 por exemplo, graças ao maior
            número de estágios de pipeline consegue operar a frequências mais altas que um Athlon
            construído na mesma técnica (um Pentium 4 Willamette contra um Athlon Thunderbird por
            exemplo), mas em compensação o desempenho por clock não é o mesmo. A 0.18 mícron o
            Pentium 4 chegou aos 2.0 GHz, enquanto o Athlon XP chegou apenas aos 1.66 GHz (XP 2000+),
            mas apesar disso, o desempenho do Athlon XP por clock é bastante superior.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Clone"
        p.meaning = """Um sistema compatível com uma certa arquitetura, mas produzido por outro fabricante. Por
exemplo, durante muito tempo os PCs fabricados pela Compaq, Dell, etc. eram chamados de
"clones" de IBM PC, pois eram compatíveis com o IBM PC da IBM. Já existiram também clones de
Macintosh, Macs produzidos por outras empresas sob um licença especial fornecida pela Apple.
Em geral, os fabricantes permitem a fabricação de clones quando desejam tornar seu produto
um padrão de marcado. A IBM foi muito bem sucedida neste sentido, já que hoje em dia mais de
90% dos computadores do mundo são PCs. A Apple por outro lado acabou cancelando as
licenças depois de algum tempo, pra evitar que os clones passassem a concorrer com seus
próprios produtos.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Closed Caption"
        p.meaning = """
            Um recurso suportado pela grande maioria dos aparelhos de TV atuais, que permite inclui
            pequenos trechos de texto, transmitidos como parte do sinal televisivo. O texto pode conter
            legendas, descrições, ou qualquer outro tipo de informação. A vantagem do uso do closed
            caption sobre as legendas é que o texto é transmitido em um canal separado, não faz parte da
            imagem. Assim como o SAP, este recurso pode ser ativado ou desativado à gosto do usuário.
            Muitos filmes transmitidos na TV aberta já podem ser assistidos com áudio original e legendas,
            ao serem ativados os dois recursos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cluster"
        p.meaning = """
            Um conjunto de setores do HD que são endereçados pelo sistema operacional como uma única
            unidade lógica. Em outras palavras, um cluster é a menor parcela do HD que pode ser acessada
            pelo sistema operacional. Cada cluster tem um endereço único, um arquivo grande é dividido em
            vários clusters, mas um cluster não pode conter mais de um arquivo, por menor que seja.
            O tamanho de cada cluster varia de acordo com o sistema de arquivos escolhido na formatação
            do HD. Usando FAT 16 cada cluster tem até 32 KB, usando FAT 32 cada cluster possui apenas 4
            KB. Usando NTFS (o sistema de arquivos utilizado pelo Windows NT e 2000) cada cluster possui
            entre 512 bytes e 4 KB, dependendo do tamanho da partição. Quanto menores forem os clusters,
            menor será a quantidade de espaço desperdiçada no HD, sobretudo ao gravar vários arquivos
            pequenos, já que mesmo com apenas 1 byte de tamanho, qualquer arquivo ocupará um cluster
            inteiro.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Clustering"
        p.meaning = """É o "ato ou efeito" de utilizar vários PCs ligados em rede para formar um cluster, onde todos
passam a se comportar como se fossem um único PC. Os PCs podem ter qualquer configuração
(apesar de o mais comum ser o uso de PCs de configuração igual ou parecida, para evitar que
um PC mais lento possa formar um gargalo para o conjunto) e pode ser utilizada praticamente
qualquer arquitetura de rede, com destaque para as redes Ethernet de 100 megabits ou Gigabit
Ethernet.
Além dos PCs e da rede é necessário algum software que gerencie o cluster. Existem várias
soluções disponíveis, de acordo com a aplicação.
Existem basicamente três aplicações para um cluster. A primeira e provavelmente a mais usada
é a tolerância a falhas, onde temos dois ou mais PCs ligados entre sí. O primeiro PC faz todo o
trabalho enquanto o segundo se limita a manter seus dados atualizados em relação ao primeiro
e a monitorá-lo constantemente. Se o primeiro PC sair do ar por qualquer motivo, o segundo
imediatamente assume suas funções. Esta tecnologia é muito usada em servidores Web e
servidores de banco de dados em Intranets.
A segunda aplicação é o balanceamento de carga, usada principalmente em servidores Web.
Neste caso temos pelo menos três PCs, onde o primeiro recebe todas as requisições e se
encarrega de dividí-las entre os demais PCs. Ao invés de ter apenas um super-servidor
caríssimo, você pode usar vários PCs baratos para fazer o mesmo trabalho.
A terceira aplicação é o processamento paralelo, onde brilham os famosos clusters Beowulf.
Este tipo de cluster é muito útil em aplicações científicas, assim como animações e efeitos
destinados a filmes onde existe um gigantesco volume de dados a ser processado. O trabalho é dividido em pequenas partes, processado de forma distribuída e depois o quebra cabeças é
montado, gerando o trabalho final.
Uma arquitetura de cluster mais adaptada ao uso em desktop é o OpenMosix (veja o significado
neste mesmo dicionário).
Uma outra forma de clustering é suportada por alguns no-breaks destinados a servidores, onde
dois aparelhos podem ser ligados para combinar suas capacidades. Dois no-breaks de 2 KVA
podem formar um no-break de 4 KVA e assim por diante."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CLV"
        p.meaning = """Constant Linear Velocity, ou velocidade linear constante. Este é o modo de leitura usado por CDROMs antigos, os modelos até 8X e alguns dos de 12X. Nestes modelos a velocidade de rotação
do motor varia de acordo com as trilhas do CD que estão sendo lidas. Como as trilhas externas
são mais longas que as internas (quase o dobro), a velocidade de rotação é mais baixa nas
externas e maior nas internas, mantendo uma taxa de leitura de dados sempre constante. Este
modo de leitura deixou de ser usado a partir dos drives de 16X, pois a velocidade de leitura
passou a ser alta demais para acelerar e desacelerar o motor a todo instante. Entretanto,
existem algumas excessões, como o "True" 72X da Kenwood, onde o CD gira a apenas 12X
(CLV), mas um conjunto de 6 laseres de leitura consegue manter uma velocidade de leitura de
72X."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CMOS"
        p.meaning = """Complementary Metal Oxide Semiconductor. Uma pequena área de memória volátil, alimentado
por uma bateria, usado para gravar as configurações do Setup da placa mãe. Em muitas
situações é necessário limpar o CMOS para resetar as informações do setup, caso o usuário
tenha estabelecido uma senha e a tenha esquecido, caso a placa esteja "travada" por ter
escolhido uma frequência de operação muito alta, etc.
Neste caso basta retirar a bateria e usar uma moeda para dar um curto nos contatos por alguns
segundos, ou alterar a posição do jumper "clear CMOS", novamente por alguns segundos."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CMYK"
        p.meaning = """
            Cian, Magenta, Yellow and Black. É um padrão de quatro cores primárias, que combinadas
            formam cores ilimitadas. O padrão CMYK é mais usado para impressão em papel, onde 4 cores
            de tinta geram uma qualidade final melhor do que apenas 3. Porém, monitores, televisões, etc.
            usam o padrão RGB, Red, Green and Blue, onde são usadas apenas três cores. É por isto que
            uma mesma imagem vista no monitor apresenta leves alterações na tonalidade das cores ao ser
            impressa. Alguns programas gráficos como o Corel Draw incorporam filtros, que tentam mostrar
            no monitor a imagem exatamente como será impressa. Além do CMYK e do RGB existem vários
            outros padrões de cores, como o Pantone, onde ao invés de termos um certo número de cores
            primárias que são combinadas para gerar as demais, temos uma tinta para cada cor que for ser
            utilizada na impressão. Isto garante que a cor impressa seja exatamente a mesma que é vista
            no mostruário, entretanto não permite usar muitas cores diferentes no mesmo impresso, já que
            precisaríamos de uma tinta diferente para cada cor.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CNA (Certified Novell Administrator)"
        p.meaning = """
            Esta é a certificação básica oferecida pela Novell, que comprova que o possuidor é capaz de
            administrar pequenas redes locais, criação de logins, mapeamento de unidades de rede,
            monitoramento da rede, backup, etc. Para receber o título é necessário fazer apenas o
            treinamento Netware Administration da versão corrente do Novel Netware e passar no exame.
            Como é uma certificação básica, o único pré-requisito é ter conhecimentos básicos de Windows e
            Hardware.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CNE (Certified Novell Engineer)"
        p.meaning = """
            Este é a certificação oferecida pela Novell que vem depois do CNA. Um CNE é qualificado para a
            implantação e manutenção de redes Novel, integração com outras redes ou sistemas etc. Esta é
            uma certificação bastante trabalhosa e cara, pois é necessário fazer cinco treinamentos e mais
            cinco exames.
            Entre os treinamentos são obrigatórios o NetWare Administration, NetWare Advanced
            Administration, NDS Design & Implementation, Service & Support e mais um treinamento
            complementar, que pode ser escolhido entre o Internet Security Management with
            BorderManager e o Integrating Netware & Windows NT. Depois de realizado cada treinamento é
            necessário fazer o exame correspondente.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CNR"
        p.meaning = """
            Communication and Networking Rise, barramento criado pela Intel, com o objetivo de acomodar
            placas de som, modems e placas de rede. Pode ser encontrado em algumas das placas mãe
            modernas. Aparece como um pequeno slot marrom na placa mãe, em geral no canto oposto ao
            do slot AGP. (Não confundir com AMR).
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CNR (2)"
        p.meaning = """Click and Run. Este é um serviço de instalação de programas on-demand oferecido junto com o
Lindows. A idéia é que ao invés de instalar um monte de programas junto com o sistema
operacional, como é comum na maioria das distribuições Linux, o Lindows instala apenas alguns
programas essenciais (como no Windows) e a partir daí o usuário pode instalar apenas os
programas que desejar.
É aí que entra o Click and Run. Ao invés de ter de ir até o site do desenvolvedor de cada
programa, procurar pela versão compilada para a distribuição utilizada e ainda ter que
eventualmente instalar mais algum pacote necessário ao programa, o usuário simplesmente
clica em um ícone no desktop que o leva a uma página web onde os programas disponíveis estão
divididos por categorias, com explicações e screenshots. Basta clicar no link e o programa
desejado é automaticamente baixado e instalado, sem perguntas.
O diretório de programas contém basicamente os mesmos aplicativos disponíveis em outras
distribuições, como o Gimp, OpenOffice, Netscape, etc. A vantagem é apenas a comodidade que
acaba sempre agradando aos iniciantes.
O Lindows é uma distribuição comercial do Linux, destinado a usuários leigos. Ele pode ser
comprado no site http://www.lindows.com e também vem pré-instalado em alguns modelos de
PCs, como os vendidos pela Microtel (americana). Não existe a opção de baixar o ISO
 gratuitamente como em outras distribuições. A única opção é mesmo comprar o pacote."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "COAST"
        p.meaning = """
            Cache On a Stick, módulos de memória cache L2 que podiam ser instalados em algumas placas
            mãe antigas, que vinham sem cache embutido, trazendo em seu lugar um encaixe para o
            módulo, que era opcional.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cobol"
        p.meaning = """
            Cobol significa "Common Business Oriented Language". Esta linguagem de programação foi
            desenvolvida no final da década de 50, com o objetivo de ser uma plataforma de
            desenvolvimento para aplicações bancárias e financeiras em geral. Comparado com o Pascal e o
            Assembly, comuns na época, o Cobol é uma linguagem bastante amigável, o que garantiu uma
            grande aceitação. Até hoje esta linguagem é usada em muitos sistemas bancários, o que explica
            a grande procura por programadores experientes nesta linguagem na época do bug do ano
            2000.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Code Morphing Software"
        p.meaning = """
            Este é um sistema, usado no Crusoé, processador desenvolvido pela Transmeta, que converte as
            instruções x86 usadas pelos programas nas instruções internamente entendidas pelo
            processador. O Code Morphing substitui vários componentes que incham os processadores
            atuais, encarregados de converter as instruções nas instruções simples, entendidas pelo
            processador, ordenar as instruções, execução especulativa, etc., componentes que num Athlon
            correspondem a quase metade dos transístores gastos no processador.
            Em outras palavras, o Crusoé transfere para o software a maior parte das funções que
            normalmente seriam executadas por componentes separados do processador. Sem estes
            componentes, temos um chip muito menor, mais econômico e muito mais barato. A idéia é
            quase tão revolucionária quanto a que criou os processadores RISC a 20 anos atrás. O Code
            Morphing permite que o processador tenha uma arquitetura WLIN extremamente eficiente, sem
            com isto deixar de ser compatível com os programas atuais, enquanto os demais processadores
            do mercado sofrem graças à toda carga de legado necessária a mantê-los compatíveis com os
            processadores anteriores.
            Apesar do desempenho atual ser inferior aos demais processadores do mercado, o nível de
            eficiência é bem maior, permitindo que no futuro surjam versões mais parrudas do Crusoé, com
            mais transístores, um consumo elétrico um pouco maior, porém com um desempenho bastante
            superior aos atuais.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CODEC"
        p.meaning = """
            É um programa que contém os algoritmos de compactação e descompactação para um
            determinado formato de arquivos. O termo é a abreviação de COmpression DECompression, uma
            tecnologia qualquer que converte vídeo e som analógicos em sinais digitais, comprimindo-os a
            fim de diminuir o tamanho dos arquivos.
            Por exemplo, o Media Player 7 não possui suporte a vídeos em Divx, mas é possível assisti-los
            após instalar o Divx CODEC, o programa que adiciona suporte não apenas ao media player, mas a outros programas. Em geral, os programas de exibição de vídeo ou áudio já vem com CODEC’s
            para vários formatos.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Código-fonte"
        p.meaning = """
            O arquivo que contém os comandos e rotinas que formam um programa. Este código é então
            compilado, gerando o arquivo binário que será executado. Ao comprar um programa qualquer,
            recebemos apenas os binários, que permitem instalar e executar o programa, mas não o código
            fonte, que permitiria alterá-lo ou entender como ele funciona.
            Em programas comerciais, o código fonte é cuidadosamente guardado, mas existe um
            movimento crescente de desenvolvimento de softwares livres, onde o código fonte é distribuído
            junto com o programa, o que permite a qualquer um com conhecimentos de programação alterálo, corrigir bugs ou adicionar novos recursos, desde que sejam mantidos os créditos para o
            criador original. O movimento de software livre inclui o Linux e a maior parte dos aplicativos
            desenvolvidos para ele.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Colisão de Pacotes"
        p.meaning = """Nas redes Ethernet, existe o famoso problema de colisão de pacotes, que acontece sempre que
duas estações tentam transmitir dados ao mesmo tempo. Antes de transmitir seu pacote, a
estação "escuta" o cabo, para verificar se outra estação já está transmitindo. Caso o cabo esteja
ocupado ela espera, caso esteja livre ela transmite. Como o sinal demora algum tempo para
atingir todas as estações, existe uma possibilidade considerável de que outra estação "escute" o
cabo antes do sinal chegar até ela, pense que o cabo está livre e também transmita dados.
Neste caso os dados colidirão em algum ponto do cabo. A estação que estiver mais próxima, a
primeira a detectar a colisão, emitirá um sinal de alta freqüência que anula todos os sinais que
estiverem trafegando através do cabo e alerta as demais estações sobre o problema. Ao
receberem o sinal, todas as estações param de transmitir dados por um período de tempo
aleatório. Com isto, os dados voltam a ser transmitidos, um pacote por vez.
As colisões de pacotes não oferecem perigo à integridade dos dados, mas em compensação
diminuem o desempenho da rede, que a cada colisão fica parada por alguns milessegundos.
Multiplique isso pelas 100 ou 200 estações de uma rede de médio porte e verá o tamanho da dor
de cabeça que isso pode representar.
Para resolver o problema das colisões é possível dividir a rede em vários segmentos, utilizando
bridges ou switchs ou mesmo partir para o uso de roteadores, de acordo com o tamanho da
rede.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Color Depth"
        p.meaning = """
            Profundidade de cor, medida através do número de bits usados para representar cada ponto da
            imagem. Apenas 8 bits por ponto, permitem apenas 256 cores. Este é o color depth adotado pelo
            formato GIF por exemplo. Outros formatos, como o JPEG utilizam 24 bits por ponto, o suficiente
            para 16 milhões de cores.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Concatenar"
        p.meaning = """
            Juntar dois arquivos (geralmente dois documentos de texto) num só. No Linux o comando cat é
            um exemplo de aplicativo que cumpre esta tarefa, permitindo juntar arquivos, enviá-los para
            dispositivos (impressora, disquete, etc.) entre outras utilizadades.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CompactFlash"
        p.meaning = """
            A memória Flash é o meio armazenamento de dados mais usados em câmeras digitais e
            handhelds, por consumir pouca energia e permitir a criação de dispositivos bastante compactos.
            O formato CompactFlash consiste em pequenos cartões, medindo apenas 3.64 x 4.28 x 0.33
            centímetros, que podem armazenar até 512 MB de memória. Existem adaptadores que permitem
            instalar estes cartões em slots PCMCIA, comuns nos notebooks.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Compilador"
        p.meaning = """
            Os computadores não entendem nada além de comandos, dados e endereços escritos em
            linguagem binária. Mas, qualquer ser humano que se disponha a tentar desenvolver um
            programa complexo programando diretamente em linguagem de máquina simplesmente vai ficar
            louco muito antes de concluir seu trabalho :-)
            Para resolver este impasse, surgiram as linguagens de programação, que permitem escrever
            programas usando comandos fáceis de lembrar e funções já prontas. O compilador é programa
            que permite transformar este código escrito na linguagem de programação usada em linguagem
            de máquina, gerando o binário que pode ser executado. Um exemplo de compilador muito usado
            atualmente é o GCC da Free Software Fundation, que possui módulos para compilar programas
            de várias linguagens.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Compilar"
        p.meaning = """
            Depois de escrever qualquer programa é preciso compilar o código fonte para gerar o arquivo
            binário que poderá finalmente ser executado. Este arquivo binário não pode ser alterado
            diretamente (a menos que você seja algum tarado por instruções de máquina), para fazer
            qualquer modificação você precisa alterar o código fonte e compila-lo novamente.
            Programas escritos em algumas linguagens, como o perl, python e bash não precisam ser
            compilados, eles podem ser executados diretamente, pois o código é executado por um
            interpretador de comandos e não executado diretamente. Programas escritos nestas linguagens
            são chamados de scripts e são geralmente muito mais simples e rápidos de fazer, embora
            sempre existam algumas limitações.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = """
            Compilado dinâmicamente, Compilado estaticamente (dynamic compiled,
            estaticaly compiled)

            """.trimIndent()
        p.meaning = """
            Estes dois termos são muito comuns entre os programas do Linux e referem-se às duas formas
            de gerar um pacote instalável.
            A primeira forma, e mais simples para quem for instalar é gerar um pacote compilado
            estaticamente. Desta forma são incluídos no pacote todos os arquivos e bibliotecas de que o
            programa precisa para funcionar. Ele pode rodar em qualquer distribuição Linux, basta descompactar o pacote e executar. Isto funciona muito bem com programas como o OpenOffice
            e o Mozilla, que utilizam suas próprias bibliotecas gráficas, necessitando de pouca coisa do
            sistema de qualquer forma.
            O problema dos pacotes compilados estaticamente é que na maioria dos casos os programas
            ficam muito maiores que o necessário. Por exemplo, se existe uma biblioteca de 5 MB que é
            utilizada simultâneamente por três programas, de 2 MB cada um. Se os três forem compilados
            estaticamente, cada um incluirá uma cópia da biblioteca e, ao abrí-los simultâneamente a
            biblioteca seria carregada três vezes na memória!
            Nos programas compilados dinâmicamente todos os arquivos são compilados separadamente, de
            forma que uma mesma biblioteca nunca é carregada duas vezes (a não ser em casos raros
            quando uma versão antiga é mantida para assegurar compatibilidade com alguns aplicativos).
            Isso maximiza o uso do espaço e faz com que o sistema fique muito mais leve e rápido (lembrese da biblioteca de 5 MB carregada três vezes na memória...) porém faz com que surjam
            problemas de dependências ( o programa x precisa da biblioteca y para funcionar).
            As dependências eram uma grande dor de cabeça no passado mas atualmente os gerenciadores
            de pacotes são capazes de lidar bem com isso. Ao tentar instalar o programa x ele simplesmente
            avisará que será preciso instalar também a biblioteca y e se encarregará de instalar os dois sem
            muitas delongas. Às vezes dá uma certa revolta ter que instalar 10 MB de pacotes por causa de
            um programinha de 200 K, mas ainda é muito melhor do que se todos esses pacotes fossem
            incluídos diretamente dentro do programinha, deixando-o com 10,2 MB
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Composite Black"
        p.meaning = """
            Termo relacionado com impressão. O Composite Black, ou preto composto, é obtido através da
            mistura das três cores primárias. Este método é usado em algumas impressoras que utilizam
            apenas um cartucho colorido, sem tinta preta.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Compression"
        p.meaning = """
            Compressão, técnica usada para diminuir o tamanho dos arquivos de áudio, vídeo e imagens, a
            fim de diminuir seu tempo de transmissão via rede ou economizar espaço. Existem tanto
            algoritmos que permitem compactação sem perda de qualidade, quanto algoritmos que
            sacrificam parte da qualidade a fim de gerar arquivos menores.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CompTIA"
        p.meaning = """
            Computing Technology Industry Association. Esta é uma associação composta por mais de 8000
            empresas de tecnologia que têm como principal objetivo criar certificações para os profissionais
            da indústria, baseadas nas habilidades necessárias para as empresas. Os testes podem ser feitos
            em vários países, inclusive no Brasil e são exigência básica para vários cargos em muitas
            empresas. A certificação básica é a A+, que comprova que o candidato domina os
            conhecimentos básicos para montar PCs, instalar sistemas operacionais e solucionar problemas.
            Esta certificação é apenas o nível básico, depois existe uma série de certificados específicos,
            como o Net+, que indica especialização em redes TCP/IP, o Server+, voltado para a
            administração de servidores, que inclui tecnologias como SMP, RAID e SAN e o iNet+, que inclui
            conhecimentos sobre servidores, protocolos, segurança e aplicativos relacionados à Internet.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Comutador"
        p.meaning = """
            Você já deve ter ouvido falar que o sistema telefônico atual é "comutado". Isto significa que o
            seu telefone esta ligado a uma central, que encaminha suas ligações para o número apropriado,
            estabelecendo a ligação. Ao desligar, a central desfaz a ligação para poder utilizar a mesma
            linha em novas ligações. Esta é a função de um comutador, endereçar várias entradas para
            várias saídas. Hoje em dia os comutadores são usados em inúmeras aplicações, no próprio
            sistema telefônico, em vários tipos de redes de comunicação e até mesmo na forma de
            dispositivos muito mais simples, como por exemplo aqueles comutadores para ligar duas
            impressoras no mesmo micro, onde mudamos a posição de uma chave para usar uma ou outra.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Concurrent PCI"
        p.meaning = """
            É um recurso que permite que periféricos ISA e PCI instalados na máquina realizem
            transferencias de dados simultaneamente. Esta opção aparece no Setup de algumas placas mãe.
            Deixa-la ativada representa uma pequena melhora no desempenho.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Controller-Based"
        p.meaning = """Este é o antônimo de "Host-Based", ambos os termos se referem a modems. Um modem "HostBased" não é nada mais do que um Softmodem ou "WinModem", que utiliza o processamento do
PC onde está espetado (o host no nome) para emular funções que não são executadas pelo
modem. Um modem "Controller-Based" por sua vez é um Hardmodem, que inclui todos os
circuitos necessários e é controlado através de comandos AT.
As principais diferenças entre os dois tipos de modems são:
a) Envio e recebimento de dados: Os hardmodems utilizam uma UART que armazena os dados a
enviar e já recebidos de forma que o processador pode transferir os dados em blocos
relativamente grandes, diminuindo o número de vezes em que o processador precisa parar seu
trabalho. Nos softmodems o processador (ordenado pelo software que emula as funções do
modem) precisa parar a cada poucos bytes a serem enviados ou recebidos
b) Correção de erros: Nos hardmodems o próprio modem verifica os pacotes de dados recebidos
e caso necessário pede a retransmissão. Nos softmodems tudo é feito pelo processador.
c) Compressão de dados: Para melhorar a velocidade de transmissão (sobretudo ao baixar
arquivos de texto e páginas html) os modens são capazes de comprimir os dados enviados e
descomprimir os recebidos. Os hardmodems incluem circuitos que cuidam desta tarefa. Nos
softmodems tudo é feito pelo software às custas dos ciclos do processador principal.
d) Comandos AT: Nos hardmodems o sistema operacional se comunica com o modem através de
comandos AT para discar, enviar dados, etc. Existem inclusive programas como o minicom
(linux) que permitem controlar diretamente o modem. No caso dos softmodems esta é apenas
mais uma função emulada pelo programa. Um softmodem consome em média 150 milhões de ciclos de processamento por segundo, o que
equivale a aproximadamente 75 MHz em um processador Pentium ou 50 MHz num processador
Pentium III, Pentium 4 ou Athlon. A diferença é mais perceptível em sistemas como o Windows
95/98/SE/ME que possuem uma multitarefa mais frágil e menor em sistemas modernos como o
Linux e o Windows NT/2000/XP.
Apesar disso os softmodems são mais populares hoje em dia pois custam cerca de 50% menos e
a perda de desempenho é cada vez menos perceptível conforme os processadores ficam mais e
mais rápidos. O principal motivo para evitar os softmodems é a dificuldade em instalá-los no
Linux.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cookie"
        p.meaning = """
            Biscoito em inglês. São pequenos códigos gravados na sua máquina quando você acessa
            determinados sites. Da próxima vez que voltar ao mesmo o servidor poderá identificá-lo lendo o
            Cookie que foi gravado da última vez. Os Cookies podem ser usados para fins úteis, como por
            exemplo dispensar você de digitar username e senha toda vez que acessar o site, mas também
            podem ser utilizados para espionar os hábitos de navegação do usuário.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Coppermine"
        p.meaning = """
            Nome código dos processadores Pentium III que trazem cache L2 embutido, operando na
            freqüência do processador. Todos os Coppermine são produzidos usando uma técnica de 0.18
            mícron e são mais rápidos que os processadores Pentium III antigos, os Katmai, que utilizam
            cache externo. O sucessor é o Pentium III Tualatin que utiliza uma técnica de produção de 0.13
            mícron e traz 512 KB de cache L2 integrado ao processador.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Coppermine 128"
        p.meaning = """
            Estes são os Celerons produzidos em versões de 533 MHz a 1.0 GHz, que compartilham a
            mesma arquitetura do Pentium III Coppermine. Na verdade, os dois processadores são idênticos,
            com a diferença de que o Celeron tem metade do seu cache L2 desativado ainda em fábrica,
            chegando às nossas mãos com apenas 128 KB, que juntamente com o uso de bus de 66 MHz (ou
            100 MHz nas versões de 800 MHz em diante) garante a diferença de desempenho entre os dois
            processadores, já que o Pentium III utiliza bus de 00 ou 133 MHz.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Covington"
        p.meaning = """
            Nome código da primeira geração do Celeron, os famosos Celerons sem cache L2, que foram
            produzidos apenas em versão de 266 e 300 MHz. a partir daí, todos os modelos do Celeron
            trazem 128 KB de cache L2.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CPU"
        p.meaning = """Central Processing Unit. Era mais usado na época dos mainframes, o termo mais atual é
processador ou "processor" em Inglês."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CP/M"
        p.meaning = """Control Program for Microprocessors ou Sistema de Controle para Microprocessadores. Este é
considerado o primeiro sistema operacional para computadores pessoais. Foi desenvolvido no
início da década de 70 pela Digital Research e ganhou versões para várias plataformas.
Ironicamente, a Digital Research recusou a proposta de desenvolver uma versão do CP/M para
micros PC. A "missão" foi aceita pela Microsoft, que desenvolveu seu MS-DOS e com ele dominou
o mercado.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CPRM"
        p.meaning = """
            Content Protection for Removable Media. Esta é uma controversa tecnologia, desenvolvida pelo
            4C Entity, uma associação originalmente comporta pela Intel, IBM, Matsushita e Toshiba, que
            visa impedir a cópia não autorizada de músicas ou outros tipos de conteúdo protegido.
            O CPRM é implantado diretamente a nível de hardware, por isso é mais complicado de burlar que
            sistemas de proteção implantados via software. Os primeiros alvos são mídias removíveis, como
            cartões de memória flash, CDs graváveis, etc. Chegou a ser cogitado o uso do CPRM também em
            discos rígidos, mas a repercussão negativa foi tamanha que os fabricantes recuaram. A idéia do
            CPRM seria impulsionar o comércio de conteúdo via web, como e-books, musicas e vídeos,
            oferecendo aos distribuidores uma garantia de que seu produto não seria copiado, pelo menos
            não facilmente. Um dispositivo compatível com o CPRM simplesmente se recusaria a copiar um
            arquivo protegido.
            É difícil acreditar que esta tecnologia tenha futuro, pois sempre haveriam fabricantes produzindo
            dispositivos sem a proteção, devido à grande demanda por parte dos usuários, que não se
            curvariam a este controle sem espernear.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Computador Quântico"
        p.meaning = """
            Num processador quântico, temos átomos ao invés de transístores. Ao invés de bits temos bits
            quânticos, ou qubits. A idéia fundamental é que num átomo, a rotação de cada elétron
            corresponde a um pequeno movimento magnético, que pode ser controlado caso o átomo seja
            colocado sobre uma superfície suficientemente sensível
            Uma peculiaridade interessante é que enquanto um transístor permite apenas dois estados, ou
            seja, ligado ou desligado, cada qubit possui três estados diferentes. Dois estados são
            determinados pela rotação dos elétrons (horário ou anti-horário), enquanto o terceiro é uma
            característica bastante peculiar dentro do mundo quântico, onde os elétrons podem girar
            simultâneamente nos dois sentidos. Sim, parece estranho, e é por isso que existem tantos
            cientistas pesquisando isso, mas de qualquer forma, combinado com os dois estados anteriores
            temos um total de 4 estados possíveis, o que permite que cada qubit processe ou armazene dois
            bits simultaneamente.
            Isto permite ampliar exponencialmente a capacidade dos processadores quânticos, já que dois
            qubits correspondem a 4 bits, 3 qubits correspondem a 8 bits e 5 qubits correspondem a 32 bits.
            10 qubits seriam suficientes para 1024 bits, enquanto 20 correspondem a mais de um milhão.
            Esta pode ser a grande chave para aumentar de forma inimaginável tanto a potência dos
            processadores quanto a capacidade dos dispositivos de armazenamento de memória. Não estou
            falando de processadores operando a 100 ou 500 GHz, mas de computadores capazes de
            resolver em poucos segundos cálculos que um processador atual demoraria milhões de anos
            para resolver. Os primeiros computadores quânticos já estão entre nós apesar de estarem muito longe de
            realizarem as maravilhas que descrevi acima. De fato, a maior conquista até agora foi a de um
            grupo de cientistas da IBM e estudantes da universidade de Stanford afirmaram ter conseguido
            resolver uma versão simples do algoritmo de Shor, uma fórmula para gerar chaves criptográficas
            extremamente difíceis de quebrar, utilizando fatoração de números, onde é preciso um grande
            poder de computação para encontrar os fatores, mas uma simples multiplicação para obter o
            número original.
            O algoritmo simples que conseguiram resolver não é nada mais do que encontrar os fatores do
            número 15 (5 e 3). A conquista não tem nenhuma aplicação prática, naturalmente, mas mostra
            que os estudos continuam avançando e abre as portas para que algoritmos mais complexos
            sejam resolvidos conforme consigam produzir computadores quânticos mais poderosos.
            Para solucionar o problema o grupo desenvolveu uma molécula com 7 qubits. Na verdade não foi
            usada uma única molécula, mas um tubo cheio (um bilhão de bilhão como divulgado),
            manipulada através de um aparelho de ressonância magnética, controlado por um computador
            convencional, a mesma técnica que vêm sendo utilizada desde os primeiros experimentos.
            Pode demorar 20 anos ou 100 anos, mas com os investimentos que vêm sendo feitos parece só
            questão de tempo para os computadores quânticos evoluírem a ponto de substituir o silício.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Core"
        p.meaning = """Centro ou Núcleo. Em informática, o uso mais comum é em relação ao processador. O "core"
neste caso, é a pequena pastilha de silício que contém todos os transístores. Esta pastilha, que
mede pouco menos de um centímetro quadrado na maioria dos processadores é encapsulada
numa estrutura de cerâmica, metal, plástico, ou mesmo fibra de vidro, formando os
processadores que encontramos à venda.
O termo Core também é usando em relação à arquitetura usada no processador. Por exemplo,
quando alguém fala em "processadores Celeron com core Coppermine" está se referindo aos
Celerons que usam a arquitetura Coppermine, a mesma usada no Pentium III. Existem também
os Celerons com core Deschutes (mais antigos, já descontinuados) e a partir de 2002 teremos os
Celerons baseados no core Tualatin, um projeto mais avançado, que permite produzir
processadores usando transístores de 0.13 mícron, que são mais rápidos, consomem menos
energia e são mais baratos de se produzir."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cracker"
        p.meaning = """
            Existem duas definições diferentes para este termo.
            Na primeira, o cracker é um vândalo virtual, alguém que usa seus conhecimentos para invadir
            sistemas, quebrar travas e senhas, roubar dados etc. Alguns tentam ganhar dinheiro vendendo
            as informações roubadas, outros buscam apenas fama ou divertimento. Na hierarquia Hacker o
            Cracker está acima do Lamer (que sabe muito pouco) mas abaixo do Hacker, que é alguém de
            mais maturidade, que ao invés de usar seu conhecimento para destruir tudo que vê pela frente,
            o utiliza para construir coisas, desenvolver novos sistemas (principalmente de código aberto)
            etc.
            Uma segunda definição, mais branda, é alguém que quebra travas de segurança de programas e
            algoritmos de encriptação, seja para poder rodar jogos sem o CD-ROM, ou gerar uma chave de
            registro falsa para um determinado programa, quebrar as travas anti-cópia usadas em alguns softwares, quebrar o sistema de encriptação do DVD (este último realmente importante, pois
            permitiu que os usuários do Linux e outros sistemas não Windows pudessem assistir DVDs). Ou
            seja, nesta segunda definição o Cracker é alguém na margem da lei, cujas ações ainda são
            ilegais, embora muitas vezes eticamente justificáveis (os usuários têm direito a fazer cópias de
            CDs legalmente comprados, tem direito de assistir DVDs no Linux e assim por diante).
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Craftworks"
        p.meaning = """
            Uma distribuição Linux lançada em 1995, voltada principalmente para programadores, incluindo
            compiladores de várias linguagens e outras ferramentas. Infelizmente, o Craftworks Linux foi
            descontinuado a alguns anos, enquanto estava na versão 2.2.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CRC"
        p.meaning = """
            Cyclical Redundancy Check, um método de correção de erros, onde é enviada uma quantidade
            relativamente grande de dados e em seguida os bits de checagem Encontrado algum erro, todo o
            pacote de dados precisa ser retransmitido. É usado em modems e em alguns outros dispositivos.
            Um erro de CRC significa justamente que, por qualquer motivo, os dados estão chegando
            corrompidos ao destino.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Criptografia"
        p.meaning = """
            Consiste em cifrar um arquivo ou mensagem usando um conjunto de cálculos. O arquivo cifrado
            (ou encriptado) torna-se incompreensível até que seja desencriptado. Os cálculos usados para
            encriptar ou desencriptar o arquivo são chamados de chaves. Apenas alguém que tenha a chave
            poderá ler o arquivo criptografado.
            Existem basicamente dois sistemas de uso de chaves. No primeiro são usadas chaves simétricas,
            onde as duas partes possuem a mesma chave, usada tanto para encriptar quanto para
            desencriptar os arquivos. No segundo sistema temos o uso de duas chaves diferentes, chamadas
            de chave pública e chave privada. A chave pública serve apenas para encriptar os dados e pode
            ser livremente distribuída, a chave privada por sua vez é a que permite desencriptar os dados.
            Neste sistema o usuário A, interessado em enviar um arquivo para o usuário B encriptaria o
            arquivo utilizando a chave pública do usuário B, distribuída livremente, e ao receber o arquivo o
            usuário B utilizaria sua chave privada, que é secreta para desencriptar o arquivo e ter acesso a
            ele. Ninguém mais além do usuário B poderia ter acesso ao arquivo, nem mesmo o usuário A
            que o encriptou.
            Existem vários níveis de criptografia e inclusive sistemas que utilizam vários níveis, encriptando
            várias vezes o mesmo arquivo utilizando chaves diferentes. Em geral, quanto mais complexo, for
            o sistema, mais seguro.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CRO"
        p.meaning = """
            Este é mais um dos cargos de chefia resumidos a uma sigla de três dígitos. CRO significa Chief
            Risk Officer, ou seja, executivo chefe de risco. O CRO é um cargo cada vez mais presente nas
            grandes empresas, sua função é avaliar todo tipo de risco que a companhia corre em seus diversos negócios, permitindo que os depois executivos tenham uma base mais sólida para
            tomar suas decisões.
            Por exemplo, abrir uma filial na Colômbia pode a princípio parecer um bom negócio para a
            empresa X, devido à uma carência do mercado local, mas um sistema político instável e fatores
            como a presença da guerrilha, alto índices de sequestros, etc. podem tornar o negócio inviável. É
            o CRO quem avaliaria o nível de risco neste caso.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Crosstalk"
        p.meaning = """
            Interferência causada pela proximidade entre dois circuitos ou cabos, que diminui a distância
            que o sinal será capaz de percorrer. Este é um problema grave em todos os sistemas onde são
            utilizados vários pares de cabos, como por exemplo nos cabos de rede de par trançado, nos
            cabos IDD, etc.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cross Platform (Multiplataforma)"
        p.meaning = """
            É um software que pode rodar em várias arquiteturas de computadores diferentes, como PCs,
            Macs, Alphas, etc. Um exemplo são programas em Java, onde o programa roda sobre um outro
            software, a chamada Java Virtual Machine, ou máquina virtual Java. Apenas a JVM muda de um
            sistema para outro, o programa em sí pode ser o mesmo. É por isso que o Java vêm sendo cada
            vez mais utilizado em aplicações relacionadas à web.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cross-over"
        p.meaning = """
            É um tipo de cabo de rede, feito utilizando cabos de par trançado, onde numa das pontas a
            posição de dois dos pares de fios é trocada. Com isto, o cabo permite ligar dois micros
            diretamente, sem precisar de um Hub. Este tipo de cabo também pode ser utilizado para
            interligar dois hubs.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CRM"
        p.meaning = """
            Customer Relationship Management. Um sistema de CRM consiste ao mesmo tempo num
            software de banco de dados e uma metodologia a ser seguida pelos funcionários. O objetivo é
            reunir informações sobre os clientes da empresa, que permitam traçar estratégias de marketing
            mais eficientes, implantar programas de fidelidade, etc.
            Através do CRM a empresa pode por exemplo acompanhar os pedidos de cada cliente, e
            cruzando estes dados com o poder aquisitivo, escolaridade, etc., descobrir quais são os clientes
            com maior possibilidade de comprar novos produtos da empresa e concentrar as campanhas
            publicitários neles. As possibilidades são muitas, mas em compensação um sistema de CRM é
            muito caro e trabalhoso de implantar, é um investimento que paga-se apenas no longo prazo e
            tem uma chance muito grande de não dar em nada.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CRT"
        p.meaning = """
            Catodic Ray Tube, os monitores de raios catódicos, ou seja, que utilizam tubo de imagem, que
            ainda são os mais comuns atualmente. Os monitores CRT utilizam uma tecnologia descoberta ainda no início do século, mas ao mesmo tempo incorporaram tantos avanços que é impossível
            não se surpreender com o nível de qualidade que alcançaram.
            O princípio de funcionamento de um monitor CRT é usar um canhão de elétrons, montado na
            parte de trás do tubo de imagem para acender as células de fósforo que compõe a imagem. O
            canhão emite elétrons, que possuem carga negativa. Para atraí-los até a parte frontal do tubo é
            utilizada uma cinta metálica chamada de anodo, que é carregada com cargas positivas. O canhão bombardeia uma a uma as células de fósforos, sempre da esquerda para a direita e de
            cima para baixo. Ao bombardear a última célula ele volta à posição inicial e recomeça a
            varredura. O número de vezes por segundo que o canhão é capaz de bombardear a tela é
            chamada de taxa de atualização. Para que a imagem seja sólida o suficiente para não causar
            danos aos olhos a taxa de atualização deve ser de pelo menos 75 Hz (75 vezes por segundo).
            Com menos que isto surge o flicker, que ocorre devido à perda de luminosidade das células de
            fósforo do monitor. Usando uma taxa de renovação de menos de 75Hz, o tempo que o feixe de
            elétrons demora para passar é muito longo, fazendo com que células percam parte do seu brilho,
            sendo reacendidas bruscamente na próxima passagem do feixe de elétrons. Isto faz com que as
            células pisquem, tornando a imagem instável. Esta instabilidade, além de desconfortável, faz
            muito mal aos olhos. Uma taxa de atualização de 75 Hz é considerada o mínimo para manter a
            saúde dos seus olhos, mas o ideal é utilizar 85 Hz ou mais.
            A taxa de atualização do monitor depende da resolução utilizada. Um monitor de 15 polegadas
            recente é geralmente capaz de manter 85 Hz a 800x600 ou 75 Hz a 1024x768. Um monitor de
            17 polegadas já é capaz de manter 85 Hz a 1024x768, enquanto alguns monitores de 17, como
            os da linha Flatron são capazes de manter 85 Hz a 1280 x 1024.
            Um detalhe importante é que todos os monitores de CRT são analógicos, já que sinais elétricos
            de diferentes intensidades controlam o movimento e a potência do feixe de elétrons do monitor.
            Os monitores de LCD e outras tecnologias, como os OLED são totalmente digitais, já não
            possuem mais o problema do flicker, mas em compensação são bem mais caros.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Crusoé"
        p.meaning = """
            Este é o famoso processador de baixo consumo desenvolvido pela Transmeta. Veja também:
            Code Morphing
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Csel"
        p.meaning = """
            Cable Select, uma configuração encontrada na maioria dos HDs. Geralmente são três opções:
            Master (mestre), Slave (escravo) ou Cable Select.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CSMA/CD"
        p.meaning = """Carrier Sense Multiple Access with Collision Detection. Este palavrão é o sistema de
gerenciamento de tráfego que garante o funcionamento das redes Ethernet. As redes Ethernet
utilizam uma topologia lógica de barramento, isto significa que mesmo ao utilizar um hub, as
estações comportam-se com se estivessem todas ligadas a um único cabo. Isso simplifica a
transmissão de dados e barateia os equipamentos, mas em compensação traz um grave
problema: as colisões de pacotes que ocorrem sempre que duas (ou mais) estações tentam
transmitir dados ao mesmo tempo.
O sistema CSMA/CD minimiza este problema através de um conjunto de medidas relativamente
simples: Antes de transmitir seu pacote, a estação "escuta" o cabo, para verificar se outra
estação já está transmitindo. Caso o cabo esteja ocupado ela espera, caso esteja livre ela
transmite.
Mesmo assim, como o sinal demora algum tempo para atingir todas as estações, existe uma
possibilidade considerável de que outra estação "escute" o cabo antes do sinal chegar até ela,
pense que o cabo está livre e também transmita dados. Neste caso as duas transmissões
colidirão em algum ponto do cabo. A estação que estiver mais próxima, a primeira a detectar a
colisão, emitirá um sinal de alta freqüência que anula todos os sinais que estiverem trafegando
através do cabo e alerta as demais estações sobre o problema. Ao receberem o sinal, todas as
estações param de transmitir dados por um período de tempo aleatório. Com isto, os dados
voltam a ser transmitidos, um pacote por vez.
Graças a este sistema, as colisões causam apenas uma pequena perda de tempo, mas não
causam perda de dados. Porém, como as colisões aumentam junto com o número de PCs na
rede elas podem tornar-se um problema sério em redes com mais de 30 ou 50 PCs. Neste caso é
possível utilizar switchs para dividir o tráfego da rede. Um switch divide a rede em dois (ou
mais) segmentos, diminuindo o número de colisões de pacotes.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CTO"
        p.meaning = """
            Chief Technology Officer ou diretor de tecnologia. Dentro da empresa, é o responsável pelo
            desenvolvimento ou adoção de novas tecnologias e desenvolvimento de novos produtos.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Cumine"
        p.meaning = """Uma gíria que se refere os processadores Pentium III Coppermine da Intel. O "Copper" no nome
significa cobre, Cu por sua vez é o símbolo do cobre na tabela periódica, daí a substituição para
economizar saliva na hora de falar.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Ciphertext"
        p.meaning = """É o contrário de "plain text" ou texto puro quando usado no sentido de transmissão de senhas e
outros dados sigilosos. Alguns protocolos, como por exemplo o FTP e o POP3 (e-mail) utilizam até hoje um sistema de autenticação muito simples, onde o login e senha são transmitidos de
forma não encriptada através da rede, como texto puro.
Isso abre brecha para vários tipos de ataque, já que qualquer um que consiga interceptar a
transmissão poderá obter os dados sem dificuldade alguma.
Uma das soluções para este tipo de problema é encriptar o texto. Protocolos como o SSH utilizam
um sistema de chaves públicas e privadas para isso. Depois de ser encriptado o texto passa a
ser chamado de Cipheryext, ou texto encriptado.
Agora ele pode até ser capturado, mas não fará sentido sem a chave de encriptação apropriada.
Um bloco de texto encriptado com uma chave de 512 bits por exemplo, como a usada pelo SSH
demoraria milhares de anos para ser desencriptado usando um ataque de força bruta. Por outro
lado, chaves mais primitivas, as de 40 bits por exemplo, podem ser quebradas em poucos
minutos.
Apesar disso, um grande número de bits não torna uma chave de encriptação segura, pois em
muitos casos existem brechas que permitem quebra-la com mais facilidade.
Um dos primeiros algoritmos de encriptação conhecidos era usado pelos Romanos e consistia em
simplesmente trocar cada uma das letras das palavras por outra letra diferente, uma técnica que
ficou conhecida como Encriptação de César.
Na Época parecia satisfatório, pois sem computadores parecia ser impossível adivinhar qual letra
correspondia a qual, até que um certo sábio se deu conta que era possível quebrar a chave
procurando pelas letras mais comuns no texto cifrado e comparando-as com as letras mais
usadas nas palavras do dicionário. Daí em diante tanto as chaves de encriptação, quanto as
técnicas para quebrá-las não pararam de evoluir."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "CZA"
        p.meaning = """
            Este será um chip da Via/Cyrix compatível com as placas mãe para Pentium 4, que será
            produzido numa técnica de produção de 0.10 mícron. Este processador terá mais estágios de
            pipeline, seguindo a idéia do Pentium 4 de realizar menos processamento por ciclo de clock, mas
            em compensação ser capaz de operar a frequências mais altas. Graças a isto o CZA será
            produzido em versões a partir de 3.0 GHz, mas apenas em 2004.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DAC"
        p.meaning = """
            Digital to Analog Converter, o inverso do ADC, refere-se a um dispositivo que transforma um
            sinal digital num sinal analógico. É o componente da placa de som responsável por transformar o
            sinal digital recebidos do processador no sinal analógico que é enviado para as caixas de som.p
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Daemon"
        p.meaning = """
            É um programa que roda em background, sempre pronto para receber solicitações de outros
            programas, executar o que foi pedido e retornar uma resposta. O termo Daemon (demônio) vem
            da mitologia grega, onde os Daemons são espíritos guardiões. O símbolo do FreeBSD por
            exemplo, é um Daemon estilizado.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Daisy Wheel Printer"
        p.meaning = "Impressora de Margarida"
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Darwin"
        p.meaning = """
            O MacOS X pode ser dividido em duas partes, o Darwin, o sistema operacional em sí e a
            Interface gráfica Aqua, que roda sobre ele. O Darwin é baseado no Free BSD, uma versão open
            source do Unix, e é um sistema de código aberto, a interface Aqua, o principal atrativo do MacOS
            X por sua vez é propriedade da Apple. O Darwin está disponível para download no site da Apple,
            inclusive com os códigos fonte. Existe até mesmo uma versão para micros PC, apesar de que
            sem a Interface, o Darwin não oferece nenhuma vantagem sobre o FreeBSD ou o Linux.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DAT"
        p.meaning = """
            Originalmente foi um padrão criado para gravar áudio digital, com qualidade de CD em fitas
            magnéticas especiais. Em 1988 Sony e HP aperfeiçoaram o padrão, que passou a ser usado
            também para gravar dados nas mesmas fitas. Hoje em dia as fitas DAT ainda são muito
            utilizadas para fazer backup, pois são relativamente baratas e armazenam até 40 GB de dados.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Data Cache/Instruction Cache"
        p.meaning = """
            Na maioria dos processadores atuais o cache L1 é dividido em dois blocos, que armazenam
            dados e instruções. No Athlon temos 64 KB para dados e mais 64 KB para instruções, no
            Pentium III temos 16 KB para dados e 16 KB para instruções e assim por diante. Esta divisão
            melhora a velocidade de acesso, pois permite que os dois blocos sejam acessados simultaneamente.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Data pre-fetch"
        p.meaning = """
            Este é um recurso suportado por quase todos os processadores atuais, pois permite melhorar
            bastante o desempenho do sistema. Fetch significa "trazer". Este é um recurso implantado no
            controlador de cache que analisa o código a ser processado e busca na memória RAM os dados
            que serão necessários nos próximos ciclos de processamento. Quando o processador realmente
            precisa dos dados, estes já estão carregados no cache, evitando um lento acesso à memória
            RAM. Este recurso é um dos responsáveis pelo impressionante desempenho do cache nos
            processadores atuais, apesar do desempenho do data pre-fretch variar bastante entre os
            diferentes modelos de processadores. O Athlon XP por exemplo, tem um circuito de data prefetch bastante melhorado em relação ao do Athlon Thunderbird.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Data Warehouse"
        p.meaning = """
            É um mega banco de dados, destinado a armazenar informações sobre os hábitos de consumo
            dos clientes de uma determinada empresa, a fim de descobrir formas de aumentar as vendas e
            melhorar os serviços. É possível descobrir por exemplo relações entre as vendas de dois ou mais
            produtos: que os consumidores que compram sabão OMO são os mesmos que compram creme
            dental Sorriso ou outras combinações do gênero. O uso deste tipo de banco de dados é um dos
            motivos dos principais supermercados incentivarem os clientes a usarem os cartões oferecidos
            pela loja, com descontos, facilidade de pagamento, etc. Quando um cliente compra com o cartão
            da loja, é possível identificar a compra no banco de dados, coisa que não é possível no caso dos
            clientes que pagam em dinheiro.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DC"
        p.meaning = """
            Direct Current, corrente elétrica que trafega numa única direção, usada por computadores e
            dispositivos eletrônicos em geral. Num PC, a fonte de alimentação tem a função de converter a
            corrente AC (alternada) da tomada na corrente contínua, DC usada pelo equipamento.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DDC"
        p.meaning = """
            Display Data Channel. Este é o padrão desenvolvido pela VESA que possibilitou o surgimento dos
            monitores plug-and-play. Enquanto os monitores antigos apenas recebiam os sinais que
            representavam as imagens a serem exibidas, como uma impressora, os monitores DDC são
            capazes de se comunicar com a placa de vídeo e enviar dados como a marca e modelo, as
            resoluções e taxas de atualização suportadas, etc. É isto que permite que o Windows (e também
            o Linux) seja capaz de reconhecer corretamente um novo monitor e mostrar apenas as
            resoluções suportadas por ele nas configurações de vídeo.
            Naturalmente é preciso que tanto o monitor quanto a placa de vídeo sejam compatíveis com o
            DDC. Não adianta querer ligar um monitor VGA mono de 93 numa placa atual, ou um monitor
            atual numa Trident 9680 ou outra placa antiga que o recurso não funcionará.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DD-CD"
        p.meaning = """
            Double Density CD, uma tecnologia desenvolvida pela Sony, que consiste em CDs com o dobro
            da capacidade, 1.3 GB no total. O DD CD será uma espécie de intermediário entre os CDs
            comuns e os DVDs. O grande problema do CD de dupla densidade é que ele não será compatível
            com os gravadores e leitores atuais. Apesar dos novos equipamentos, compatíveis como novo
            padrão utilizarem basicamente os mesmos componentes dos atuais, o que garante que pelo
            menos o custo de produção não será muito mais alto, os interessados em utilizar os CDs de 1.3
            GB terão de comprar novos aparelhos.
            Como consolo, existirá compatibilidade retroativa, ou seja, um leitor compatível como novo
            padrão, lerá também CDs convencionais. Existirão também CDs de 1.3 GB graváveis e
            regraváveis, como hoje em dia, mas, novamente, será necessário comprar um gravador que
            seja compatível com o padrão. O aumento da capacidade foi conseguido através da diminuição
            da largura das trilhas de dados e também do comprimento dos pitches que armazenam dados. A
            Sony prometeu finalizar o formato até Setembro (2001), quando as companhias que já o
            licenciaram poderão iniciar a produção.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DDR"
        p.meaning = """
            A sigla DDR vem de double data rate. A sigla indica justamente a capacidade das memórias DDR
            transmitirem dados duas vezes por ciclo, uma transferência no início do ciclo de clock e uma
            segundo transferência no final do pulso. Um módulo DDR de 266 MHz por exemplo, não trabalha
            a 266 MHz, mas sim a apenas 133 MHz, entretanto, como são feitas duas transferências por
            ciclo, o desempenho é equivalente ao que seria alcançado por um módulo de 266 MHz. Existem
            dois tipos de memórias DDR, as PC-1600 e PC-2100, que operam respectivamente a 100 e 133
            MHz, sempre com duas transferências por ciclo. Os números referem-se às capacidades teóricas
            de transmissão de dados dos módulos, respectivamente 1600 e 2100 MB/s.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DDR II"
        p.meaning = """
            Serão as sucessoras das memórias DDR. O nome DDR II ainda é provisório, mas as novas
            memórias suportarão 4 acessos por ciclo, novamente dobrando a velocidade de transmissão de
            dados teórica em relação às memórias DDR. Uma vantagem adicional é que utilizarão uma
            voltagem um pouco mais baixa. Enquanto as memórias SDRAM comuns usam voltagem de 3.3 V
            e as DDR usam 2.5 V, as DDR II utilizarão apenas 1.8. O padrão ainda está em estágio primário
            de desenvolvimento. Os novos módulos devem começar a chegar no mercado apenas em 2003.
            Assim como as memórias DDR, as DDR II são baseadas na mesma tecnologia usada a vários
            anos nas memórias SDRAM, por isso, produzidos em grande quantidade os módulos não terão
            um custo de produção muito mais alto.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Debug"
        p.meaning = """
            Um programa, ou componente de um programa que ajuda o programador a encontrar erros de
            programação em seu código ou mesmo em programas desenvolvidos por terceiros. Este era
            também um comando do DOS e pode ser usado também como verbo, “to debug”, em relação a
            alguém corrigindo erros num programa.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Decompression"
        p.meaning = """
            Descompressão, o inverso de compressão. Consiste em obter o arquivo original a partir de um
            arquivo comprimido.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Deerfield"
        p.meaning = """
            Esta será uma versão de baixo custo do Itanium, baseada no core Madison que será lançada em
            2003. O Deerfield terá menos cache L3, ou talvez nenhum (contra os 6 MB do Madison) e
            permitirá o uso de apenas dois processadores por placa, mas em compensação será muito mais
            barato, destinado a servidores de baixo e médio custo. Mesmo assim, este processador não será
            muito interessante para o mercado doméstico, devido à falta de aplicativos de 64 bits compilados
            para o conjunto de instruções IA64 da Intel e ao preço bem mais alto que o dos Pentium 4 e
            Athlon.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Default"
        p.meaning = """Todos os programas oferecem algumas opções de configuração, desde coisas sem muita
importância como ícones e cores, até configurações cruciais de segurança.
Cada um possui suas próprias preferências e necessidades, mas é impossível que o programa
possa vir direto de fábrica configurado de um modo que agrade a todo mundo ao mesmo tempo.
Os programadores tentam então usar opções default (ou padrão) que atendam à maioria das
pessoas, ou simplesmente permitam que o programa "funcione". Usuários mais avançados
podem depois configurar o programa adaptando-o às suas necessidades.
"Default" era o sobrenome do programador Francês que inventou o termo. Como a palavra é
originária do Francês, o correto é pronunciar "defô" e não "default"."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Degauss"
        p.meaning = """
            O magnetismo é o princípio básico de qualquer monitor CRT, onde um conjunto de campos
            magnéticos é usado para direcionar o feixe de elétrons que forma a imagem no monitor. Este
            feixe passa através da shadow mask, uma chapa de metal perfurada que faz com que o feixe
            atinja apenas um conjunto de células de fósforo de cada vez, impedindo que as vizinhas
            recebam cargas fora de hora, o que diminuiria a precisão da imagem.
            O problema é que outros campos magnéticos próximos, como por exemplo um par de caixas
            acústicas sem blindagem muito perto do monitor, podem magnetizar a shadow mask,
            distorcendo a imagem. A função Degauss, encontrada em muitos monitores permite
            desmagnetizar o monitor sempre que necessário, eliminando o problema.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DeMilitarized Zone (DMZ) "
        p.meaning = """
            Implantar um firewall, com regras rígidas de segurança e que não permita que as máquinas da
            rede sejam acessadas por máquinas remotas é uma grande conquista em termos de segurança.
            Mas, muitas vezes, algumas máquinas da rede precisam receber acessos externos. É o caso de
            servidores SMTP, servidores Web ou, numa rede mais doméstica, máquinas usadas para jogos
            multiplayer via Web. Para permitir que estas máquinas possam desempenhar suas funções, mas que ao mesmo tempo o restante da rede continue protegida, muitos firewalls oferecem a opção
            de criar uma zona onde a vigilância é mais fraca, a DMZ ou DeMilitarized Zone. Em geral é
            necessário especificar uma faixa de endereços IP, ou informar diretamente os endereços das
            máquinas que devem ser incluídas na zona.
            O firewall passa então a permitir que estas máquinas recebam acesos externos, mantendo a
            vigilância sobre as demais máquinas da rede.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Demo"
        p.meaning = """
            Demonstration ou demonstração. Um programa que vem com apenas algumas funções
            habilitadas. Serve para que os interessados possam ter uma idéia das funções do programa
            antes de comprá-lo.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dependency hell"
        p.meaning = """Este é um termo pejorativo usado no mundo Linux, uma espécie de primo da "DLL Hell" do
Windows. Desde as fases embrionárias do desenvolvimento do sistema, existe uma grande
colaboração entre os desenvolvedores dos diferentes programas que formam o que conhecemos
como "Linux". Isto faz com que exista uma tendência ao reaproveitamento de código e funções.
Por exemplo, digamos que você queira desenvolver um programa que funcione como um
ambiente de rede, similar ao incluído no Explorer do Windows. Você até poderia tentar
desenvolver o programa do zero, mas seria muito mais simples fazer com que ele simplesmente
se integrasse ao smb-client, que já oferece todas as funções para enxergar e acessar os
compartilhamentos. Assim você poderia se concentrar na interface e funcionalidade do
programa ao invés de reinventar o que já existe. É justamente por isso que temos um número
tão grande de programas open source, você pode ir direto para a parte "divertida" da coisa.
O lado ruim é que para usar o seu programa o usuário precisará ter também o smb-client
instalado no sistema. Antigamente isso era um problema, pois o usuário tinha que saber quais
pacotes eram necessários para um certo programa e instalar tudo manualmente antes d poder
utilizá-lo. Em alguns casos um programa precisava de outro, que precisava de outro, criando
uma corrente aparentemente sem fim.
Felizmente este problema já foi solucionado na maioria das distribuições. No Debian e derivados
temos o apt-get, o Mandrake temos o urpmi, no Conectiva temos o synaptic e assim por diante.
Estes gerenciadores de pacotes são "inteligentes" pois mantém um banco de dados com todos os
pacotes disponíveis e através dele sabem de quais outros pacotes um determinado programa
precisa.
Assim, ao instalar o Evolution por exemplo, ele verificará se você já tem todos os outros pacotes
necessários e, caso não tenha, se oferecerá para instalar tudo automaticamente pra você, como
se eles fizessem parte do programa.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Deschutes"
        p.meaning = """
            Foi a segunda geração de processadores Pentium II, produzidos usando uma técnica de 0.25
            mícron. Esta segunda geração inclui todos os Pentium II acima de 300 MHz. Tanto os processadores Pentium II Klamath, quanto os Deschutes possuem as mesmas características: o
            formato de cartucho, os mesmos 512 KB de cache half-speed, etc., o que muda é apenas a
            técnica de produção e as frequências de operação. O Pentium II com core Deschutes existiu em
            versão de até 450 MHz, quando foi substituído pelo Pentium III com core Katmai. Veja também:
            Klamath, Katmai.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Desk-in PC (ou Desk PC)"
        p.meaning = """Um "desktop" é um PC desenvolvido para ser usado sobre uma mesa, com teclado, mouse, etc.
Este é o formato de PC que utilizamos a mais de 20 anos, desafiado apenas pelos notebooks,
com suas vantagens e desvantagens. Os desk-ins são PCs que vão literalmente "dentro" da
mesa. A placa mãe e outros componentes, junto com o monitor, teclado e mouse são adaptados
de forma a fazerem parte do próprio móvel. Algumas vantagens são o fato da dissipação do
calor ser mais fácil, já que o espaço dedicado à placa mãe pode ser maior que o de um gabinete
tradicional, e a possibilidade de criar aplicações mais amigáveis para usuários leigos. Por
exemplo, um monitor sensível ao toque poderia ser adaptado numa posição que lembrasse a de
uma prancheta sobre a mesa."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Desknote"
        p.meaning = """Este é um conceito de computador portátil, originalmente introduzido pela ECS, com seus
desknotes da linha I-Buddie. Um desknote é um notebook um pouco maior que a média,
construído usando placas mãe, processadores e a maior quantidade possível de componentes
disponíveis para micros de mesa, evitando os caríssimos componentes destinados a notebooks.
Os slots PC-Card foram dispensados, em favor do modem e rede onboard e das portas USB e até
mesmo a bateria passou a ser externa e vendida separadamente, de forma a aumentar o espaço
interno e diminuir o custo.
Mesmo tendo que utilizar HDs de 2.5", CD-ROMs (ou DVD) e telas de LCD, os desknotes são
substancialmente mais baratos que um notebook tradicional da mesma configuração. Por
exemplo, no início de setembro de 2002 os desknotes mais simples, baseados no Via C3 podem
ser encontrados por menos de R$ 2.500, enquanto os notebooks mais baratos, baseados no
Celeron não saem por menos de R$ 4.000.
Os desknotes são destinados principalmente a quem pretende usá-los primariamente como
micros desktops, mas sem abrir mão de uma dose de portabilidade. Eles são um pouco
impráticos para quem precisa transportar o computador de um lado para o outro, não apenas
pelas dimensões e peso generosos, mas também pelo uso da bateria externa.
"""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Developer"
        p.meaning = """
            Desenvolvedor. Usado em relação a pessoas ou empresas que desenvolvem aplicativos, drivers
            ou mesmo componentes como processadores, placas mãe, etc.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Device Driver"
        p.meaning = "Driver de dispositivo"
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DHCP"
        p.meaning = """
            Numa rede que use o protocolo TCP/IP, é possível fazer com que os hosts da rede obtenham
            automaticamente seus endereços IP, assim como sua configuração de máscara de sub-rede e
            defaut gateway, ao invés de configurar manualmente os endereços IP usados por cada máquina.
            Isto torna mais fácil a tarefa de manter a rede e acaba com a possibilidade de erros na
            configuração manual dos endereços IP.
            Para utilizar este recurso, é preciso implantar um servidor de DHCP na rede. A menos que sua
            rede seja muito grande, não é preciso usar um servidor dedicado só para isso: você pode
            outorgar mais esta tarefa para um servidor de arquivos, por exemplo. O serviço de servidor
            DHCP pode ser instalado apenas em sistemas destinados a servidores de rede, como o Windows
            NT Server, Windows 2000 Server, Novell Netware 4.11 (ou superior) e Linux. O internet
            Conection Sharing do Windows 98 ou 2000 Professional também pode ser usado como um
            servidor DHCP simples, capaz de gerenciar até 254 máquinas.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dhrystone"
        p.meaning = """
            Este é um benchmark simples para medir o desempenho do processador em inteiros,
            desenvolvido em 1984. O programa simula chamadas de sistema e operações de leitura e escrita
            de dados. Vários programas de benchmark atuais entre eles o Sisoft Sandra trazem este
            benchmark como um dos testes. O resultado indica o número de vezes por segundo que o
            processador é capaz de executar o conjunto de instruções.
            Como os processadores atuais são capazes de executar várias instruções por ciclo e dependem
            muito da velocidade e quantidade de cache, o desempenho varia muito de acordo com o
            aplicativo. Por isso, o resultado obtido pelo processador no Dhrystone serve apenas como uma
            referência de desempenho bruto, que não indica necessariamente o desempenho do processador
            em aplicativos reais.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dial-Up"
        p.meaning = "Acesso discado (usando um modem e uma linha telefônica) a uma rede qualquer ou à Internet."
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Die Size"
        p.meaning = """O Die é o núcleo do processador, o waffer de silício que depois é encapsulado, formando o
processador que encontramos à venda. O formato do encapsulamento pode variar de acordo com
o projeto do fabricante. Temos desde mastodontes como os Pentium II slot 1 até processadores
muito pequenos, como por exemplo os Pentium 4 soquete 478.
Mas, o processador em sí é sempre muito pequeno, medindo pouco mais de um centímetro
quadrado, ou muitas vezes nem isso. O die size indica justamente o tamanho "real" do
processador, geralmente medido em milímetros quadrados. Um Athlon Thunderbird mede 120
milímetros, um Pentium 4 Willamette mede 217 milímetros, um Cyrix C3 (o menorzinho da
turma) mede 65 milímetros e assim por diante. Como os fabricantes utilizam waffers de silício de
20 ou 30 centímetros de diâmetro, que são usados para construir vários processadores, quanto
menor o processador, menor é seu custo de produção, pois o fabricante pode produzir mais
unidades em cada waffer."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DIMM"
        p.meaning = """Double Inline Memory Mode. Os módulos de memória de 168 vias usados atualmente. Ao
contrario dos módulos SIMM de 30 e 72 vias, os módulos DIMM possuem contatos em ambos os
lados do módulo, o que justifica seu nome, "Double In Line Memory Module" ou "módulo de
memória com duas linhas de contato".
Os módulos DIMM trabalham com palavras binárias de 64 bits, um único módulo é suficiente
para preencher um banco de memória em um micro Pentium ou superior, dispensando seu uso
em pares. Caso você deseje instalar 64 MB de memória em um Pentium II, por exemplo, será
preciso comprar apenas um único módulo DIMM de 64 MB. Os módulos DIMM de 168 vias são os
únicos fabricados atualmente. Você dificilmente encontrará módulos de 72 vias, ou placas mãe
novas que os suportem à venda, apenas componentes usados. Existem também módulos DIMM
de memória SDRAM PC-66, PC-100, PC-133 e, recentemente, também PC-150, onde o número
indica a freqüência máxima de operação suportada pelo módulo."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dinosaur Pen"
        p.meaning = """
            Este é um termo curioso, que surgiu durante a década de 50. Uma Dinosaur Pen era uma sala
            especial, com toda a infra-estrutura básica necessária ao perfeito funcionamento dos
            computadores da época. O piso era elevado, para permitir a passagem das centenas de metros
            de cabos que ligavam todos os componentes, você precisava colocar um casaco ao entrar, pois o
            ar condicionado era extremamente forte, necessário para resfriar as milhares de válvulas
            funcionando simultâneamente. Naturalmente esse aparato todo era propenso a curto-circuitos
            que podiam causar incêndios, de modo que as salas tinham vários extintores nas paredes.
            Basicamente, as pessoas é que se adaptavam aos computadores e não o contrário como nos dias
            de hoje.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Diodo"
        p.meaning = """
            Este é um dos componentes essenciais para qualquer computador. Basicamente, o diodo é um
            componente que deixa passar eletricidade em um sentido mas bloqueia qualquer corrente vinda
            do sentido contrário. Para isso o diodo é composto por duas camadas de materiais
            semicondutores, contendo silício dopado tipo P (o condutor de cargas positivas ou anodo) e tipo
            N (condutor de cargas negativas ou catodo).
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DIP"
        p.meaning = """
            Dual In-Line Package, formato de encapsulamento, onde temos contatos dos dois lados do chip.
            É usado entre outras coisas para encapsular os chips de memória RAM. Os chips DIP por sua vez
            são soldados à uma placa de circuito, formando módulos de memória
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DIP Switch"
        p.meaning = """
            Pequenas chaves de duas posições encontradas em algumas placas mãe, modems, etc... Tem a
            mesma função dos jumpers, permitindo configurar recursos relacionados à placa, como a
            frequência de operação e multiplicador (no caso de uma placa mãe).
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DirectX"
        p.meaning = """
            É ferramenta de desenvolvimento de jogos e aplicativos multimídia para Windows mais usada.
            Oferece várias facilidades aos programadores, fazendo com que a maioria dos jogos atuais
            sejam feitos com base na plataforma. Para que estes jogos rodem, é preciso ter uma versão
            recente do DirectX instalado na máquina. O DirectX é gratuíto e pode ser baixado no site da
            Microsoft ou em sites de download como o Tucows.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DirectFB"
        p.meaning = """
            Este é um módulo que permite rodar aplicativos gráficos do Linux diretamente, sem necessidade
            de um servidor X completo. A principal vantagem do DirectFB é o tamanho reduzido: uma
            instalação completa, com drivers de aceleração de vídeo e fontes pode ocupar menos de 10 MB,
            enquanto uma instalação completa do Xfree 4.2 ocupa facilmente mais de 100.
            Com isto é possível desenvolver sistemas para embedded systems além de CDs bootáveis para
            kiosques, caixas eletrônicos, etc. Nestes casos o sistema pode ser compacto o suficiente para
            rodar direto da memória RAM, usando o CD apenas para dar boot. Diminuem-se assim os custos
            com manutenção, já que em caso de problemas basta reiniciar e aumenta-se a segurança já que
            não é possível alterar os dados do CD.
            Um dos melhores exemplos de uso do DirectFB é o ByzantineOS, uma mini-distribuição Linux
            que inclui o Mozilla, Mplayer (para assistir DVD) e outras ferramentas numa imagem de apenas
            32 MB! Sim, teoricamente seria possível fazer algo semelhante que caiba na memória de um
            handheld, esta é uma das idéias. O DirectFB é compatível com mais de 90% das placas de vídeo
            usadas em PCs e com vários controladores para embedded systems.
            O frame-buffer é um recurso nativamente suportado pelo Kernel, originalmente desenvolvido
            para permitir a visualização de imagens em modo texto, acessando diretamente a memória da
            placa de vídeo. Se você vê um pinguim no topo da tela ou algum tipo de menu gráfico durante o
            boot do Linux significa que o frame-buffer está ativado no seu micro. O que o DirectFB faz é
            permitir que este mesmo recurso seja usado para rodar diretamente aplicativos gráficos, sem
            precisar do X.
            Alguns modelos de placas suportam aceleração de vídeo, mas mesmo nas demais o desempenho
            do vídeo é aceitável, o suficiente para assistir DVDs por exemplo.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Disc"
        p.meaning = """O mesmo que disk, disco. Em informática, o termo "disc" é geralmente usado em relação à
discos ópticos enquanto "disk" é mais comumente usado em relação a discos magnéticos, como
os HDs. De qualquer forma, ambos os termos são considerados corretos. Você encontrará um ou
outro dependendo do autor."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Disc at once (DAO)"
        p.meaning = """
            Este é um modo de gravação de CDs onde todo o conteúdo do CD é gravado em uma única trilha
            e o CD é fechado após a gravação. Este é o formato que oferece melhor compatibilidade, já que
            muitos leitores antigos não são capazes de ler CDs multisessão. A desvantagem é que uma vez
            gravado, não é possível gravar mais dados no CD, mesmo que tenham sido gravados apenas
            alguns poucos megabytes. Veja também: Track at once.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = ""
        p.meaning = ""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Disco Rígido (HD)"
        p.meaning = """
            O Hard Disk, ou simplesmente Disco Rígido é um sistema de armazenamento de alta capacidade,
            que por não ser volátil, é destinado ao armazenamento de arquivos e programas. Apesar de não
            parecer à primeira vista, o HD é um dos componentes que compõe um PC, que envolve mais
            tecnologia. Todos os programas e arquivos são armazenados no disco rígido, também chamado
            de HD (Hard Disk) ou Winchester. A capacidade do disco rígido, medida em Gigabytes,
            determina a quantidade de arquivos e programas que será possível armazenar. O disco rígido
            também exerce uma grande influência sobre a performance global do equipamento, já que
            determina o tempo de carregamento dos programas e de abertura e salvamento de arquivos. O
            disco rígido é acomodado no gabinete e ligado à placa mãe através de um cabo.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = ""
        p.meaning = ""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Discrete chip"
        p.meaning = """Pode ser traduzido como "chip aparente" ou "chip externo". Os discrete chips incluem todo tipo
de chip externo, seja soldado na placa mãe ou numa placa de expansão qualquer, como o
chipset da placa mãe ou da placa de vídeo, o chip DSP do modem e assim por diante. O oposto
são os chips integrados, ou "integrated chips", que são incluídos dentro de outros chips. É por
exemplo o caso das placas de vídeo offboard e das placas de vídeo onboard. As últimas são mais
caras, porém também são quase sempre mais rápidas, o upgrade é mais fácil e assim por
diante."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Disk Array"
        p.meaning = """
            Um agrupamento de discos rígidos criado (via software, geralmente no Setup da placa
            controladora) dentro de um sistema RAID. Ao criar o array é possível definir o modo RAID que
            será utilizado, entre os modos 1, 0, 10 ou outro suportado pela controladora. Veja mais detalhes
            em: RAID
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Distribuição Linux"
        p.meaning = """
            O Linux pode ser distribuído livremente. Você pode inclusive gravar um CD com o Linux e mais
            alguns programas e vendê-lo para quem se interessar. Isto é o que chamamos de "distribuição".
            Significa que você pode até mesmo ganhar dinheiro vendendo CDs do Linux, mas não pode
            estabelecer nenhum tipo de restrição de uso, inclusive contra cópias. Ao comprar apenas um CD,
            você pode instalá-lo em quantas máquinas quiser e até mesmo copiá-lo e distribuir para amigos,
            sem incorrer em pirataria. Este é o significado de "software livre". Você pode cobrar pela
            gravação do CD, pelos manuais, pelo suporte técnico, mas o software em sí continua tendo seu
            código aberto e sendo de livre distribuição.
            Existem no mundo inúmeras distribuições Linux (você pode ver uma lista no
            http://www.linux.org/dist/index.html). Algumas das principais distros são a Red Hat, a
            Slackware, Debian, SuSE, Mandrake e Turbo Linux. O Linux é o mesmo, porém, cada distribuição
            vem com um conjunto diferente de aplicativos. Cada distribuição vem ainda com certas
            facilidades, como por exemplo um instalador gráfico, pré configurações, etc. O Conectiva Linux
            por exemplo, é baseado no Red Hat, mas traz várias mudanças, usa um instalador próprio, traz
            um pacote de programas um pouco diferente da Red Hat e já vem configurado para usuários
            Brasileiros.
            A fim de tentar melhorar o seu desempenho financeiro, algumas distribuições estão optando por
            incluir alguns softwares comerciais no pacote, como uma forma de poder cobrar por cada cópia
            usada e não disponibilizar o pacote para download gratuito. É o caso por exemplo do Lindows,
            onde os interessados em usar a distribuição precisam adquirir o pacote. Este não é o caso do
            Mandrake, Turbo Linux, Debian, Conectiva e da maioria das outras distribuições, que continuam
            disponibilizando imagens que podem ser baixadas gratuitamente via Web.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Distributed File System (DFS)"
        p.meaning = """Este é um recurso presente no Windows 2000 e no Windows XP, que permite "juntar" vários
diretórios compartilhados através da rede, mesmo que espalhados por vários servidores, fazendo
com que apareçam como uma única unidade de rede."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dithering"
        p.meaning = """
            Recurso que cria a ilusão de novas cores, misturando pontos de cores diferentes. Um exemplo
            clássico é uma foto de jornal, apesar da foto aparentar ser composta por várias tonalidades de
            cinza, existem apenas pontos brancos e pretos, que intercalados dão a impressão de novas
            tonalidades. Note que o dithering não cria novas tonalidades de cor, apenas intercala pontos das
            tonalidades disponíveis, criando o efeito visual.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Divx"
        p.meaning = """O Divx original era uma formato de locação de filmes, onde ao invés de alugar e depois devolver
o filme, o usuário comprava um DVD que podia ser visto durante um período de 48 horas, o
mesmo período de uma locação. Depois disto, o usuário poderia ou renovar a assinatura e
assisti-lo por mais 48 horas ou simplesmente jogar fora o DVD, que não serviria para mais nada.
O processo de autenticação e renovação seria feito através de um modem instalado no aparelho
e a idéia é que os DVDs protegidos pelo sistema custassem pouco mais do que uma locação. Apesar da idéia ser até boa, o sistema não fez o menor sucesso e acabou desaparecendo
rapidamente. Pouco depois surgiu o Divx;-), um formato de compressão de vídeo muito usado
para trocar arquivos de filmes via Web, que não tem nada a ver com o original. O nome "Divx;-)
" é uma forma dos criadores ridicularizarem o formato falido."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Divx"
        p.meaning = """
            O MPEG é até hoje o formato de compressão de vídeo mais usado em qualquer tipo de vídeo em
            formato digital, incluindo naturalmente os DVDs. Porém, o formato usado atualmente, o MPEG 2,
            apesar de permitir uma qualidade de imagem muito superior à de uma fita VHS comum, o que
            explica a qualidade dos filmes em DVD, não executa uma compactação de dados muito eficiente,
            fazendo com que os arquivos de vídeo fiquem enormes.
            O MPEG 4 aparece então como uma alternativa ao já cansado MPEG 2, permitindo compactar os
            vídeos em MPEG 2 numa razão de até 12 para 1, fazendo com que um filme em DVD de até 108
            minutos caiba em um simples CD-ROM, mesmo mantendo a mesma resolução de imagem. O
            novo formato pode ser usado para compactar qualquer tipo de vídeo em MPEG, não apenas DVD.
            Isto traz a possibilidade de criar arquivos de vídeo muito menores para serem transmitidos pela
            Net. O MPEG 4 tem tudo para se tornar uma espécie de MP3 do ramo de vídeo. Em termos de
            qualidade de imagem há uma pequena perda, devido ao processo de compactação, que torna-se
            mais perceptível conforme diminui o tamanho do arquivo. Até 3 para 1 a perda não chega a ser
            algo muito grande, a 6 para 1 (o suficiente para colocar a maioria dos filmes em DVD num CD)
            já temos uma perda considerável.
            O maior problema do formato é que é preciso um micro poderoso tanto para assistir, quanto
            para compactar os vídeos. Para assistir um vídeo em MPEG 4 com qualidade de DVD, é preciso
            no mínimo um Pentium III 600, caso contrário haverá perda de fluidez da imagem. Para
            compactar os vídeos, não existe um mínimo muito definido mas, naturalmente, quanto mais
            lento for o micro, mais demorará para compactar os filmes. Compactar um DVD de 108 minutos
            demora aproximadamente 13 horas num Pentium III 600, imagine o que demoraria num micro
            mais lento... Naturalmente é possível gerar vídeos de resolução mais baixa, que poderão ser
            vistos sem problemas em micros mais lentos, e ocuparão menos espaço em disco. Um programa
            muito fácil de usar que faz a conversão dos vídeos para Divx;-) é o Virtual Dub.
            O programa tem apenas 800 KB e é freeware. Este programa é adequado para a compactação
            de filmes em DVD, é preciso um pouco de jogo de cintura nas configurações para conseguir bons
            resultados em vídeos de resolução mais baixa, mas você pode baixar e testar em qualquer vídeo
            em MPEG que tenha gravado no micro. Mas, antes de você sair por aí copiando DVDs, vale
            lembra que a cópia é considerada pirataria, e naturalmente ilegal. Você pode fazer apenas uma
            cópia para uso pessoal, caso tenha comprado o DVD original.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dixon"
        p.meaning = """
            Esta foi uma versão especial do Celeron, destinada a notebooks. A diferença entre estes e os
            Celerons para micro de mesa é que os Dixon possuem 256 KB de cache L2 ao invés de apenas
            128 KB. Estes processadores existiram em versões de 300 e 500 MHz. Apesar do projeto ser
            uma variação do Celeron, estes processadores foram vendidos como processadores Mobile
            Pentium II.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DLL"
        p.meaning = """
            Dynamic Link Library, são arquivos que contém rotinas e funções que podem ser utilizadas pelos
            programas. O mesmo programa pode utilizar várias DLLs diferentes e a mesma DLL pode ser
            usada por vários programas. O uso de DLLs visam facilitar o trabalho dos programadores, que
            podem utilizar funções que já estão prontas em alguma DLL ao invés de ter de criá-las do zero.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DLP"
        p.meaning = """
            Digital Light Processing. Esta é uma tecnologia relativamente recente, usada em projetores que
            oferece uma alternativa ao LCD. Em primeiro lugar, é preciso deixar claro que estamos falando
            aqui de projetores destinados a apresentações, que são ligados na saída VGA do PC ou notebook
            e projetam a imagem que seria exibida na tela. A importância destes projetores para muitos
            executivos é um dos principais motivos de praticamente todos os notebooks terem saídas de
            vídeo VGA, que exibem a mesma imagem da tela principal.
            Em todos os projetores temos uma lâmpada bastante poderosa. Nos projetores que utilizam LCD
            temos três telas de LCD, que geram as três cores que misturadas formam a imagem. As três
            telas de LCD formam um conjunto relativamente grande e pesado e que acaba bloqueando
            grande parte da luz, gerando uma imagem menos nítida.
            Nos projetores DLP as telas de LCD são substituídas por alguns milhões de espelhos, uma para
            cada uma das três cores de cada pixel, movidos por micromotores. O custo de produção é mais
            alto que o das telas de LCD, mas não chega a ser absurdo, pois todo o conjunto é produzido de
            uma vez, usando um waffer de silício como base, como se fosse um processador.
            Os espelhos passam então a refletir ou bloquear a luz, gerando a imagem a ser projetada. Como
            o conjunto trabalha refletindo e não bloqueando a luz como no LCD, a imagem projetada é mais
            nítida e brilhante. Outra vantagem dos projetores DLP é o fato de serem quase sempre mais
            compactos. Por outro lado eles são também mais caros.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DMA"
        p.meaning = """
            Direct Memory Access. É um recurso da placa mãe que permite que os periféricos acessem
            diretamente a memória RAM, sem consumir poder de processamento do processador. O DMA
            surgiu junto com o antigo barramento ISA, onde estavam disponíveis 8 canais de 3.3 MB/s e
            ressurgiu em versão muito mais rápida no PCI, onde o recurso de bus mastering permite que
            qualquer periférico realize transferências diretamente para a memória usando os 133 MB/s do
            barramento.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DNS"
        p.meaning = """
            Domain Name System. São servidores que convertem URLs nos endereços IP dos servidores. Ao
            digitar http://www.guiadohardware.net no Browser por exemplo, seu PC enviará a requisição ao
            servidor DNS do seu provedor que retornará o endereço IP do servidor do site para que seu PC
            possa finalmente acessá-lo. Este serviço é apenas um facilitador, mas é essencial para a
            existência da Web como a conhecemos. Sem os servidores DNS seria necessário decorar os
            endereços IP de todos os sites que desejasse visitar.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dockapp"
        p.meaning = """
            São pequenos programas que podem ser utilizados no Linux, no Free BSD e em outras
            plataformas. Estes programas podem exibir a temperatura e nível de carregamento do
            processador, a quantidade de memória disponível, ou qualquer outro tipo de informação útil (ou
            não :-). Existem até alguns dockapps que são meramente decorativos, outros que oferecem
            atalhos para funções de aplicativos, que indicam quando novos e-mails são recebidos etc.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dolby AC-3"
        p.meaning = """
            Padrão de caixas acústicas para home theaters. Temos um total de 5 caixas mais um subwoofer,
            formando 6 canais de som: frontal, frontal esquerdo, frontal direito, traseiro esquerdo, traseiro
            direito com o subwoofer atrás. Este formato é suportado por apenas algumas placas de som.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dolby ProLogic"
        p.meaning = """
            Padrão para home theaters, mais antigo que o Dolby AC3, porém superior ao Dolby Surrond,
            temos três caixas, formando um canal central e dois canais laterais.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dolby Surround"
        p.meaning = """
            O padrão mais antigo de áudio para home theaters, formado por apenas duas caixas acústicas,
            com efeitos que davam uma certa sensação de imersão. Algumas TVs stereo oferecem este
            efeito.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Domain"
        p.meaning = """
            Domínio, são os endereços de sites na Internet. Os domínios obedecem a uma hierarquia: em
            guiadohardware.net, o .net é o domínio primário, enquanto o guiadohardware é o domínio
            secundário, que está dentro do primeiro. Os endereços são lidos a partir do final. O browser
            primeiro procurará pelo domínio .net para depois procurar o domínio guiadohardware que está
            subordinado a ele. No caso de um domínio .com.br o br é o domínio principal, que abriga os sites
            Brasileiros.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dot Matrix Printer"
        p.meaning = "Impressora Matricial"
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Download"
        p.meaning = """Baixar algum arquivo através da rede, ou via Internet. Down significa "baixar" ou "puxar",
enquanto load "significa "carregar", no sentido de carregar um programa ou arquivo."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Downstream"
        p.meaning = """
            Numa conexão de rede o downstream é o fluxo de dados no sentido servidor > usuário. Em
            contraste está o upstream, que é o tráfego que trafega no sentido oposto. Nem sempre a
            velocidade é a mesma nos dois sentidos. Por exemplo, nos modems de 56k V.90 o downstream é
            de até 56k, mas o upstream é de apenas 33.6k. Temos algo semelhante no ADSL onde o mais
            comum é termos um downstream de 256k mas um upstream de apenas 128k e também nos
            serviços de acesso via cabo, onde o downstream pode ser de até 1 megabit (dependendo do
            plano escolhido), mas o upstream é geralmente de 128k.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DOS"
        p.meaning = """
            Disk Operating System. Pode ser usado em relação a qualquer sistema operacional, mas é mais
            freqüentemente usado em relação ao MS-DOS da Microsoft.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DoS"
        p.meaning = """
            Denial of Service, negação de serviço. É um tipo de ataque, geralmente feito a grandes sites,
            que visa sobrecarregar o servidor com um número muito grande de solicitações, tornando o
            sistema lento, ou mesmo tirando-o completamente do ar. Em geral, um ataque DoS tem grandes
            proporções, que começa com invasões a servidores com links rápidos, como os de universidades,
            que são usados como base para o ataque.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DOS/V"
        p.meaning = """
            O DOS/V é uma versão do MS-DOS destinada ao mercado Japonês. Como o idioma utiliza
            caracteres bem diferentes dos ocidentais, desde os primeiros computadores existiam problemas
            de incompatibilidade entre programas e computadores Japoneses e os usados no restante do
            mundo.
            O DOS/V, desenvolvido em 91, veio para solucionar este problema, sendo compatível com todos
            os comandos e programas do MS-DOS ocidental e também com comandos e programas usando
            ideogramas em Kanji. Pouco tempo depois, foi lançada uma versão do Windows 3.1 com a
            mesma compatibilidade, o Win/V. A partir do Windows 95, toda a família Windows possui
            suporte multilíngue, bastando instalar os pacotes de idiomas necessários para exibir qualquer
            conjunto de caracteres. Para visualizar páginas com ideogramas em Kanji no IE 5, por exemplo,
            basta clicar em Exibir> Codificação> Mais e instalar o suporte a Japonês. Atualmente, os
            teclados usados no Japão possuem teclas com os caracteres ocidentais e os equivalentes em
            Kanji
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DPI"
        p.meaning = """
            Dots per inch, pontos por polegada. É usado com relação à resolução de uma imagem impressa.
            Este termo é aplicável tanto à Impressoras quanto a scanners. Uma imagem de 5,2 x 5,2 cm (2
            polegadas) impressa a 300 DPI possui 600 x 600 pontos. O mesmo pode-se dizer da mesma
            imagem de 5,2 x 5,2 cm digitalizada a 300 DPI por um scanner.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DPL/DPC"
        p.meaning = """
            Piadinha sobre o uso de disquetes. Este foi o primeiro protocolo de rede da história da
            computação e mesmo assim ainda é utilizado em muitos ambientes: "Disquete pra lá / disquete
            pra cá"
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DPMA"
        p.meaning = """
            Dynamic Power Management System, um modo de economia criado pela Intel, utilizado em PCs
            antigos. O padrão de economia de energia usado nos PCs atuais é o ACPI
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DRAM"
        p.meaning = """
            É o tipo de memória volátil que normalmente chamamos apenas de "memória RAM". Existem
            várias tecnologias de memória DRAM, entre elas as EDO RAM e SDRAM, mas todas mantém um
            ponto em comum que é o fato de cada bit de dados ser armazenado em um minúsculo capacitor,
            que conserva sua carga por apenas alguns milésimos de segundo, precisando ser continuamente
            recarregado. É justamente por isto que estas memórias são voláteis.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Drive"
        p.meaning = """
            Em Portugal ao invés do termo drive é usado o termo "acionador", que explica bem o significado
            do termo. Os drives de disquetes, drives de CD-ROM, etc. são os mecanismos que permitem ler
            estas mídias. O HD também é um drive, a única diferença é que ao contrário de um disquete ou
            CD-ROM, os discos são lacrados.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Driver (de dispositivo)"
        p.meaning = """
            Conjunto de rotinas que permitem ao sistema operacional acessar o periférico. O driver funciona
            como uma espécie de tradutor entre o dispositivo, uma placa de vídeo por exemplo e o sistema
            operacional ou programas que o estejam utilizando. Por ser especializado, o driver funcionará
            adequadamente apenas junto com o para que foi escrito. Em geral existe uma versão diferente
            do driver par cada sistema operacional.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Drum"
        p.meaning = """
            Este é o cilindro de toner das impressoras a laser, onde a idéia básica é usar laser para aquecer
            e carregar o cilindro com cargas eletrostáticas, que atraem o toner, gerando um molde da
            imagem a ser impressa. Depois disto, o cilindro é prensado contra o papel, finalizando o serviço.
            O cilindro têm uma vida útil maior que os cartuchos de toner, mas precisa ser trocado de tempos
            em tempos; os fabricantes geralmente recomendam a troca a cada 20.000 páginas impressas.
            Esticar a vida útil do cilindro pode degradar a qualidade da impressão.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DST"
        p.meaning = """Depleted substrate transistor. Esta é uma tecnologia desenvolvida pela Intel, também conhecida
pelo nome comercial "Terahertz Technology", que é basicamente uma evolução do SOI, adotado
por outros fabricantes, entre eles a AMD. No SOI temos uma camada extremamente fina de
silício depositada sobre uma camada de material isolante. A camada de silício tem apenas a
espessura necessária para construir o transístor enquanto a camada de isolante mantém os
elétrons presos na camada superior, minimizando a perda.
Segundo a AMD, o uso do SOI possibilita o desenvolvimento de processadores com um clock
cerca de 35% superior ao do mesmo processador produzido usando waffers convencionais.
O DST é a resposta da Intel, que traz duas melhorias. A primeira é que a camada de silício sobre
o material isolante passa a ser ainda mais fina, o que garante uma perda ainda menor. Além de
ser mais fina, a camada de silício é recebe um tratamento especial onde perde elétrons,
resultando num material condutor de melhor qualidade, que perde ainda menos elétrons e cada
sinal de clock, diminuindo o consumo elétrico do processador e os níveis de interferência
eletromagnética. Este material é aplicado em camadas de apenas uma molécula de espessura
cada, o que torna a superfície mais perfeita.
Segundo os projetistas da Intel a tecnologia reduz em 99% a perda de elétrons durante o
funcionamento do processador e permitirá produzir processadores de 20 GHz ou mais até 2005,
provavelmente numa técnica de 0.07 mícron. Isso significa um ganho de cerca de 100% em
relação à técnica atual, que teoricamente permitiria produzir processadores de 10 GHz numa
técnica de 0.07 mícron.
Além da maior frequência de operação, a técnica também permite construir chips com um
consumo elétrico mais baixo, o que será essencial daqui pra frente com a popularização dos
portáteis.
O nome "Terahertz Technology" vem da idéia de que com a nova tecnologia os transístores serão
capazes de operar a 1 THz ou mais. Naturalmente esta é a frequência suportada por um
transístor sozinho, não pelo processador, onde o sinal precisa passar por vários transístores a
cada ciclo e existe o problema do consumo elétrico e conseqüente aquecimento."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DTR"
        p.meaning = """
            Data Transfer Rate, taxa de transferencia de dados alcançada por um dispositivo qualquer, um
            modem ou rede por exemplo. Existem dois tipos de taxas de transferência, taxa de pico (peak),
            que corresponde à velocidade máxima alcançada e a taxa média, que é um número mais
            próximo do alcançado na prática.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dual Boot"
        p.meaning = """
            Permite instalar dois ou mais sistemas operacionais diferentes no mesmo micro. Em geral é
            instalado um boot manager, que pergunta qual sistema deve ser inicializado cada vez que o
            micro é ligado.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dual Homed"
        p.meaning = """
            Este termo refere-se a um PC com duas placas de rede, muito comuns atualmente. A situação
            mais comum é o casa de um PC que acessa a Internet via Cabo ou ADSL, usando uma placa de
            rede como conexão com o modem e uma segunda placa de rede para conectar-se à rede
            doméstica, compartilhar conexão, etc. Outro caso típico é um PC usado como roteador de rede.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dual Scan"
        p.meaning = """
            Esta é uma tecnologia de monitores LCD de matriz passiva surgida no início da década de 90,
            onde a tela é dividida em duas partes e cada uma é endereçada de forma independente. Esta
            mudança é invisível para o usuário, mas permite que as duas metades sejam atualizadas
            simultaneamente, melhorando bastante o tempo de resposta e o contraste da tela em
            comparação com os LCDs antigos. Os LCDs Dual Scan são melhores que os os tradicionais, mas
            são ainda inferiores aos HPA (veja neste dicionário) e, principalmente, aos de matriz ativa. Veja
            também: Matriz Passiva, Matriz Ativa.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dual Vt"
        p.meaning = """
            Dual Threshold Voltage. Esta é uma tecnologia desenvolvida pela Intel para uso em suas
            próximas gerações de processadores, onde o processador utiliza duas tensões diferentes. Uma,
            mais baixa, é usada para os circuitos menos críticos, que podem operar a frequências mais
            baixas, sem prejuízo para o desempenho. A segunda, mais alta, é usada para as unidades de
            execução, circuitos de branch prediction e outros componentes mais atarefados. A idéia é
            economizar energia nas partes menos essenciais do processador, fazendo com que o consumo
            elétrico total caia, sem precisar com isso sacrificar o desempenho.
            O Dual Vt deve ser utilizado com algum sistema de gerenciamento de energia que entre em cena
            nos ciclos ociosos do processador, diminuindo a frequência e desligando partes que não estão
            em uso, permitindo atingir um nível de economia bem maior. Vários processadores utilizam este
            tipo de sistema, entre eles o C3 da Via e o Crusoé da Transmeta, mas por enquanto o Dual Vt é
            exclusividade da Intel.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dumb Terminal"
        p.meaning = "Terminal Burro"
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dummie"
        p.meaning = """
            Os dummies são aqueles bonecos usados em crash tests de carros. Eles não se movem, então
            precisam ser carregados no colo, é preciso coloca-los na posição certa, colocar o cinto de
            segurança, etc. E, depois da batida, mesmo todo arrebentado, o boneco continua sorrindo :-)
            Em informática, o termo dummie nasceu como um pejorativo para usuários com, digamos,
            pouco jeito para a coisa. Mas, com o passar do tempo, começou a ser usado também de forma
            carinhosa. Existem até algumas séries de livros "para dummies", quase sempre com um passo a
            passo ou alguma explicação bem simples, para que qualquer um possa entender sem muito
            esforço.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Duron (AMD) "
        p.meaning = """
            Processador da AMD, lançado com o objetivo de concorrer com o Celeron no mercado de
            processadores de baixo custo. Utiliza a mesma arquitetura do AMD Athlon, mas com apenas 64
            KB de cache L2. Originalmente lançado em versões de 600, 700 e 800 MHz.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DVD"
        p.meaning = """
            Digital Versatile Disk, armazena muito mais dados que o CD-ROM, sendo atualmente usado para
            armazenar filmes. A qualidade de imagem é bem superior às antigas fitas VHS: 240 linhas
            horizontais de resolução no VHS, contra 500 linhas no DVD. Também são permitidos vários
            outros recursos, como várias opções de legenda e dublagem. Existem 4 tipos de DVD, que
            diferem na capacidade. O DVD 5 é capaz de armazenar 4.7 GB de dados ou 133 minutos de
            vídeo na resolução máxima.
            Na verdade, 133 minutos de vídeo ocupam apenas 3.5 GB; os 1.2 GB restantes são reservados
            para áudio. Cada dublagem de 133 minutos ocupa 400 MB, o que permite incluir até três
            dublagens junto com o filme num DVD de 4.7 GB. Porém, é possível armazenar mais filme
            utilizando apenas uma dublagem ou então degradando a qualidade de imagem.
            Usando apenas uma dublagem é possível armazenar cerca de 160 mim de filme em qualidade
            máxima ou cerca de 9 horas caso o vídeo seja compactado com qualidade equivalente à de uma
            fita VHS. O DVD 10 utiliza a mesma tecnologia do DVD 5, mas nele são usados os dois lados do
            disco, dobrando a capacidade. Temos então 9.4 GB de dados ou 266 minutos de vídeo em
            qualidade máxima com três dublagens. Temos também o DVD 9 e o DVD 18, que são capazes de
            armazenar respectivamente 8.5 e 17 GB de dados.

            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DVD-RAM"
        p.meaning = """
            O padrão para DVDs regraváveis. Apesar da versatilidade, os DVD-RAM tem uma capacidade
            bem menor que a dos DVDs prensados, apenas 2.6 GB. O objetivo é dificultar a pirataria de
            filmes, impedindo a cópia direta de um DVD prensado para um gravável.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DVI"
        p.meaning = """Vem de digital visual Interface. Este é um padrão de interface de vídeo desenvolvido para ser
utilizado em monitores de cristal líquido e outros tipos de monitores digitais.
As placas de vídeo com conectores VGA comuns convertem as imagens num sinal analógico que
é entendido pelos monitores CRT. Mas, para serem compatíveis com as placas atuais, os
monitores LCD (que são totalmente digitais) são obrigados a trazerem um conversor
analógico/digital. Esta dupla conversão degrada o sinal de vídeo, prejudicando a reprodução de
cores e adicionando algumas "sujeiras" na imagem, além de aumentar o custo final dos
monitores.
As interfaces DVI são uma resposta para este problema, já que são totalmente digitais. Este
ainda é um padrão relativamente novo, que só agora começa a ser usado em um número
considerável de placas de vídeo, que normalmente trazem o conector DVI junto com o conector
VGA, dando a opção ao usuário."""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "Dvorak (teclado)"
        p.meaning = """
            Os teclados usados atualmente são chamados de teclados QWERTY, nome que corresponde
            justamente à posição destas letras a partir do canto esquerdo da linha superior. Os teclados
            Dvorak são uma alternativa desenvolvida por August Dvorak nos anos 30, onde as teclas mais
            usadas são posicionadas na linha do meio, como uma forma de tentar diminuir a distância a ser
            percorrida pelos dedos para digitar a maior parte das palavras. Todos os sistemas operacionais
            atuais possuem suporte a teclados Dvorak, se quiser tentar, basta configurar o layout do teclado
            e reorganizar as teclas como na figura abaixo. Na maioria dos teclados, as teclas podem ser
            arrancadas e colocadas em outra posição.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DragonBall"
        p.meaning = """
            DragonBall não é só o nome de um desenho que passa todas às tardes na Bandeirantes, é um
            dos processadores mais vendidos atualmente. O que o diferencia dos Athlons e Pentiums III é
            que primeiro, o poder de processador das suas versões atuais é infinitamente inferior à destes
            chips, segundo que ele não é destinado a desktops, mas sim a palmtops (agora está
            explicado :-)
            Esta linha de chips de baixíssimo consumo é usada em todos os Palms, incluindo compatíveis,
            como a linha Visor da Handspring, um mercado em tanto. Assim como Guku & Cia defendem a
            Terra no desenho, este chip vem sendo um dos responsáveis pelo grande sucesso destes
            handhelds.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DSP"
        p.meaning = """
            Digital Signal Processor, é o principal componente dos softmodems. O chip DSP faz a conversão
            analógica/digital e digital/analógica dos dados transmitidos pelo modem, mas o restante do
            trabalho, correção de erros, compressão de dados, etc. é feito pelo processador principal, através
            de um software especial. É por isso que usar um softmodem deixa o sistema um pouco mais
            lento.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DSTN"
        p.meaning = """
            Mesmo que Matriz passiva, uma tecnologia usada em monitores de cristal líquido. Veja também:
            Matriz Ativa.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = "DXV"
        p.meaning = """
            Data Exchange File, uma extensão de arquivo usada em arquivos de desenhos bidimensionais
            gerados pelo AutoCAD e alguns programas compatíveis.
            """.trimIndent()
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = ""
        p.meaning = ""
        listMeaningDictionary.add(p)
        p = DictionaryWordModel()
        p.title = ""
        p.meaning = ""
        listMeaningDictionary.add(p)
        return listMeaningDictionary
    }
}