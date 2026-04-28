# Stage 1: Build Angular
FROM node:18-alpine AS build
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN ./node_modules/.bin/ng build

# Stage 2: Serve with Nginx
FROM nginx:alpine

# Remove default nginx files
RUN rm -rf /usr/share/nginx/html/*

# Corrected: Added a SPACE between /app/dist/frontend and /usr/share/nginx/html
COPY --from=build /app/dist/frontend /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]

