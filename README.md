# Flagship

**Flagship** is a simple **Feature Flag Platform** — think of it like a "switchboard" for your application features.  

Instead of hard-coding features directly into your app, Flagship lets you **turn features ON or OFF** dynamically without redeploying code. This is especially useful when:
- You want to test a new feature with only a subset of users.
- You want the ability to quickly disable a buggy feature in production.
- You want different environments (dev, staging, production) to have different configurations.

This project is inspired by tools like [LaunchDarkly](https://launchdarkly.com/) but is built from scratch as a learning project.  

### What it currently does
✅ Exposes a REST API to manage feature flags  
✅ Stores flags in a **Postgres** database  
✅ Lets you:
- **Create** new flags (with a unique key and an enabled/disabled status)  
- **List** all flags  
- **Toggle** a flag ON ↔ OFF  

### Why this project matters
This is more than just a "toy app." By building Flagship, we’re practicing skills real companies care about:
- **Backend API design** (using Spring Boot + REST)
- **Database modeling** (using Postgres + JPA)
- **Basic DevOps flow** (running the app locally, connecting services, preparing for Docker)
- **Scalable architecture thinking** (later: environments, tenants, rollouts, SDKs)
