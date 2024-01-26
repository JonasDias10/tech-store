docker-compose down

docker build -t tech-store-backend ./backend
docker build -t tech-store-frontend ./frontend

docker-compose up --build --remove-orphans --force-recreate