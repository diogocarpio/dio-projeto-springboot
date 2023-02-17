# dio-projeto-springboot
Projeto Java com SpringBoot

/* @Bean : Objetos gerenciados pelo springboot
	 * 			Utiliza em objetos que não são uma implementação, não se tem acesso ao código fonte
	 * 			E criamos Bean em classes para ter acesso aos seus dados internos
	 * 			para serem acessados pelo spring.
	 * 
	 * @Component : Componentes escaneados pela aplicação, quando se tem 
	 * 				acesso ao código fonte.
	 * 
	 * @Autowired : Injeção de dependência de classes do springboot
	 * 
	 * Objeto Singleton : Um único objetivo utilizado a cada necessidade da minha aplicação.
	 * 
	 * Objeto Prototype : A cada necesisdade da minha aplicação(dependência) eu terei um instância corresponde 
	 * 					  a essa necessidade
	 * 
	 * Properties value : Ele mantem estados e informações da aplicação, assim garantimos 
	 * (application.	  que não terão alteração dos valores, a anotação @Value("${teste}") 
	 * 	properties)		  é utilizada em cima das variaveis criadas onde serão atribuidos os valores dos properties,
	 * 					  ou pode se obter um Default value também caso não encontreo um propertie . 
	 * 
	 * @ConfigurationProperties(prefix = "teste") : Anotação onde todos os valores do Bean de configuração virão do application.properties
	 * 									 		    Assim teremos nossas informações centralizadas em uma determinada classe para utilizar a anotação
	 *												e não será necessario usar o @Value em cada variavel  	
	 * 
	 * ORM : Mapeamentos de objetivos relacional, é um recurso para aproximar o paradigma da orientação a objetos ao contexto de banco de dados relacional
	 * 		 O uso de ORM é realizado através do mapeamento de objeto para uma tabela por uma biblioteca ou framework.	
	 * 
	 * JPA : é uma especificação baseada em interfaces, que através de um framework(Hibernate p/ exemplo) realiza operações de persistência de objetos java.
	 * 		 Seus exemplos de implementações -> Hibernate, Eclipse Link, Oracle top link e Open JPA
	 * 
	 * Mapeamentos : Os aspectos das anotações de mapeamento do JPA onde teremos que ter em nossas classes, são: Identificação, Definição, Relacionamento, 
	 * 				 Herança e Persistência.
	 * 
	 * EntityManager: É capaz de realizar todas as operações cruds, incluindo seleções dos registros do banco de dados.
	 * 
	 * Spring Data JPA: Framework que proporciona ou adiciona uma camada sobre o JPA, ele usa todos os recursos definidos pela especificação JPA, porém provendo a melhoria em
	 * 					mapeamentos e recursos de persistencia baseado em interface e anotações. 
	 * 					principais interfaces -> CrudRepository, JPARepository, PagingAndSortingRepository
	 * 					principais anotações -> @Query, @Param
	 * 
	 * JPA Repository : O repositório seria uma classe para buscar informações no banco de dados ou no local onde as informações
	 * 					foram persistidas. Mas no caso do JpaRepository ele provê a ligação a determinada classe do Model com possibilidade
	 * 					de persistir no banco de dados.
	 * 					Principais métodos que ja são disponibilizados no framework: save, findById, existesById, findAll, delete, count.
	 * 					O Spring Data JPA se encarrega de realizar a implementação através do padrão CRUD. 
	 * 
	 */
