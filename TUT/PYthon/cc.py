from PIL import Image, ImageDraw, ImageFont
# get an image
base = Image.open('./bro.png').convert('RGBA')

# make a blank image for the text, initialized to transparent text color
txt = Image.new('RGBA', base.size, (255,255,255,0))

# get a font
fnt = ImageFont.truetype('/usr/share/fonts/truetype/ubuntu/Ubuntu-B.ttf', 40)
# get a drawing context
d = ImageDraw.Draw(txt)

# draw text, full opacity
d.text((10,60), "World", font=fnt,  fill=(255,255,255,255))
#font=fnt,
out = Image.alpha_composite(base, txt)

out.save('bo.png')
