
# Getting Started
This is the most basic form of AI API usage in spring boot. This is created just to test the AI capability from Spring boot/java.

## Prerequisites / Tech stack
* Java 17+
* HuggingFace API Token
* Postman or SoapUI (For ease of API calls)


## Functionality
This application performs is very lightweight and its sole purpose is to accepts long texts and respond with summarized version of it

### endpoint 

`POST http://localhost:8080/api/summarize`

### Sample request/response body

* Request : 
`{
"text": "Artificial Intelligence (AI) is revolutionizing industries across the globe. From healthcare to finance, AI-powered solutions are automating tasks, improving efficiency, and enabling data-driven decision-making. In the healthcare sector, AI is assisting doctors with medical image analysis, helping detect diseases at an early stage. In finance, AI-driven algorithms are optimizing trading strategies and fraud detection systems. AI is also transforming customer service with intelligent chatbots that provide instant responses. Despite these advancements, concerns around data privacy, ethical AI, and job displacement remain hot topics. As AI technology continues to evolve, it is crucial for businesses to adopt responsible AI practices while leveraging its immense potential to drive innovation. AI is making significant strides in education as well. Adaptive learning platforms use AI to personalize the learning experience, tailoring content to individual student needs. AI-powered tutors provide instant feedback and guidance, helping students grasp complex topics faster. In the retail industry, AI is enhancing customer experiences by offering personalized product recommendations, optimizing supply chain management, and improving demand forecasting. Additionally, AI-powered robotics are automating warehouse operations, making logistics more efficient. In the automotive industry, AI is a key driver behind the development of autonomous vehicles. Self-driving cars use AI algorithms to interpret sensor data, detect obstacles, and make real-time driving decisions. AI is also playing a crucial role in predictive maintenance, helping vehicle manufacturers detect potential issues before they lead to breakdowns. As AI continues to evolve, its impact across various industries will only expand, unlocking new opportunities and driving technological advancements that shape the future."
}`


* Response :
`[
{
"summary_text": "Artificial Intelligence (AI) is revolutionizing industries across the globe. From healthcare to finance, AI-powered solutions are automating tasks. Despite these advancements, concerns around data privacy, ethical AI, and job displacement remain hot topics. As AI technology continues to evolve, it is crucial for businesses to adopt responsible AI practices."
}
]`


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.3/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.3/maven-plugin/build-image.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

