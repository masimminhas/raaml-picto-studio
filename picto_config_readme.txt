# ============================================================
# PICTO SETUP GUIDE FOR AEB RAAML MODELS
# Place each .picto file next to its corresponding .xmi file
# ============================================================

# FILE: aeb_fmea.xmi.picto  (rename to aeb_fmea.picto)
format: html
transformation: fmea_table.egx
standalone: true

---

# FILE: aeb_hara.xmi.picto
format: html
transformation: hara_table.egx
standalone: true

---

# FILE: aeb_fta.xmi.picto
format: graphviz-dot
transformation: fta_tree.egx
standalone: true

---

# FILE: aeb_requirements.xmi.picto
format: html
transformation: req_hierarchy.egx
standalone: true
