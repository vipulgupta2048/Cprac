from datetime import date

today = date.today()
birthday = date(today.year, 7, 19)

if birthday == today:
    print("Happy Birthday Vipul")
