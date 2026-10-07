package com.firebase.ui.auth.ui.phone;

import a5.d;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import app.namso_gen.spacehowen.R;
import com.google.android.material.textfield.TextInputEditText;
import g9.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l.c2;
import s4.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class CountryListSpinner extends TextInputEditText implements View.OnClickListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayAdapter f1941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View.OnClickListener f1942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f1943v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c2 f1944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashSet f1945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashSet f1946y;

    public CountryListSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1945x = new HashSet();
        this.f1946y = new HashSet();
        super.setOnClickListener(this);
        this.f1941t = new ArrayAdapter(getContext(), R.layout.fui_dgts_country_row, android.R.id.text1);
        c2 c2Var = new c2(context, null, R.attr.listPopupWindowStyle, 0);
        this.f1944w = c2Var;
        c2Var.J = true;
        c2Var.K.setFocusable(true);
        setInputType(0);
        c2Var.A = new u(this, 3);
    }

    public static HashSet b(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            String str2 = d.f192a;
            if (!str.startsWith("+") || d.c(str) == null) {
                hashSet.add(str);
            } else {
                hashSet.addAll((!str.startsWith("+") || d.c(str) == null) ? null : (List) d.f195d.get(Integer.parseInt(str.substring(1))));
            }
        }
        return hashSet;
    }

    private void setDefaultCountryForSpinner(List<a> list) {
        a aVarD = d.d(getContext());
        if (d(aVarD.f8390b.getCountry())) {
            e(aVarD.f8391c, aVarD.f8390b);
        } else if (list.iterator().hasNext()) {
            a next = list.iterator().next();
            e(next.f8391c, next.f8390b);
        }
    }

    public final void c(Bundle bundle, View view) {
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowlisted_countries");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("blocklisted_countries");
            if (stringArrayList != null) {
                this.f1945x = b(stringArrayList);
            }
            if (stringArrayList2 != null) {
                this.f1946y = b(stringArrayList2);
            }
            if (d.e == null) {
                d.f();
            }
            Map map = d.e;
            if (this.f1945x.isEmpty() && this.f1946y.isEmpty()) {
                this.f1945x = new HashSet(map.keySet());
            }
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            if (this.f1946y.isEmpty()) {
                hashSet.addAll(map.keySet());
                hashSet.removeAll(this.f1945x);
            } else {
                hashSet.addAll(this.f1946y);
            }
            for (String str : map.keySet()) {
                if (!hashSet.contains(str)) {
                    arrayList.add(new a(((Integer) map.get(str)).intValue(), new Locale("", str)));
                }
            }
            Collections.sort(arrayList);
            setCountriesToDisplay(arrayList);
            setDefaultCountryForSpinner(arrayList);
            c2 c2Var = this.f1944w;
            c2Var.f6255z = view;
            c2Var.p(this.f1941t);
        }
    }

    public final boolean d(String str) {
        String upperCase = str.toUpperCase(Locale.getDefault());
        boolean zContains = !this.f1945x.isEmpty() ? this.f1945x.contains(upperCase) : true;
        if (this.f1946y.isEmpty()) {
            return zContains;
        }
        return zContains && !this.f1946y.contains(upperCase);
    }

    public final void e(int i, Locale locale) {
        a aVar = new a(i, locale);
        this.f1943v = aVar;
        setText(a.a(aVar.f8390b) + " +" + aVar.f8391c);
    }

    public a getSelectedCountryInfo() {
        return this.f1943v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        View.OnClickListener onClickListener = this.f1942u;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager2 != null) {
            inputMethodManager2.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        this.f1944w.h();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i, Rect rect) {
        super.onFocusChanged(z4, i, rect);
        c2 c2Var = this.f1944w;
        if (!z4) {
            c2Var.dismiss();
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        c2Var.h();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("KEY_SUPER_STATE");
        this.f1943v = (a) bundle.getParcelable("KEY_COUNTRY_INFO");
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_SUPER_STATE", parcelableOnSaveInstanceState);
        bundle.putParcelable("KEY_COUNTRY_INFO", this.f1943v);
        return bundle;
    }

    public void setCountriesToDisplay(List<a> list) {
        ArrayAdapter arrayAdapter = this.f1941t;
        arrayAdapter.addAll(list);
        arrayAdapter.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1942u = onClickListener;
    }
}
