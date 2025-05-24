![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.001.png)![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.002.png)

**Documentação do Sistema**

SUMÁRIO

[Dados do Cliente	2](#_w07pzy7ebul3)

[Equipe de Desenvolvimento	3](#_8o1ypwi5v8kn)

[1. Introdução	4](#_nwlmsvacqy4h)

[2. Objetivo	5](#_bhtir9jr8dsr)

[3. Escopo	6](#_bsj8ex9x1vjh)

[4. Backlogs do Produto	7](#_secf4hapgflg)

[5. Cronograma	8](#_5it1bad5ft5t)

[6. Materiais e Métodos	9](#_thbgaplxa9md)

[7. Resultados	10](#_6o7h03qkgj3l)

[8. Conclusão	11](#_3en6dvj8epi7)

[9. Homologação do MVP junto ao cliente	12](#_tb1f721zwudu)

[10. Divulgação	13](#_gdnlly8m74cu)

[11. Carta de Apresentação	15](#_wrbwytkjn1tk)

[12. Carta de Autorização	16](#_l49b37ibdzv3)

[13. Relato individual do processo	18](#_jo22ads71pg0)







|<h1><a name="_w07pzy7ebul3"></a>**Dados do Cliente**</h1>|
| - |

Título do Projeto:**  **DeclaraJá**: Controle de Tangíveis e Mobilizáveis para Imposto de Renda

Cliente: Otranto Informática & Contabilidade

CNPJ/CPF: 62.591.557/0001-00

Contato: 193755-1110

Email do contato: paulo@otranto.com



|<h1><a name="_8o1ypwi5v8kn"></a>**Equipe de Desenvolvimento** </h1>|
| - |

|**Nome completo**|**Curso**|**Disciplina**|
| :-: | :-: | :-: |
|Luca Silva Levanteze|ADS|Programação Orientada a Objetos em Java|
|Kauã Hipólito Rodrigues|ADS|Programação Orientada a Objetos em Java|
|Rafael dos Santos Giorgi|ADS|Programação Orientada a Objetos em Java|

|**Professor Orientador**|
| :-: |
|Kesede Rodrigues Julio|

|<h1>1. <a name="_nwlmsvacqy4h"></a>**Introdução**</h1>|
| - |

O projeto consiste em um software com o objetivo de simplificar o processo de declaração do Imposto de Renda (IR) ao longo do ano. Para isso, o sistema auxiliará no controle de documentos e realizará análises da situação financeira do usuário, visando maior assertividade na declaração.

Um dos principais desafios nas declarações de IR é a ocorrência de malha fina, frequentemente causada pela falta de documentação, que pode ser interpretada como omissão de informações. Nosso sistema será desenvolvido para mitigar esse problema, permitindo que todos os bens e direitos do usuário sejam registrados no software de forma contínua. Adicionalmente, a realização de análises financeiras periódicas garantirá que, no momento da declaração, todos os documentos estejam em conformidade com as exigências da Receita Federal.

Para o desenvolvimento desta solução, serão utilizadas as seguintes tecnologias:

- Backend: Java;
- Banco de Dados: PostgreSQL;
- Frontend: React.js, HTML, CSS, JavaScript;
- Design UX/UI: Figma.

Em suma, o software tem como objetivo auxiliar o contribuinte na declaração do IR, prevenindo erros e, consequentemente, evitando a malha fina. Para alcançar esse objetivo, o sistema permitirá o registro contínuo de bens e direitos durante o ano, armazenando e organizando os documentos fiscais relevantes. Além disso, será responsável por realizar análises financeiras e identificar possíveis inconsistências, assegurando que o contribuinte esteja em conformidade com a Receita Federal antes do prazo final da declaração.


|<h1>2. <a name="_bhtir9jr8dsr"></a>**Objetivo**</h1>|
| - |

O objetivo é prever possível malha fina por falta de controle, perda de documentos ao longo do ano, tendo como foco a redução de erros na declaração do IR e autonomizando as pessoas, até o final do primeiro semestre de 2025.


|<h1>3. <a name="_bsj8ex9x1vjh"></a>**Escopo**</h1>|
| - |

O escopo principal deste projeto de software para simplificação da declaração do Imposto de Renda (IR) compreende os seguintes requisitos macro:

**1. Registro e Organização Contínua de Dados e Documentos Fiscais:**

- Implementação de funcionalidades para que o usuário possa registrar seus dados pessoais e dependentes, seus bens (imóveis, veículos, investimentos, etc.) e direitos ao longo do ano.
- Permitir o upload e armazenamento seguro de documentos fiscais relevantes (comprovantes de rendimentos, informes de instituições financeiras, notas fiscais de saúde, comprovantes de pagamento de educação, etc.), categorizando-os para fácil acesso.
- Fornecer mecanismos de organização e busca eficiente dos dados e documentos registrados, incluindo filtros por tipo, data e descrição.
- Possibilitar a edição e atualização dos dados e documentos registrados.
- Implementar um sistema de lembretes para prazos importantes relacionados à declaração do IR.
- Limite de Implementação: O sistema suportará os tipos de bens, direitos e documentos fiscais mais comuns exigidos pela Receita Federal para a declaração anual do IR. A integração automática com fontes externas de dados (como extratos bancários) não está prevista nesta fase inicial.

**2. Análise Financeira e Alerta de Inconsistências para Conformidade com a Receita Federal:**

- Implementação de algoritmos para analisar os dados financeiros inseridos pelo usuário, identificando possíveis inconsistências ou informações faltantes para a declaração do IR, como valores que não se encaixam em faixas esperadas ou campos obrigatórios não preenchidos.
- Geração de alertas e notificações para o usuário sobre potenciais problemas que possam levar à malha fina, explicando a possível causa da inconsistência e sugerindo ações para correção.
- Disponibilização de um painel de visão geral da situação fiscal do usuário ao longo do ano, facilitando o acompanhamento da conformidade com as normas da Receita Federal, incluindo gráficos e resumos dos dados financeiros relevantes.
- Integração de um módulo experimental que utiliza Inteligência Artificial (IA) para fornecer palpites e sugestões sobre possíveis bens e direitos que o usuário possa ter, com base nos dados inseridos e em padrões gerais. Este módulo indicaria, por exemplo, a possibilidade de declarar um determinado tipo de investimento ou despesa dedutível comum para perfis semelhantes. A viabilidade e precisão deste módulo ainda estão em avaliação.
- Limite de Implementação: As análises financeiras se basearam nos dados fornecidos diretamente pelo usuário e nas regras gerais de declaração do IR. O sistema não oferecerá consultoria tributária personalizada ou otimizações fiscais complexas além da identificação de inconsistências básicas. A IA será utilizada apenas para gerar sugestões não vinculativas, sem garantir a obrigatoriedade ou adequação da declaração.


|<h1>4. <a name="_secf4hapgflg"></a>**Backlogs do Produto**</h1>|
| - |


1. **Controle Usuário e Segurança:**

- Rota de Login/Cadastro - Criar o backend, tendo foco nas rotas de login e cadastro.

- Validação de Duplo Fator - Aqui será usado a ferramenta do Google Authenticator que fará a autenticação de duplo fato

- Validação de token** - O token será uma forma de segurança que assim que o usuário se cadastrar o token autorizará seu acesso em sua devida seção.

- Autorização de Contador** - Será desenvolvida uma pop-up para o contador autorizar um cliente, assim o contador com suas finanças.

- Criação da Tela de Login/Cadastro** - Criação do Front-End, com foco na parte de login e cadastro, porém terá dois tipos de cadastro onde um é do cliente e outro do contador

1. **Cadastro de Bens e Análise Financeira:**

- Formulário de Bens e Direitos** - Nesta tela, haverá um formulário para o usuário preencher, contendo cada dado que ele precisa importar para o software, para armazenamento e análise futura pelo contador.

- Acompanhamento de Bens (com índices)** - Nesta tela, o contador analisará os dados inseridos pelo usuário e acompanhará seu comportamento!

- Criação da Dashboard** - Esta será a tela principal para o usuário, pois nesta seção será onde o usuário terá uma visão geral dos bens que ele cadastrou no software, design e informações intuitivas

1. **Geração de Relatórios:**

- Criação da área do Contador (lista de usuários) - Essa tela irá listar todas as notificações aceitas pelo contador, para ele fazer uma avaliação do usuário com base em no relatório que o mesmo gerou


- Criação da área do Relatório - Será uma área exclusiva para o contador contratado acessar e analisar o relatório gerado pelo usuário com base em seus bens.

- Criação da área Autenticação - Nessa área o usuário cliente pode estar escolhendo qual contador ele gostaria de estar sendo acompanhado


|<h1>5. <a name="_5it1bad5ft5t"></a>**Cronograma**</h1>|
| - |

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.003.png)

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.004.png)

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.005.png)

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.006.png)

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.007.png)



|<h1>6. <a name="_thbgaplxa9md"></a>**Materiais e Métodos**</h1>|
| - |


1. **Modelagem do sistema**: 

   ![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.008.png)

   ![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.009.png)

1. **Tecnologias utilizadas**: 

   Durante o desenvolvimento do sistema, foram adotadas diversas tecnologias, ferramentas e bibliotecas, tanto para o back-end quanto para o front-end, além de recursos para design e modelagem. A seguir, estão descritas cada uma delas, juntamente com seu propósito no projeto:

- **Java:** Linguagem utilizada para o desenvolvimento do **back-end**, responsável pela lógica de negócio, regras fiscais, processamento dos dados e integração com o banco de dados. Foi utilizado juntamente com o framework **Spring Boot**, que facilitou a criação de APIs REST, controle de dependências, segurança e configuração do ambiente.
- **PostgreSQL:** Sistema gerenciador de banco de dados relacional utilizado para armazenar todas as informações do sistema, como dados cadastrais, registros financeiros, documentos e movimentações necessárias para a geração da declaração de imposto de renda.
- **React.js:** Framework JavaScript utilizado para o desenvolvimento do **front-end**, permitindo a criação de uma interface de usuário dinâmica, responsiva e interativa. Foi combinado com **HTML**, **CSS** e **JavaScript puro** para estruturação e estilização das páginas.
- **Bibliotecas Front-end:** Foram utilizadas bibliotecas como **Axios** (para consumo de APIs), **React Router** (para roteamento das páginas) e o **Flaticon** uma coleção de ícones vetoriais (em formatos SVG, PNG, entre outros) que foram integrados ao front-end para enriquecer visualmente a interface do sistema.
- **APIs:** No projeto foram desenvolvidas APIs RESTful no back-end, que permitiram a comunicação entre o servidor (Java) e o cliente (React.js). As APIs fornecem serviços como envio e recebimento de dados fiscais, geração de relatórios e consulta de informações.
- **Figma:** Ferramenta utilizada para o **design UX/UI**, onde foram criados os protótipos das telas, fluxos de navegação, wireframes e a definição da identidade visual do sistema. O Figma auxiliou na validação da experiência do usuário antes do desenvolvimento.
- **Ferramentas de Modelagem:** Para desenho dos modelos de dados e diagramas, foram utilizadas ferramentas como **draw.io** (para modelagem do banco de dados, para criação de diagramas UML, como casos de uso, classes).

1. **Arquitetura do sistema**: 

A arquitetura do sistema foi desenvolvida seguindo o modelo de aplicação web com arquitetura cliente-servidor, distribuída em três principais camadas: **Front-end**, **Back-end** e **Banco de Dados**. O sistema foi projetado para garantir escalabilidade, segurança no processamento dos dados e uma comunicação eficiente entre os componentes.

O **fluxo das informações** ocorre da seguinte forma:

1. O **usuário** acessa o sistema por meio de uma interface web desenvolvida em **React.js**, que se comunica com o servidor através de requisições HTTP/HTTPS utilizando APIs REST.
1. O **Back-end**, desenvolvido em **Java** com o framework **Spring Boot**, é responsável por processar as requisições, aplicar as regras de negócio, realizar validações fiscais e garantir a segurança dos dados.
1. Sempre que necessário, o back-end realiza consultas, inserções, atualizações ou exclusões no **banco de dados PostgreSQL**, onde estão armazenadas todas as informações
1. As respostas geradas pelo back-end retornam para o front-end, que apresenta os dados de forma visual, interativa e organizada para o usuário.

Uma Imagem para melhor entendimento:

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.010.png)



|<h1>7. <a name="_6o7h03qkgj3l"></a>**Resultados**</h1>|
| - |

1. **Protótipo**: 

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.011.png)
### <a name="_eycot719a6cd"></a>**Como você deseja acessar o Declara Já?**
### <a name="_uvbstdyaj7oy"></a>Esta é a tela de entrada do sistema, projetada para guiar o usuário ao ambiente adequado com base em seu perfil. Ela permite que o usuário escolha entre as opções de acesso "Cliente" ou "Contador", direcionando-o para a jornada específica de sua função no sistema.


![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.012.png)
### <a name="_qc6iy7551xxi"></a>**Cliente - Tela de Login**
A tela de login permite o acesso do usuário ao sistema por meio do preenchimento dos campos de **e-mail** e **senha**. Ao clicar no botão **"Entrar"**, o sistema valida as credenciais informadas e, se corretas, redireciona o usuário para a área principal do sistema. Abaixo do formulário, há a opção **"Cadastre-se"**, destinada a novos usuários, e o link **"Esqueci minha senha"**, que direciona para o processo de recuperação de senha. A interface possui um design limpo e intuitivo, facilitando a navegação.

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.013.png)
### <a name="_6t7prudi6a7d"></a>**Cliente - Tela de Cadastro**
A tela de cadastro permite que novos usuários criem uma conta no sistema. Nela, o usuário deve preencher os campos de **nome**, **e-mail**, **senha** e **confirmação de senha**. Ao clicar no botão **"Criar"**, o sistema verifica se todos os dados foram inseridos corretamente e, em caso positivo, realiza o cadastro e redireciona o usuário para a área de login. A interface também conta com um link de retorno para a tela de login, garantindo uma navegação fluida e intuitiva.



![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.014.png)
### <a name="_wel07qaekiy7"></a>**Cliente - Tela de Lista de Bens (vazia)**
Esta tela é exibida quando o cliente acessa o sistema, mas ainda não possui nenhum item cadastrado. A interface exibe uma mensagem informativa: **“Você não possui nenhum item...”**, acompanhada de um botão destacado **“+ Novo Item”**. Ao clicar nesse botão, o usuário é direcionado para o formulário de criação de novos bens. A tela oferece uma navegação simples e direta, incentivando o usuário a começar o uso do sistema de forma prática.
### ![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.015.png)
### <a name="_psuw0byon2ah"></a><a name="_k37jxjbl9kz8"></a>**Cliente - Tela de Lista de Bens e Direitos**
A interface apresentada é a tela de listagem de bens e direitos cadastrados pelo cliente. No topo da tela, há uma barra de pesquisa que permite ao usuário filtrar rapidamente os itens cadastrados digitando parte do nome do bem ou direito. Abaixo da barra, os bens cadastrados são exibidos em uma lista interativa, onde cada item mostra o nome do bem ou direito em destaque, seguido por uma breve descrição. Cada item da lista possui botões de "Editar" e "Deletar", permitindo ao usuário modificar ou excluir o bem correspondente. Os itens podem ser expandidos ou recolhidos para uma visualização mais organizada.

No canto inferior direito da tela, há um botão destacado com o ícone de "+" e a frase "Crie Já", que permite ao cliente cadastrar um novo bem ou direito. A interface mantém uma paleta de cores suaves, com predominância de tons de verde e elementos arredondados, seguindo o padrão visual das outras telas do sistema e proporcionando uma experiência agradável e moderna ao usuário.

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.016.png)
### <a name="_frv7ojo2sy1t"></a>**Cliente - Tela de Exclusão de Bem (Confirmação)**
Quando o usuário opta por excluir um bem, a interface centraliza o item selecionado e desfoca os demais elementos da tela, direcionando a atenção para a ação crítica. O cartão do bem exibe novamente seu nome e descrição, e apresenta um botão “Confirmar Deleção” em destaque vermelho. Um ícone de “fechar” no canto superior direito permite ao usuário cancelar a operação. Essa tela garante clareza e segurança, evitando exclusões acidentais.

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.017.png)
### <a name="_iz2rcgrlshs"></a>**Cliente - Escolha seu Formulário**
Esta tela serve como o ponto de decisão inicial para o usuário que deseja cadastrar um novo bem ou informação. Ela apresenta de forma clara e organizada as diversas categorias de ativos e dados pessoais, permitindo que o cliente selecione o tipo de formulário adequado para o seu registro.

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.018.png)
### <a name="_c1tykuxyidfh"></a>**Cliente - Formulário**
Esta tela tem como objetivo permitir que o usuário insira todas as informações detalhadas. Ela é projetada para coletar dados essenciais como nome, tipo, finalidade, data e valor de aquisição, e forma de aquisição, e upar um anexo se necessário  preparando o registro do bem para ser submetido e analisado pelo sistema.

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.019.png)
### <a name="_93i604n7f0l9"></a>**Cliente - Editar Item**
Esta tela permite ao usuário modificar as informações previamente cadastradas de um item específico no sistema. É o ambiente onde o usuário pode atualizar detalhes existentes, corrigir dados ou complementar informações pendentes, assegurando que os registros permaneçam atualizados e precisos.

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.020.png)
### <a name="_h7e17080qpqs"></a>**Cliente - Análise Financeira (Detalhes do Item)**
Esta tela oferece uma visão analítica aprofundada de um item específico, exibindo dados financeiros como seu valor atual, histórico de valorização e desvalorização. Adicionalmente, apresenta informações descritivas relevantes e datas importantes associadas ao item, fornecendo ao usuário um panorama completo para acompanhamento e suporte à decisão.

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.021.png)
### <a name="_mtqlm9hjx2i4"></a>**Contador - Clientes (Vazia)**
Esta tela é o painel de gerenciamento de clientes para o Contador. Quando acessada e não há clientes associados ou solicitações pendentes, ela informa ao contador o status atual, orientando-o a aguardar por novas conexões ou verificar notificações.

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.022.png)
### <a name="_n7jvi23idstu"></a>**Contador - Clientes (Com Lista)**
Esta tela serve como o painel principal para o contador visualizar e gerenciar sua carteira de clientes. Ela exibe uma lista de todos os clientes associados, permitindo ao contador buscar por um cliente específico e acessar seus detalhes individuais, incluindo a visualização dos bens cadastrados.

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.023.png)
### <a name="_ed5pmy2j2rbw"></a>**Contador - Clientes ( Pesquisa)**
Esta tela mantém a função de painel de gerenciamento de clientes para o contador, mas com foco na funcionalidade de busca. Ela permite que o contador localize rapidamente um cliente específico dentro de sua lista, filtrando os resultados em tempo real à medida que o texto é digitado na barra de pesquisa.

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.024.jpeg)
### <a name="_ollsoaylfddo"></a>**Contador - Perfil do Cliente (Listagem de Bens)**
Esta tela exibe o perfil detalhado de um cliente específico, mostrando uma lista dos seus bens cadastrados. Para cada bem, há uma opção que permite ao contador visualizar uma breve descrição ou detalhes adicionais.






