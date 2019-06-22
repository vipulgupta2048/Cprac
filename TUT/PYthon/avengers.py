import requests
from lxml import html
from bs4 import BeautifulSoup
import os
import time

n=0
while True:
    n=n+1

    r = BeautifulSoup(requests.get("  https://in.bookmyshow.com/movies/avengers-endgame-3d/ET00100559").content, "html.parser").find("a", {"class":"showtimes btn _cuatro"})
    if(r!=None):
        os.system("beep")
        print("Get the tickets Whatever it takes")
    else:
        print("No Endgame Found: {}".format(n))
        time.sleep(240)



# https://in.bookmyshow.com/national-capital-region-ncr/movies/avengers-endgame/ET00090482
# https://in.bookmyshow.com/national-capital-region-ncr/movies/shazam/ET00072971


# ~ class avengers(scrapy.Spider):
    # ~ name = "avengers"
    # ~ start_urls = ['https://in.bookmyshow.com/national-capital-region-ncr/movies/avengers-endgame/ET00090482']

    # ~ # Testing URL - https://in.bookmyshow.com/national-capital-region-ncr/movies/shazam/ET00072971


    # ~ def parse(self, response):
        # ~ book_button = response.xpath("/html/body/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/a").extract_first()
        # ~ if (book_button):
            # ~ os.system("beep")
