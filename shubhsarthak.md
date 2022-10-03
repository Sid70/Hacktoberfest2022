### Shubh Sarthak Sahu
-Photo: https://imgur.com/z6b0cMl
-Location:India
-Github: https://github.com/thelifeofshubh



HTML
<div class="dry"></div>

CSS
/* Presets */
*,
*:before,
*:after {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
}

body {
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  overflow: hidden;
  position: relative;
  z-index: 1;
  background: linear-gradient(180deg, #a65325 0%, #dacc99 100%),
    linear-gradient(180deg, #000 0%, #000 100%);
  animation: darken-land 20s linear;
  animation-play-state: running;
  animation-iteration-count: 1;
  animation-fill-mode: both;
}

div:before,
div:after {
  display: block;
  content: "";
  position: absolute;
}

div.dry {
  /* colors */
  --foreground: #5b5144;
  --midground: #7d684e;
  --farground: #a98152;
  --sun: #fae7b6;
  --clouds: #cb8850;
  --shadows: #5a4a35;
  /* positions */
  --foreground-base: 15vh;
  --fore-distance: 78vh;
  --midground-base: 25vh;
  --mid-distance: 63vh;
  --background-base: 30vh;
  --back-distance: 60vh;
  width: 100vw;
  height: 100vh;
  margin: 0;
  padding: 0;
  position: relative;
  --first-tier:
  
    /* rightest hill */ radial-gradient(
        ellipse,
        var(--foreground) 55vh,
        transparent 55vh
      )
      160vh calc(var(--fore-distance) + 5vh) / 110vh 20vh no-repeat,
    160vh calc(var(--fore-distance) + 5vh) / 110vh 20vh no-repeat,
    /* right hill */
      radial-gradient(ellipse, var(--foreground) 55vh, transparent 55vh) 60vh
      calc(var(--fore-distance) + 1vh) / 110vh 20vh no-repeat,
    /* left hill */
      radial-gradient(ellipse, var(--foreground) 55vh, transparent 55vh) -20vh calc(
        var(--fore-distance) + 5vh
      ) / 110vh 20vh no-repeat,
    /* base */ linear-gradient(var(--foreground) 100%, transparent 100%) 100%
      100% / 100% var(--foreground-base) no-repeat;
  --second-tier:

    /* rightest hill */ radial-gradient(
        ellipse,
        var(--midground) 55vh,
        transparent 55vh
      )
      60vh calc(var(--mid-distance) + 5vh) / 270vh 17vh no-repeat,
    /* right hill */
      radial-gradient(ellipse, var(--midground) 55vh, transparent 55vh) 60vh
      var(--mid-distance) / 110vh 20vh no-repeat,
    /* left hill */
      radial-gradient(ellipse, var(--midground) 55vh, transparent 55vh) -50vh calc(
        var(--mid-distance) + 5vh
      ) / 110vh 50vh no-repeat,
    /* mid hill */
      radial-gradient(ellipse, var(--midground) 55vh, transparent 55vh) 10vh
      calc(var(--mid-distance) + 5vh) / 110vh 50vh no-repeat,
    /* base */ linear-gradient(var(--midground) 100%, transparent 100%) 100%
      100% / 100% var(--midground-base) no-repeat;
  --third-tier:

    /* rightest hill */ radial-gradient(
        ellipse,
        var(--farground) 55vh,
        transparent 55vh
      )
      70vh calc(var(--back-distance) + 5vh) / 320vh 10vh no-repeat,
    /* right hill */
      radial-gradient(ellipse, var(--farground) 55vh, transparent 55vh) 40vh
      calc(var(--back-distance) - 1vh) / 140vh 20vh no-repeat,
    /* left hill */
      radial-gradient(ellipse, var(--farground) 55vh, transparent 55vh) -20vh var(
        --back-distance
      ) / 110vh 20vh no-repeat,
    /* base */ linear-gradient(var(--farground) 100%, transparent 100%) 100%
      100% / 100% var(--background-base) no-repeat;

  --left-cactus:
    /* cactus arm left */ radial-gradient(
        ellipse,
        var(--foreground) 4vh,
        transparent 4vh
      )
      15vh 50vh / 8vh 20vh no-repeat,
    /* cactus arm base left */
      radial-gradient(ellipse, var(--foreground) 6vh, transparent 6vh) 8vh 60vh /
      30vh 15vh no-repeat,
    /* cactus arm right */
      radial-gradient(ellipse, var(--foreground) 4vh, transparent 4vh) 39.5vh
      30vh / 8vh 20vh no-repeat,
    /* cactus arm base right */
      radial-gradient(ellipse, var(--foreground) 6vh, transparent 6vh) 25vh 40vh /
      30vh 15vh no-repeat,
    /* cactus top */
      radial-gradient(ellipse, var(--foreground) 6vh, transparent 6vh) 25vh 30vh /
      12vh 20vh no-repeat,
    /* cactus base */ linear-gradient(var(--foreground) 100%, transparent 100%)
      25vh 40vh / 12vh 80vh no-repeat;

  --right-cactus:
    /* cactus arm left up */ radial-gradient(
        ellipse,
        var(--foreground) 2vh,
        transparent 2vh
      )
      116.5vh 21vh / 4vh 12vh no-repeat,
    /* cactus arm base left up */
      radial-gradient(ellipse, var(--foreground) 6vh, transparent 6vh) 103vh
      24.5vh / 40vh 15vh no-repeat,
    /* cactus arm left */
      radial-gradient(ellipse, var(--foreground) 3vh, transparent 3vh) 116vh
      44vh / 6vh 24vh no-repeat,
    /* cactus arm base left */
      radial-gradient(ellipse, var(--foreground) 6vh, transparent 6vh) 104vh
      59vh / 40vh 15vh no-repeat,
    /* cactus arm right */
      radial-gradient(ellipse, var(--foreground) 3vh, transparent 3vh) 139vh
      32vh / 6vh 16vh no-repeat,
    /* cactus arm base right */
      radial-gradient(ellipse, var(--foreground) 6vh, transparent 6vh) 117vh
      40vh / 40vh 15vh no-repeat,
    /* cactus top */
      radial-gradient(ellipse, var(--foreground) 5vh, transparent 5vh) 115vh
      10vh / 28vh 40vh no-repeat,
    /* cactus base */ linear-gradient(var(--foreground) 100%, transparent 100%)
      125vh 30vh / 9vh 90vh no-repeat;

  --back-cactus:
    /* cactus arm left */ radial-gradient(
        ellipse,
        var(--midground) 1vh,
        transparent 1vh
      )
      95vh 46vh / 4vh 16vh no-repeat,
    /* cactus arm base left */
      radial-gradient(ellipse, var(--midground) 3vh, transparent 3vh) 77vh 48vh /
      44vh 18vh no-repeat,
    /* cactus arm right */
      radial-gradient(ellipse, var(--midground) 1vh, transparent 1vh) 105vh
      36.5vh / 3vh 11vh no-repeat,
    /* cactus arm base right */
      radial-gradient(ellipse, var(--midground) 2vh, transparent 2vh) 95vh 40vh /
      20vh 10vh no-repeat,
    /* cactus top */
      radial-gradient(ellipse, var(--midground) 3vh, transparent 3vh) 99vh 35vh /
      6vh 10vh no-repeat,
    /* cactus base */ linear-gradient(var(--midground) 100%, transparent 100%)
      99vh 40vh / 6vh 30vh no-repeat;

  --rocks:
    /* left rocks */ linear-gradient(
        -9deg,
        var(--farground) 30%,
        transparent 30%
      )
      0vh 10vh / 10vh 60vh no-repeat,
    linear-gradient(-12deg, var(--farground) 30%, transparent 30%) 10vh -10vh / 12vh
      80vh no-repeat,
    linear-gradient(9deg, var(--farground) 30%, transparent 30%) 20vh -5vh / 14vh
      80vh no-repeat,
    /* right rocks */
      linear-gradient(-9deg, var(--farground) 30%, transparent 30%) 100vh 10vh /
      30vh 60vh no-repeat,
    linear-gradient(-12deg, var(--farground) 30%, transparent 30%) 110vh -10vh /
      12vh 80vh no-repeat,
    linear-gradient(9deg, var(--farground) 30%, transparent 30%) 120vh -15vh / 14vh
      80vh no-repeat,
    linear-gradient(-12deg, var(--farground) 30%, transparent 30%) 130vh -12vh /
      12vh 80vh no-repeat,
    linear-gradient(9deg, var(--farground) 30%, transparent 30%) 140vh -5vh / 14vh
      80vh no-repeat;

  --cloudy-sky:
    /* cactus arm base right */ radial-gradient(
        ellipse,
        var(--clouds) 16vh,
        transparent 16vh
      )
      30vh 10vh / 200vh 10vh no-repeat,
    /* cactus arm base right */
      radial-gradient(ellipse, var(--clouds) 16vh, transparent 16vh) 40vh 5vh /
      200vh 10vh no-repeat,
    /* cactus arm base right */
      radial-gradient(ellipse, var(--clouds) 16vh, transparent 16vh) -100vh 20vh /
      200vh 10vh no-repeat,
    /* cactus arm base right */
      radial-gradient(ellipse, var(--clouds) 16vh, transparent 16vh) -80vh 25vh /
      200vh 10vh no-repeat,
    /* cactus arm base right */
      radial-gradient(ellipse, var(--clouds) 16vh, transparent 16vh) -50vh 5vh /
      200vh 10vh no-repeat,
    /* cactus arm base right */
      radial-gradient(ellipse, var(--clouds) 16vh, transparent 16vh) -65vh 10vh /
      200vh 10vh no-repeat;

  background: var(--left-cactus), var(--right-cactus), var(--first-tier),
    var(--second-tier), var(--back-cactus), var(--third-tier), var(--cloudy-sky),
    var(--rocks);
}

div.dry:before {
  width: 100vw;
  height: 100vh;
  margin: 0;
  padding: 0;
  position: absolute;
  z-index: -40;
  /* z-index required on body and here to put psuedo class behind main class */
  animation: sunsetting 10s linear;
  animation-play-state: running;
  animation-iteration-count: 1;
  animation-fill-mode: both;
  /* colors */
  --sun: #fae7b6;
  --sunset: radial-gradient(ellipse, var(--sun) 30vh, transparent 10.5vh) 40vh
    15vh / 60vh 60vh no-repeat;
  background: var(--sunset);
}

div.dry:before {
  width: 100vw;
  height: 100vh;
  margin: 0;
  padding: 0;
  position: absolute;
  z-index: -40;
  background-color: #181715;
  /* z-index required on body and here to put psuedo class behind main class */

  animation: sunsetting 10s linear;
  animation-play-state: running;
  animation-iteration-count: 1;
  animation-fill-mode: both;

  /* colors */
  --sun: #fae7b6;

  --sunset: radial-gradient(ellipse, var(--sun) 30vh, transparent 10.5vh) 40vh
    15vh / 60vh 60vh no-repeat;

  background: var(--sunset);
}

div.dry:after {
  width: 100vw;
  height: 300vh;
  margin: 0;
  padding: 0;
  display: block;
  position: absolute;
  bottom: 0;
  left: 0;
  z-index: -80;
  background: linear-gradient(
    180.01deg,
    #3f1150 30.21%,
    #ae6738 70.31%,
    #dacc99 99.99%
  );
  animation: skysetting 20s linear;
  animation-play-state: running;
  animation-iteration-count: 1;
  animation-fill-mode: both;
}

@keyframes skysetting {
  100% {
    transform: translateY(200vh);
  }
}

@keyframes sunsetting {
  100% {
    transform: translateY(55vh);
  }
}

@keyframes darken-sky {
  0% {
    opacity: 0;
  }
  70% {
    opacity: 0.95;
  }
  100% {
    opacity: 0.9;
  }
}

@keyframes darken-land {
  0% {
    filter: brightness(1);
  }
  50% {
    filter: brightness(0.5);
  }
  70% {
    filter: brightness(0.3);
  }
  100% {
    filter: brightness(0.2);
  }
}
