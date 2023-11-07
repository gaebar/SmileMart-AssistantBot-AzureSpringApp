# WIP: TechBridge Capstone Project: Smile Mart Assistant Chatbot with Azure Spring App

Status: Work in Progress

This repository is developing a temporary token provider for the Azure-powered chatbot application, designed to facilitate secure and efficient customer service operations for Smile Mart.

## Table of Contents
- [Executive Summary](#executive-summary)
- [Team & Responsibilities](#team--responsibilities)
- [Technical Approach](#technical-approach)
- [Business Case](#business-case)
- [Development and Deployment Guide](#development-and-deployment-guide)
- [Azure README Integration](#azure-readme-integration)
- [Further Reading & Resources](#further-reading--resources)
- [Acknowledgments](#acknowledgments)


## Executive Summary
The Smile Mart Assistant Chatbot project encapsulates the integration of Azure Cognitive Services and Azure Spring Apps to enhance customer interaction within the Smile Mart retail environment. This solution aims to streamline customer service operations, reduce wait times, and provide 24/7 assistance, leading to an overall improved customer experience and satisfaction.

## Team & Responsibilities

### Team:
- Melissa Vargas
- Mary Nichols
- Gaetano Barreca
- Kendall Drummond
- Kayla Thorne
- Yvonne Sudlow

## Technical Approach
Our project harnesses the capabilities of Azure Cognitive Services, specifically QnA Maker, for its natural language processing prowess, paired with Azure Spring Apps for a robust backend. The integration with GitHub Actions facilitates continuous integration and deployment, ensuring smooth and consistent updates.

### Chatbot Solution:
- **QnA Maker** to understand and respond to customer queries
- **Azure Spring Apps** for scalable backend services
- **(GitHub Actions)[https://docs.github.com/actions]** for streamlined deployment workflows

### Backend Development:
- **Java** for robust and efficient backend logic
- **Azure Spring Apps (ASA)** leveraged for secure token generation and management
- Hosted on **GitHub Pages** for easy access and visibility

### Technical Limitations and Future Upgrades:
- Limited to current Azure tier features with plans to evaluate the upgrade to Azure Enterprise for expanded capabilities
- Development of a roadmap for incorporating additional Azure services and creating a more personalized user experience

## Business Case
The Assistant Chatbot acts as a virtual customer service representative, capable of handling a wide array of customer inquiries without human intervention, allowing Smile Mart to allocate human resources more effectively and improving operational efficiency.

## Development and Deployment Guide
A step-by-step guide for development and deployment.


## Development and Deployment Guide

### Session 1: Initial Findings and Direction
The project kickoff phase encompassed identifying the core customer service challenges and establishing objectives for the chatbot to address.

### Session 2: In-Depth Development
Development focused on creating a responsive and accurate chatbot, iterating through various designs, and ensuring seamless integration with existing Smile Mart systems.

#### Repositories in Progress:
- [Smile Mart Store Landing Page with Chatbot Logic](https://github.com/gaebar/SmileMart-Store-Landing-Page)
- [Smile Mart AssistantBot AzureSpringApp](https://github.com/gaebar/SmileMart-AssistantBot-AzureSpringApp)

### Smile Mart Website Link
[Smile Mart Testing Website](https://gaebar.github.io/SmileMart-Store-Landing-Page/src/)

### Steps:
The setup process involves configuring the QnA chatbot within the Azure portal, deploying the backend through Azure Spring Apps, and integrating the frontend with the chatbot service.

#### STEP 1: Create and Configure Custom QnA Chatbot

- Chosen for its adaptive learning capabilities and seamless user experience
- Follow the provided [Azure Chatbot Tutorial](https://docs.microsoft.com/azure/cognitive-services/qnamaker/tutorials/create-publish-query-in-portal)

#### STEP 2 and STEP 3: Deployment and Integration

- Deploy backend services using Azure Spring Apps for efficient scaling and management
- Implement GitHub Actions for a CI/CD pipeline, automating the deployment process

## Azure README Integration
After careful consideration, the Azure Spring App README will be adapted and integrated to provide clear and specific instructions related to the deployment and management of the Azure resources utilized in our project.

## Further Reading & Resources
Explore these additional resources to understand the technical details and broader context of our project:

- [Azure Cognitive Services Documentation](https://docs.microsoft.com/azure/cognitive-services/)
- [Azure Spring Apps Documentation](https://docs.microsoft.com/azure/spring-apps/)

## Acknowledgments
Special thanks to the TechBridge team, Smile Mart's IT department, and all the stakeholders who have provided invaluable feedback and support throughout the lifecycle of this project.
