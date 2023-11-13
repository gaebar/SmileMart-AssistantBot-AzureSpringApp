# TechBridge Capstone: Smile Mart Chatbot Security Upgrade with Azure Spring App

## Overview

This repository is part of the TechBridge Capstone Project, focusing on the Smile Mart Assistant
Chatbot. The project encompasses the deployment of a chatbot using Azure Language for natural
language processing and Azure QnA for handling question-answer pairs. A critical aspect of this
project was addressing a security oversight identified during the GitHub deployment phase.

Additionally, the Smile Mart project includes a separate repository dedicated to the store's landing
page, containing the front-end components and design elements of the Smile Mart Store. This related
repository forms the initial part of the Smile Mart project.

For more details and to view the source code of the landing page, visit
the [Smile Mart Store Landing Page Repository](https://github.com/gaebar/SmileMart-Store-Landing-Page).

### Smile Mart Website Link

[Smile Mart Testing Website](https://gaebar.github.io/SmileMart-Store-Landing-Page/src/)

### Team:

- [Melissa Vargas](https://www.linkedin.com/in/melissa-vargas-57a96828a/)
- [Mary Nichols](https://www.linkedin.com/in/fuseboxradio/)
- [Gaetano Barreca](https://www.linkedin.com/in/gaetanobarreca/)
- [Kendall Drummond](https://www.linkedin.com/in/kendalldrummond/)
- [Kayla Thorne](https://www.linkedin.com/in/kaylthorne/)
- [Yvonne Sudlow](https://www.linkedin.com/in/yvonne-sudlow/)

## Project Implementation

### Initial Setup and Security Oversight

After successfully setting up the Smile Mart Assistant chatbot, a significant security concern was
identified. The iframe link, generated by Azure Language, was inadvertently exposing the private key
in the GitHub repository.

### Addressing the Security Challenge

Due to the limitations of the Azure Basic pricing tier, particularly the lack of access to the
properties file feature (exclusive to the Enterprise tier), an alternative solution was necessary.
This feature, typically used for the secure storage of environment variables including keys, was not
available in our chosen tier.

#### Solution Strategy

To mitigate this security issue, we employed Azure Spring Apps to create a temporary token
generator. This approach ensured that our sensitive keys were securely managed, without direct
exposure in the repository. The integration of this solution with Azure Spring Apps CI/CD through
GitHub Actions further enhanced our deployment process.

### Deployment Steps

#### Step 1: Deployment to Azure Spring Apps

1. **Plan Selection:** The project utilized the Azure Spring Apps Standard consumption and dedicated
   (Preview) plan.
2. **Reference Guide:** For setup details, refer to the [Azure Spring Apps Quickstart
   Guide](https://learn.microsoft.com/en-us/azure/spring-apps/quickstart?tabs=Azure-Developer-CLI%2CAzure-portal-ent%2CConsumption-workload&pivots=sc-consumption-plan).

#### Step 2: Azure Spring Apps CI/CD using GitHub Actions for Java

1. **Programming Language:** The project was implemented using Java.
2. **Setup Guide:** Step-by-step instructions can be found in the [Azure Spring Apps CI/CD GitHub
   Actions
   Guide](https://learn.microsoft.com/en-us/azure/spring-apps/how-to-github-actions?pivots=programming-language-java).

### Conclusion

This project showcases the effective use of Azure services in building a secure chatbot solution.
The identification and resolution of the security issue underline the importance of robust security
practices in software development, especially in cloud-based applications.

## Azure README Integration

After careful consideration, the [Azure Spring App README](initial/README.adoc) will be adapted and
integrated to
provide
clear and specific instructions related to the deployment and management of the Azure resources
utilized in our project.

## Further Reading & Resources

Explore these additional resources to understand the technical details and broader context of our
project:

- [Azure Cognitive Services Documentation](https://docs.microsoft.com/azure/cognitive-services/)
- [Azure Spring Apps Documentation](https://docs.microsoft.com/azure/spring-apps/)

## Acknowledgments

Special thanks to the TechBridge team, Sam's Club Technology, and all the
stakeholders who have provided invaluable feedback and support throughout the lifecycle of this
project.
