package h3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b3 implements q3.m, q3.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c3 f4635b;

    public /* synthetic */ b3(c3 c3Var, int i) {
        this.f4634a = i;
        this.f4635b = c3Var;
    }

    @Override // q3.l
    public void c(q3.n nVar) {
        ProgressBar progressBar;
        switch (this.f4634a) {
            case 1:
                this.f4635b.c0(nVar);
                break;
            default:
                c3 c3Var = this.f4635b;
                View view = c3Var.P;
                if (view != null && (progressBar = (ProgressBar) view.findViewById(R.id.progressBarInbox)) != null) {
                    progressBar.setVisibility(4);
                }
                c3Var.c0(nVar);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    @Override // q3.m
    public void e(Object obj) throws Throwable {
        String strOptString;
        String strOptString2;
        Throwable th;
        n nVar;
        TextView textView;
        RecyclerView recyclerView;
        n nVar2;
        switch (this.f4634a) {
            case 0:
                String str = (String) obj;
                c3 c3Var = this.f4635b;
                androidx.fragment.app.w wVarG = c3Var.g();
                if (wVarG == null) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString3 = jSONObject.optString("from", "");
                    String strOptString4 = jSONObject.optString("subject", "");
                    String strOptString5 = jSONObject.optString("date", "");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("content");
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = jSONObject.optJSONObject("body");
                    }
                    if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("html", "")) == null) {
                        strOptString = jSONObject.optString("html", "");
                    }
                    if (jSONObjectOptJSONObject == null || (strOptString2 = jSONObjectOptJSONObject.optString("text", "")) == null) {
                        strOptString2 = jSONObject.optString("text", "");
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("<p><strong>De:</strong> " + strOptString3 + "</p>");
                    sb2.append("<p><strong>Asunto:</strong> " + strOptString4 + "</p>");
                    sb2.append("<p><strong>Fecha:</strong> " + strOptString5 + "</p>");
                    sb2.append("<p><strong>Cuerpo:</strong></p>");
                    jc.i.b(strOptString);
                    if (strOptString.length() <= 0) {
                        strOptString = strOptString2;
                    }
                    sb2.append(strOptString);
                    String string = sb2.toString();
                    jc.i.d(string, "toString(...)");
                    Bundle bundle = new Bundle();
                    bundle.putString("messageContent", string);
                    x1 x1Var = new x1();
                    x1Var.Y(bundle);
                    androidx.fragment.app.i0 i0VarP = wVarG.p();
                    i0VarP.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0VarP);
                    aVar.k(android.R.id.content, x1Var, null);
                    aVar.c();
                    aVar.e(false);
                    return;
                } catch (Exception e) {
                    Log.e("TempMailInbox", "Parse mensaje error: " + e.getMessage());
                    Context contextR = c3Var.r();
                    if (contextR == null) {
                        return;
                    }
                    Toast.makeText(contextR, contextR.getString(R.string.error_get_message), 0).show();
                    return;
                }
            default:
                String str2 = (String) obj;
                c3 c3Var2 = this.f4635b;
                View view = c3Var2.P;
                if (view == null) {
                    return;
                }
                ((ProgressBar) view.findViewById(R.id.progressBarInbox)).setVisibility(4);
                n nVar3 = c3Var2.f4650f0;
                if (nVar3 == null) {
                    jc.i.i("mailAdapter");
                    throw null;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(str2).optJSONArray("messages");
                    if (jSONArrayOptJSONArray == null) {
                        jSONArrayOptJSONArray = new JSONArray();
                    }
                    int length = jSONArrayOptJSONArray.length();
                    int i = 0;
                    while (i < length) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        String strOptString6 = jSONObject2.optString("id", "");
                        jc.i.d(strOptString6, "optString(...)");
                        th = null;
                        try {
                            String strOptString7 = jSONObject2.optString("from", "");
                            jc.i.d(strOptString7, "optString(...)");
                            String strOptString8 = jSONObject2.optString("subject", "");
                            jc.i.d(strOptString8, "optString(...)");
                            JSONArray jSONArray = jSONArrayOptJSONArray;
                            String strOptString9 = jSONObject2.optString("date", "");
                            jc.i.d(strOptString9, "optString(...)");
                            arrayList.add(new f1(strOptString6, strOptString7, strOptString8, strOptString9));
                            i++;
                            jSONArrayOptJSONArray = jSONArray;
                        } catch (Exception e4) {
                            e = e4;
                            Log.e("TempMailInbox", "Parse bandeja error: " + e.getMessage());
                            nVar3.e = vb.i.i0(arrayList, new b0.h(6));
                            nVar = c3Var2.f4650f0;
                            if (nVar != null) {
                                jc.i.i("mailAdapter");
                                throw th;
                            }
                            nVar.c();
                            textView = (TextView) view.findViewById(R.id.textInboxEmpty);
                            recyclerView = (RecyclerView) view.findViewById(R.id.recyclerInboxMessages);
                            nVar2 = c3Var2.f4650f0;
                            if (nVar2 != null) {
                                jc.i.i("mailAdapter");
                                throw th;
                            }
                            if (nVar2.e.isEmpty()) {
                                textView.setVisibility(0);
                                recyclerView.setVisibility(8);
                                return;
                            } else {
                                textView.setVisibility(8);
                                recyclerView.setVisibility(0);
                                return;
                            }
                        }
                    }
                    th = null;
                } catch (Exception e10) {
                    e = e10;
                    th = null;
                }
                nVar3.e = vb.i.i0(arrayList, new b0.h(6));
                nVar = c3Var2.f4650f0;
                if (nVar != null) {
                    jc.i.i("mailAdapter");
                    throw th;
                }
                nVar.c();
                textView = (TextView) view.findViewById(R.id.textInboxEmpty);
                recyclerView = (RecyclerView) view.findViewById(R.id.recyclerInboxMessages);
                nVar2 = c3Var2.f4650f0;
                if (nVar2 != null) {
                    jc.i.i("mailAdapter");
                    throw th;
                }
                if (nVar2.e.isEmpty()) {
                    textView.setVisibility(0);
                    recyclerView.setVisibility(8);
                    return;
                } else {
                    textView.setVisibility(8);
                    recyclerView.setVisibility(0);
                    return;
                }
        }
    }
}
