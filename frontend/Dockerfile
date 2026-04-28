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

# Copy the build output from Stage 1
# Angular 17+ builds to dist/frontend/browser
COPY --from=build /app/dist/frontend/usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]