![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.025.jpeg)
### <a name="_bxght9o8fqzz"></a>**Contador - Perfil do Cliente (Geração de PDF)**
Esta tela, que faz parte do perfil detalhado de um cliente, permite ao contador gerar um documento PDF consolidado com as informações dos bens e direitos do cliente. É uma funcionalidade essencial para exportar dados para fins de declaração, relatórios ou arquivamentos.

1. **Códigos das principais funcionalidades**: Não foi possível desenvolver o software por falta de requisitos apontados pelo cliente.

|<h1>8. <a name="_3en6dvj8epi7"></a>**Conclusão**</h1>|
| - |

1. **Impacto do sistema:** Com a implantação do sistema "Declara Já", espera-se que o processo de preparação e organização para a declaração do Imposto de Renda seja significativamente facilitado para os usuários. O sistema permitirá que cidadãos e contadores registrem bens, direitos e documentos fiscais ao longo do ano, promovendo maior controle e organização.

   A expectativa é que o sistema reduza a incidência de erros, omissões e problemas com a malha fina, além de proporcionar **mais autonomia e segurança** no armazenamento de informações sensíveis. A geração automática de relatórios e os alertas sobre inconsistências deverão otimizar o tempo de preparação e aumentar a assertividade das declarações.

1. **Melhorias Futuras**: No futuro, o sistema poderá ser aprimorado com a inclusão de **tecnologias de Inteligência Artificial**, que ajudarão a realizar análises preditivas, sugerir correções automáticas e simular diferentes cenários de declaração com base no perfil financeiro do usuário.

   Além disso, está prevista a implementação de um módulo de **IA especializado na análise automática dos bens e direitos registrados**, que será capaz de identificar possíveis inconsistências, avaliar a evolução patrimonial ao longo do tempo e sugerir ajustes com base nas normas da Receita Federal, contribuindo para maior precisão e conformidade na declaração do IR.




