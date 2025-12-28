echo "Stopping old app..."
if [ -f /root/app/app.pid ]; then
    kill $(cat /root/app/app.pid) || true
    rm -f /root/app/app.pid
fi

echo "Starting new app..."
nohup java -jar /root/app/app.war > /root/app.log 2>&1 &
echo $! > /root/app/app.pid

chmod +x /root/deploy.sh