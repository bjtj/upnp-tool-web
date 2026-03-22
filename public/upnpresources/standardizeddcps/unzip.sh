#!/usr/bin/env bash

find . -name "*.zip" -type f | while read zipfile; do
    dir=$(dirname "$zipfile")
    echo "uncompressing: $zipfile -> $dir"
    unzip -o -q "$zipfile" -d "$dir"
    rm "$zipfile"
done

echo "DONE."