|<h1>9. <a name="_tb1f721zwudu"></a>**Homologação do MVP junto ao cliente**</h1>|
| - |

Após as entregas parciais, realizadas de acordo com os requisitos do sistema  e cronograma, o MVP não foi apresentado ao cliente.

|<h1>10. <a name="_gdnlly8m74cu"></a>**Divulgação**</h1>|
| - |

1. **Linkedin do Projeto**

|![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.026.png)|www.linkedin.com/in/declara-já|
| :- | :-: |

1. **Seminário de Projetos de Software**

   **Vídeo da apresentação:** [Link do video](https://pt.linkedin.com/posts/declara-j%C3%A1_v%C3%ADdeo-demonstrativo-da-apresenta%C3%A7%C3%A3o-do-projeto-activity-7331506940734320640-do2-?utm_source=li_share&utm_content=feedcontent&utm_medium=g_dt_web&utm_campaign=copy)

|![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.027.jpeg)|![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.028.jpeg)|
| :-: | :-: |
|Temos dois integrantes da equipe a esquerda, auxiliando na apresentação do slide, no meio o slide em si apresentando o problema que nosso cliente enfrenta e por fim a direita, um dos integrantes descrevendo a situação|Kauã Hipólito Rodrigues|













Segue abaixo a lista de presentes na apresentação.

|**Lista de presentes na Apresentação**|**Matrícula**|
| :-: | :-: |
|Kauã Hipólito Rodrigues|202402410318|
|Luca Silva Levanteze|202403271753|
|Rafael dos Santos Giorgi|202402411039|
|Gabriel de Moura Botelho Campos|202308428535|
|Matheus Oliveira da Silva|202402410474|
|Pedro Adolfo Custódio Maia|202403019752|
|Daniel Vitor Fonseca de Oliveira|202403522594|
|GABRIEL FLAUSINO RODRIGUES|202404093638|
|Pedro Henrique De Souza Pereira|202402410946|
|Richard Castro Gois|202402411012|
|Caio Tawfiq Asiamah|202408292007|
|Gabriel de Sousa Silveira|202302381911|
|Gabriel Rocha dos santos|202302704328|
|Gustavo Pascoal Novais Batista|202302380931|
|Daniel de Fabris Catozzi|202402410873|
|Luis felipe Ribeiro e Silva|202402411071|
|Otávio Babler Cabral|202402594826|



|<h1>11. <a name="_wrbwytkjn1tk"></a>**Carta de Apresentação**</h1>|
| - |
![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.029.png)

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.030.png)




