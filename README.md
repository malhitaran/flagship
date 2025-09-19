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

---

## 🌱 Roadmap

- **Multi-tenant support** → separate flags for different customers  
- **Environments** (dev, staging, production)  
- **User targeting rules** (percent rollouts, attribute-based targeting)  
- **SDKs** → client libraries to fetch/evaluate flags in apps  
- **Real-time updates** → WebSockets or SSE so apps instantly get new flag values  
- **Audit logs** → track who changed what and when  
- **React Admin UI** → friendly dashboard for teams to manage flags  

## 🖼 Architecture Diagram

Simple view:

[Frontend: React Admin UI] <--> [Backend: Spring Boot API] <--> [Database: Postgres]


Detailed view:

[React Admin UI]
| (HTTP REST / JSON)
v
[Spring Boot API]
| (JPA / SQL)
v
[Postgres Database]

[Spring Boot API] --> [Redis Cache] (caching flag values for fast access)
[Spring Boot API] --> [SDK clients] (via REST or streaming updates)
[Spring Boot API] --> [Webhooks] (notify other services)

---

## 🔄 How It Works (Simplified)

1. **Frontend → Backend**  
   The React Admin UI sends HTTP requests (JSON) to the Spring Boot API to **create, list, or toggle flags**.  

2. **Backend → Database**  
   Spring Boot uses **JPA** to read/write flag data in **Postgres**.  

3. **Backend → Cache**  
   Redis stores frequently accessed flag values to speed up evaluations.  

4. **Backend → SDK clients / Webhooks**  
   Applications using your SDK ask the backend: "Is this flag enabled for this user?"  
   Webhooks can notify other systems of changes.  

---
