package h3;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import app.namso_gen.spacehowen.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Spinner f4910f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public EditText f4911g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Button f4912h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ProgressBar f4913i0;
    public JSONObject k0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final String f4914j0 = "https://raw.githubusercontent.com/spacehowen/world-data-json/refs/heads/main/world_data.json";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final LinkedHashMap f4915l0 = new LinkedHashMap();

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_generate_data, viewGroup, false);
        this.f4910f0 = (Spinner) viewInflate.findViewById(R.id.countrySpinner);
        this.f4911g0 = (EditText) viewInflate.findViewById(R.id.resultTextView);
        this.f4912h0 = (Button) viewInflate.findViewById(R.id.generateButton);
        this.f4913i0 = (ProgressBar) viewInflate.findViewById(R.id.progressBar);
        try {
            b0();
            Button button = this.f4912h0;
            if (button != null) {
                button.setOnClickListener(new com.google.android.material.datepicker.n(this, 6));
                return viewInflate;
            }
            jc.i.i("generateButton");
            throw null;
        } catch (Exception e) {
            Log.e("GenerateDataFragment", "Error en la inicialización del fragmento: " + e.getMessage());
            return viewInflate;
        }
    }

    public final void b0() {
        try {
            ProgressBar progressBar = this.f4913i0;
            if (progressBar == null) {
                jc.i.i("progressBar");
                throw null;
            }
            progressBar.setVisibility(0);
            EditText editText = this.f4911g0;
            if (editText == null) {
                jc.i.i("resultTextView");
                throw null;
            }
            editText.setVisibility(8);
            com.bumptech.glide.d.v(U()).a(new r3.e(0, this.f4914j0, null, new y(this), new y(this)));
        } catch (Exception e) {
            ProgressBar progressBar2 = this.f4913i0;
            if (progressBar2 == null) {
                jc.i.i("progressBar");
                throw null;
            }
            progressBar2.setVisibility(8);
            Log.e("GenerateDataFragment", "Error inesperado al cargar JSON: " + e.getMessage());
        }
    }

    public final void c0() {
        try {
            JSONObject jSONObject = this.k0;
            if (jSONObject == null) {
                throw new IllegalStateException("Datos del país no disponibles");
            }
            Iterator<String> itKeys = jSONObject.keys();
            jc.i.d(itKeys, "keys(...)");
            ArrayAdapter arrayAdapter = new ArrayAdapter(U(), android.R.layout.simple_spinner_item, oc.g.U(oc.g.S(itKeys)));
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            Spinner spinner = this.f4910f0;
            if (spinner != null) {
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            } else {
                jc.i.i("countrySpinner");
                throw null;
            }
        } catch (Exception e) {
            Log.e("GenerateDataFragment", "Error al poblar el Spinner: " + e.getMessage());
        }
    }

    public final void d0(String str) {
        LinkedHashMap linkedHashMap = this.f4915l0;
        try {
            if (this.k0 == null) {
                throw new IllegalStateException("Datos no cargados aún.");
            }
            ProgressBar progressBar = this.f4913i0;
            if (progressBar == null) {
                jc.i.i("progressBar");
                throw null;
            }
            progressBar.setVisibility(0);
            EditText editText = this.f4911g0;
            if (editText == null) {
                jc.i.i("resultTextView");
                throw null;
            }
            editText.setVisibility(8);
            JSONObject jSONObject = this.k0;
            JSONArray jSONArrayOptJSONArray = jSONObject != null ? jSONObject.optJSONArray(str) : null;
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = 0;
                    linkedHashMap.put(str, obj);
                }
                int iIntValue = ((Number) obj).intValue();
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(iIntValue);
                String strW = pc.h.W("\n                " + w(R.string.data_country, jSONObject2.optString("pais", "N/A")) + "\n                " + w(R.string.data_state, jSONObject2.optString("estado", "N/A")) + "\n                " + w(R.string.data_city, jSONObject2.optString("ciudad", "N/A")) + "\n                " + w(R.string.data_address, jSONObject2.optString("direccion", "N/A")) + "\n                " + w(R.string.data_zip, jSONObject2.optString("codigo_postal", "N/A")) + "\n                " + w(R.string.data_phone, jSONObject2.optString("telefono", "N/A")) + "\n            ");
                linkedHashMap.put(str, Integer.valueOf((iIntValue + 1) % jSONArrayOptJSONArray.length()));
                EditText editText2 = this.f4911g0;
                if (editText2 == null) {
                    jc.i.i("resultTextView");
                    throw null;
                }
                editText2.setText(strW);
                EditText editText3 = this.f4911g0;
                if (editText3 == null) {
                    jc.i.i("resultTextView");
                    throw null;
                }
                editText3.setVisibility(0);
                ProgressBar progressBar2 = this.f4913i0;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                } else {
                    jc.i.i("progressBar");
                    throw null;
                }
            }
            EditText editText4 = this.f4911g0;
            if (editText4 == null) {
                jc.i.i("resultTextView");
                throw null;
            }
            editText4.setText(w(R.string.error_no_data_country, str));
            EditText editText5 = this.f4911g0;
            if (editText5 == null) {
                jc.i.i("resultTextView");
                throw null;
            }
            editText5.setVisibility(0);
            ProgressBar progressBar3 = this.f4913i0;
            if (progressBar3 != null) {
                progressBar3.setVisibility(8);
            } else {
                jc.i.i("progressBar");
                throw null;
            }
        } catch (Exception e) {
            ProgressBar progressBar4 = this.f4913i0;
            if (progressBar4 == null) {
                jc.i.i("progressBar");
                throw null;
            }
            progressBar4.setVisibility(8);
            Log.e("GenerateDataFragment", "Error al mostrar datos de ubicación: " + e.getMessage());
        }
    }
}