|<h1>12. <a name="_l49b37ibdzv3"></a>**Carta de Autorização**</h1>|
| - |

![](https://github.com/devraffles/LTD.2025.1.011-Declara_Ja/blob/main/Imagens/Aspose.Words.c3bd96b8-02c5-4a68-9e54-949e6e6636b4.031.png)

|<h1>13. <a name="_jo22ads71pg0"></a>**Relato individual do processo**</h1>|
| - |

|Luca Silva Levanteze|
| :- |
|<p>No desenvolvimento do projeto DeclaraJá, minha principal responsabilidade foi criar o design do sistema e desenvolver as telas restantes que não foram feitas pelo Kauã. Fui responsável por toda a construção da identidade visual, desde a escolha das cores, tipografia e ícones até a elaboração dos fluxos de navegação no Figma, sempre buscando criar uma interface limpa, intuitiva e agradável para os usuários.<br><br>Além do design, também participei ativamente no desenvolvimento do front-end, implementando diversas telas e garantindo que o layout desenvolvido no Figma fosse fielmente reproduzido no código, utilizando React.js, HTML, CSS e JavaScript. Algumas dessas telas incluem o dashboard, login, cadastro e a área de clientes e contadores</p><p></p><p>Esse projeto me proporcionou uma experiência muito enriquecedora, tanto no aprimoramento das minhas habilidades em design UX/UI quanto no desenvolvimento prático de aplicações web. Aprendi na prática a importância de alinhar estética, funcionalidade e usabilidade, além de trabalhar de forma colaborativa com a equipe para garantir que as necessidades do cliente fossem atendidas.</p>|

|Kauã Hipólito Rodrigues|
| :- |
|<p>Durante o desenvolvimento do projeto DeclaraJá, atuei principalmente na construção da interface do usuário (Front-End). Desenvolvi quatro telas fundamentais do sistema, utilizando React.js, HTML, CSS e JavaScript, seguindo os protótipos criados no Figma. As telas desenvolvidas foram essenciais para proporcionar uma navegação intuitiva, com foco na experiência do usuário e na organização dos dados fiscais.</p><p></p><p>Além da parte técnica, também participei ativamente das reuniões com o cliente, buscando entender suas necessidades e garantir que as funcionalidades do sistema estivessem alinhadas às expectativas e aos processos contábeis reais. Esse contato foi fundamental para ajustar detalhes tanto no layout quanto nas funcionalidades.</p><p></p><p>Esse projeto me proporcionou um grande aprendizado, especialmente no desenvolvimento de interfaces profissionais, na comunicação com clientes e na aplicação prática dos conhecimentos adquiridos na disciplina de Programação Orientada a Objetos. Percebi a importância de ouvir o cliente, entender profundamente o problema e traduzir essas demandas em soluções tecnológicas viáveis e funcionais.</p>|

|Rafael dos Santos Giorgi|
| :- |
|<p>Durante o desenvolvimento do projeto Declara Já, fui responsável pela criação de boa parte do back-end do sistema. Meu trabalho envolveu a definição da estrutura da API, implementação das regras de negócio, configuração da comunicação com o banco de dados PostgreSQL e a aplicação das boas práticas de segurança.<br><br>Uma das maiores dificuldades enfrentadas foi estruturar uma API robusta que permitisse o cadastro de bens, controle de usuários (clientes e contadores) e a geração de relatórios financeiros, garantindo que as informações fossem consistentes e seguras. Além disso, precisei estudar e aplicar conceitos mais avançados do framework Spring Boot, principalmente nas áreas de segurança e gerenciamento de sessão.</p><p>Também trabalhei na criação dos endpoints RESTful, na validação dos dados recebidos, e na integração de funcionalidades críticas, como a autorização de contadores e o envio de notificações para os usuários. Isso exigiu uma comunicação constante com meus colegas de equipe para alinhar o funcionamento do front-end e garantir que os dados trafegarem corretamente entre as camadas do sistema.</p><p>Apesar dos desafios, considero que essa experiência foi extremamente enriquecedora. Aprimorei minhas habilidades em desenvolvimento back-end, organização de código, versionamento e no uso de ferramentas de colaboração. Fiquei satisfeito em poder aplicar conhecimentos teóricos em um projeto prático, que tem potencial real de auxiliar pessoas na organização de seus documentos fiscais e na prevenção de problemas com a Receita Federal.</p>|





|/18|
| -: |

