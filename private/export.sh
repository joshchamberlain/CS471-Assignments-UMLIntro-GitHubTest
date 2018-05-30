#!/bin/sh
python3 git-exporter/main.py -v -c exporter.ini || echo "Export failed">&2
