package b5;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import jc.i;
import pc.f;
import pc.g;
import s4.h;
import v9.t;
import x1.z;
import y4.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1398a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1401d;
    public final Object e;

    public a(EditText editText, v1.d dVar) {
        this.f1399b = editText;
        String[] strArr = new String[7];
        for (int i = 0; i <= 6; i++) {
            strArr[i] = TextUtils.join("", Collections.nCopies(i, "-"));
        }
        this.f1401d = strArr;
        this.f1400c = dVar;
        this.e = "-";
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        String lowerCase;
        switch (this.f1398a) {
            case 0:
                break;
            default:
                List<n3.c> list = (List) this.f1400c;
                String lowerCase2 = g.B0(String.valueOf(editable)).toString().toLowerCase(Locale.ROOT);
                i.d(lowerCase2, "toLowerCase(...)");
                ArrayList arrayList = (ArrayList) this.f1399b;
                arrayList.clear();
                if (lowerCase2.length() == 0) {
                    arrayList.addAll(list);
                } else {
                    for (n3.c cVar : list) {
                        if (lowerCase2.length() != 0) {
                            int i = cVar.f7246a;
                            if (i == 1) {
                                str = ProxyConfig.MATCH_HTTPS;
                            } else if (i != 2) {
                                str = i != 3 ? ProxyConfig.MATCH_HTTP : "socks4";
                            } else {
                                str = "socks5";
                            }
                            if (!g.f0(cVar.f7247b, lowerCase2, false) && (((str2 = cVar.f7251g) == null || !g.f0(str2, lowerCase2, false)) && !g.f0(String.valueOf(cVar.f7248c), lowerCase2, false) && !g.f0(str, lowerCase2, false))) {
                                String str3 = cVar.f7250f;
                                if (str3 == null) {
                                    str3 = cVar.h;
                                }
                                if (str3 != null) {
                                    lowerCase = str3.toLowerCase(Locale.ROOT);
                                    i.d(lowerCase, "toLowerCase(...)");
                                } else {
                                    lowerCase = null;
                                }
                                if (!i.a(lowerCase, lowerCase2)) {
                                    f fVar = n3.d.f7253a;
                                    String lowerCase3 = n3.d.e(cVar.f7250f).toLowerCase(Locale.ROOT);
                                    i.d(lowerCase3, "toLowerCase(...)");
                                    if (g.f0(lowerCase3, lowerCase2, false)) {
                                    }
                                }
                            }
                        }
                        arrayList.add(cVar);
                    }
                }
                ((TextView) this.f1401d).setVisibility(arrayList.isEmpty() ? 0 : 8);
                z adapter = ((RecyclerView) this.e).getAdapter();
                if (adapter != null) {
                    adapter.c();
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        int i12 = this.f1398a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        switch (this.f1398a) {
            case 0:
                v1.d dVar = (v1.d) this.f1400c;
                String strReplaceAll = charSequence.toString().replaceAll(" ", "").replaceAll((String) this.e, "");
                int iMin = Math.min(strReplaceAll.length(), 6);
                String strSubstring = strReplaceAll.substring(0, iMin);
                EditText editText = (EditText) this.f1399b;
                editText.removeTextChangedListener(this);
                editText.setText(strSubstring + ((String[]) this.f1401d)[6 - iMin]);
                editText.setSelection(iMin);
                editText.addTextChangedListener(this);
                if (iMin == 6 && dVar != null) {
                    y4.g gVar = (y4.g) dVar.f9128a;
                    y4.d dVar2 = gVar.f10575i0;
                    dVar2.f(h.c(new e(gVar.f10576j0, new t(dVar2.f10566j, gVar.f10580o0.getUnspacedText().toString(), null, null, true), false)));
                    break;
                }
                break;
        }
    }

    public a(ArrayList arrayList, List list, TextView textView, RecyclerView recyclerView) {
        this.f1399b = arrayList;
        this.f1400c = list;
        this.f1401d = textView;
        this.e = recyclerView;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i, int i10, int i11, CharSequence charSequence) {
    }
}
