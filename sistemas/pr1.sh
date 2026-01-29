#!/bin/bash

clear
echo "--- Menu de Examen ---"
echo "1) ¿Quien soy y dónde estoy?"
echo "2) Comprobar si existe ruta o archivo"
echo "3) Crear carpeta si no existe"
echo "4) Mostrar X líneas de un archivo"
echo "5) Borrar un directorio"
echo "6) Buscar la palabra linea dentro de un archivo dado"
read opcion

case $opcion in
    1)
        echo "Usuario actual: $(whoami)"
        echo "Directorio actual: $(pwd)"
        ;;
    2)
        read -p "Introduce la ruta o archivo: " ruta
        if [ -e "$ruta" ]; then
            echo "El archivo o ruta '$ruta' existe."
        else
            echo "No se encontró nada en esa ubicación."
        fi
        ;;
    3)
        read -p "Nombre de la carpeta a crear: " carpeta
        if [ -d "$carpeta" ]; then
            echo "La carpeta ya existe."
        else
            mkdir "$carpeta"
            echo "Carpeta '$carpeta' creada con éxito."
        fi
        ;;
    4)
        read -p "Ruta del archivo: " archivo
        read -p "¿Cuántas líneas quieres ver?: " lineas
        if [ -f "$archivo" ]; then
            head -n "$lineas" "$archivo"
        else
            echo "El archivo no existe."
        fi
        ;;
    5)
        read -p "Ruta del directorio a borrar" directorio
        if [ -d "$directorio"]; then
            rm -rf "$directorio"
        else
            echo "El directorio no existe"
        fi
        ;;
    6)
        read -p "Archivo donde buscar la palabra linea" linea
        if [ -f "$linea"]; then
            grep "linea" "$linea"
        else
            echo "El archivo no existe."
        fi
        ;;
    *)
        echo "Opción invalida"
        ;;
    0)
        echo "Cerrando Programa..."
        sleep 2
        ;;
    
esac