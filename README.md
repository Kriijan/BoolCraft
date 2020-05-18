# BoolCraft

This is a simplified logic mod for minecraft.

## Depedencies 

Forge AP

## How to use the mod?

- download the latest release
- put the jar file into the mod directory
    * Windows : %appdata%\.minecraft\mods
    * Mac OS X : ~/Library/Application Support/minecraft/mods
    * Linux : ~/.minecraft/mods
- launch Minecraft

## How to compile the source code?

- install java jdk and gradle

### Windows 
- Select the directory in which the mod will be build (in our case, C:\Users\XXXX)
- open a powershell terminal
- make the directory and go into it
```

mkdir "~/BoolCraftLocal"
cd "~/BoolCraftLocal"
```
- clone this repository
```
git clone https://github.com/Kriijan/BoolCraft.git
```
- build the mod
```
cd BoolCraft\BoolCraft
./gradlew
```

Gradle should download the dependencies and compile the mod.
- If the process return BUILD SUCCESSFUL, the mod is now in the directory C:\User\XXXX\BoolCraftLocal\BoolCraft\BoolCraft\build\libs
You can place the jar (BoolCraf-1.15.2-XXXX.jar) in your Minecraft directory.
- If you wish you can now delete the entier repertory C:\User\XXXX\BoolCraftLocal


### linux 
- Select the directory in which the mod will be build (in our case, ~/BoolCraftLocal)
- open a terminal
- make the directory and go into it
```
mkdir ~/BoolCraftLocal
cd ~/BoolCraftLocal
```
- clone this repository
```
git clone https://github.com/Kriijan/BoolCraft.git
```
- build the mod
```
cd BoolCraft/BoolCraft
sh ./gradlew build
```

Gradle should download the dependencies and compile the mod.
- If the process return BUILD SUCCESSFUL, the mod is now in the directory ~/BoolCraft/BoolCraft/HelloWorld/build/libs
You can place the jar (BoolCraf-1.15.2-XXXX.jar) in your Minecraft directory.
- If you wish you can now delete the entier repertory ~/BoolCraft
