all_ymls=($(find . -name '*.yml'))

for yml in "${all_ymls[@]}"; do
    if ! action-validator "$yml"; then
        echo "Validation failed for $yml"
        exit 1
    else
        echo "Validation passed for $yml"
    fi
done
