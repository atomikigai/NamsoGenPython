package h3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import app.namso_gen.spacehowen.CheckerHistoryActivity;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends androidx.fragment.app.s implements o3.n {
    public String A0;
    public final d1.d B0;
    public final Set C0;
    public Object D0;
    public final androidx.fragment.app.o E0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public EditText f4666f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public EditText f4667g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f4668h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public MaterialButton f4669i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Chip f4670j0;
    public ProgressBar k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Chip f4671l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Button f4672m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Button f4673n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Button f4674o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f4675p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f4676q0 = "GRATIS";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f4677r0 = new ArrayList();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public o3.b f4678s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f4679t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public FirebaseAuth f4680u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final long f4681v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final long f4682w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final String f4683x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final String f4684y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final HashMap f4685z0;

    public e1() {
        new LinkedHashMap();
        this.f4679t0 = "coins_100";
        this.f4681v0 = 1800000L;
        this.f4682w0 = 86400000L;
        this.f4683x0 = "GRATIS";
        this.f4684y0 = "https://api.spacehowen.com/cards-checker";
        this.f4685z0 = new HashMap();
        this.B0 = android.support.v4.media.session.a.l("coin_balance");
        this.C0 = Collections.synchronizedSet(new HashSet());
        this.D0 = vb.q.f9297a;
        this.E0 = (androidx.fragment.app.o) S(new h0(this), new androidx.fragment.app.e0(5));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0124  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x013f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00be, please report this as an issue */
    public static final Object b0(e1 e1Var, Purchase purchase, ac.c cVar) throws JSONException {
        x0 x0Var;
        Integer num;
        int iIntValue;
        Purchase purchase2;
        Integer num2;
        androidx.fragment.app.w wVarG;
        MainActivity mainActivity;
        String strC;
        i6.e eVar;
        o3.b bVar;
        Set set = e1Var.C0;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i = x0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                x0Var.e = i - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(e1Var, cVar);
            }
        } else {
            x0Var = new x0(e1Var, cVar);
        }
        x0 x0Var2 = x0Var;
        Object objJ0 = x0Var2.f4892c;
        Object obj = zb.a.f11555a;
        int i10 = x0Var2.e;
        if (i10 == 0) {
            r7.g.G(objJ0);
            x0Var2.f4890a = purchase;
            x0Var2.e = 1;
            objJ0 = e1Var.j0(x0Var2);
            if (objJ0 != obj) {
            }
            return obj;
        }
        if (i10 == 1) {
            purchase = x0Var2.f4890a;
            r7.g.G(objJ0);
        } else {
            if (i10 == 2) {
                purchase = x0Var2.f4890a;
                r7.g.G(objJ0);
                num = (Integer) objJ0;
                if (num == null) {
                    set.remove(purchase.c());
                }
                if (num == null) {
                    Log.e("Coins", "No se acreditó la compra en el server; se deja pendiente. Token: " + purchase.c());
                    try {
                        Toast.makeText(e1Var.U(), e1Var.v(R.string.purchase_pending_verification), 1).show();
                    } catch (Exception unused) {
                    }
                    return null;
                }
                iIntValue = num.intValue();
                x0Var2.f4890a = purchase;
                x0Var2.f4891b = num;
                x0Var2.e = 3;
                if (e1Var.l0(iIntValue, x0Var2) != obj) {
                    purchase2 = purchase;
                    num2 = num;
                }
                return obj;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num2 = x0Var2.f4891b;
            purchase2 = x0Var2.f4890a;
            r7.g.G(objJ0);
        }
        e1Var.u0();
        wVarG = e1Var.g();
        if (wVarG instanceof MainActivity) {
            mainActivity = (MainActivity) wVarG;
        } else {
            mainActivity = null;
        }
        if (mainActivity != null) {
            mainActivity.x();
        }
        Log.d("Coins", "Compra acreditada en server. Saldo: " + num2);
        strC = purchase2.c();
        if (strC != null) {
            throw new IllegalArgumentException("Purchase token must be set");
        }
        eVar = new i6.e(1);
        eVar.f5226b = strC;
        bVar = e1Var.f4678s0;
        if (bVar != null) {
            bVar.u(eVar, new h0(e1Var));
            return num2;
        }
        jc.i.i("billingClient");
        throw null;
        String str = (String) objJ0;
        StringBuilder sb2 = new StringBuilder("acreditarYConsumir: token=");
        sb2.append(purchase.c());
        sb2.append(" idToken=");
        sb2.append(str != null);
        Log.d("Coins", sb2.toString());
        if (!set.add(purchase.c())) {
            Log.d("Coins", "Token ya procesado esta sesión; se omite credit duplicado");
            return null;
        }
        k3.e eVar2 = k3.e.f5930a;
        String strC2 = purchase.c();
        jc.i.d(strC2, "getPurchaseToken(...)");
        int iOptInt = purchase.f1835c.optInt("quantity", 1);
        x0Var2.f4890a = purchase;
        x0Var2.e = 2;
        objJ0 = eVar2.a(str, strC2, "coins_100", iOptInt, x0Var2);
        if (objJ0 != obj) {
            num = (Integer) objJ0;
            if (num == null) {
                set.remove(purchase.c());
            }
            if (num == null) {
                Log.e("Coins", "No se acreditó la compra en el server; se deja pendiente. Token: " + purchase.c());
                Toast.makeText(e1Var.U(), e1Var.v(R.string.purchase_pending_verification), 1).show();
                return null;
            }
            iIntValue = num.intValue();
            x0Var2.f4890a = purchase;
            x0Var2.f4891b = num;
            x0Var2.e = 3;
            if (e1Var.l0(iIntValue, x0Var2) != obj) {
                purchase2 = purchase;
                num2 = num;
                e1Var.u0();
                wVarG = e1Var.g();
                if (wVarG instanceof MainActivity) {
                    mainActivity = (MainActivity) wVarG;
                } else {
                    mainActivity = null;
                }
                if (mainActivity != null) {
                    mainActivity.x();
                }
                Log.d("Coins", "Compra acreditada en server. Saldo: " + num2);
                strC = purchase2.c();
                if (strC != null) {
                    throw new IllegalArgumentException("Purchase token must be set");
                }
                eVar = new i6.e(1);
                eVar.f5226b = strC;
                bVar = e1Var.f4678s0;
                if (bVar != null) {
                    bVar.u(eVar, new h0(e1Var));
                    return num2;
                }
                jc.i.i("billingClient");
                throw null;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        if (r9 == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c0(h3.e1 r8, ac.c r9) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.e1.c0(h3.e1, ac.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0147  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:83:0x016c  */
    /* JADX WARN: Code duplicated, block: B:88:0x017b  */
    public static String h0(String str, boolean z4, boolean z10, Integer num) {
        int length;
        int length2;
        String str2;
        Integer numY;
        int iIntValue;
        int iIntValue2;
        Integer numY2;
        Integer numY3;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        List listW0 = pc.g.w0(pc.g.B0(str).toString(), new String[]{"|"});
        if (listW0.size() != 4) {
            return "ERROR";
        }
        int i = 0;
        String str3 = (String) listW0.get(0);
        String str4 = (String) listW0.get(1);
        String str5 = (String) listW0.get(2);
        StringBuilder sb2 = new StringBuilder();
        int length3 = str3.length();
        for (int i10 = 0; i10 < length3; i10++) {
            char cCharAt = str3.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        if (string.length() == 15 && (pc.o.e0(string, "34", false) || pc.o.e0(string, "37", false))) {
            str2 = "AMEX";
        } else if ((string.length() == 16 && pc.o.e0(string, "4", false)) || (13 <= (length = string.length()) && length < 17 && pc.o.e0(string, "4", false))) {
            str2 = "VISA";
        } else if (string.length() == 16) {
            String strSubstring = string.substring(0, 2);
            jc.i.d(strSubstring, "substring(...)");
            Integer numY4 = pc.n.Y(strSubstring);
            if (numY4 == null || 51 > (iIntValue6 = numY4.intValue()) || iIntValue6 >= 56) {
                String strSubstring2 = string.substring(0, 4);
                jc.i.d(strSubstring2, "substring(...)");
                Integer numY5 = pc.n.Y(strSubstring2);
                if (numY5 == null || 2221 > (iIntValue5 = numY5.intValue()) || iIntValue5 >= 2721) {
                    if (string.length() != 16) {
                        length2 = string.length();
                        if (15 > length2 && length2 < 17) {
                            String strSubstring3 = string.substring(0, 4);
                            jc.i.d(strSubstring3, "substring(...)");
                            Integer numY6 = pc.n.Y(strSubstring3);
                            if (numY6 != null && 3528 <= (iIntValue2 = numY6.intValue()) && iIntValue2 < 3590) {
                                str2 = "JCB";
                            } else if (string.length() != 14) {
                                str2 = null;
                            } else {
                                if (!pc.o.e0(string, "36", false)) {
                                    String strSubstring4 = string.substring(0, 3);
                                    jc.i.d(strSubstring4, "substring(...)");
                                    numY = pc.n.Y(strSubstring4);
                                    if (numY != null) {
                                    }
                                    str2 = null;
                                }
                                str2 = "DINERS";
                            }
                        } else if (string.length() != 14) {
                            str2 = null;
                        } else {
                            if (!pc.o.e0(string, "36", false) && !pc.o.e0(string, "38", false)) {
                                String strSubstring5 = string.substring(0, 3);
                                jc.i.d(strSubstring5, "substring(...)");
                                numY = pc.n.Y(strSubstring5);
                                if (numY != null || 300 > (iIntValue = numY.intValue()) || iIntValue >= 306) {
                                    str2 = null;
                                }
                            }
                            str2 = "DINERS";
                        }
                    } else {
                        if (!pc.o.e0(string, "6011", false) && !pc.o.e0(string, "65", false)) {
                            String strSubstring6 = string.substring(0, 3);
                            jc.i.d(strSubstring6, "substring(...)");
                            numY2 = pc.n.Y(strSubstring6);
                            if (numY2 != null || 644 > (iIntValue4 = numY2.intValue()) || iIntValue4 >= 650) {
                                String strSubstring7 = string.substring(0, 6);
                                jc.i.d(strSubstring7, "substring(...)");
                                numY3 = pc.n.Y(strSubstring7);
                                if (numY3 != null || 622126 > (iIntValue3 = numY3.intValue()) || iIntValue3 >= 622926) {
                                    length2 = string.length();
                                    if (15 > length2) {
                                        if (string.length() != 14) {
                                            str2 = null;
                                        } else {
                                            if (!pc.o.e0(string, "36", false)) {
                                                String strSubstring8 = string.substring(0, 3);
                                                jc.i.d(strSubstring8, "substring(...)");
                                                numY = pc.n.Y(strSubstring8);
                                                if (numY != null) {
                                                }
                                                str2 = null;
                                            }
                                            str2 = "DINERS";
                                        }
                                    } else if (string.length() != 14) {
                                        str2 = null;
                                    } else {
                                        if (!pc.o.e0(string, "36", false)) {
                                            String strSubstring9 = string.substring(0, 3);
                                            jc.i.d(strSubstring9, "substring(...)");
                                            numY = pc.n.Y(strSubstring9);
                                            if (numY != null) {
                                            }
                                            str2 = null;
                                        }
                                        str2 = "DINERS";
                                    }
                                }
                            }
                        }
                        str2 = "DISCOVER";
                    }
                }
            }
            str2 = "MASTERCARD";
        } else if (string.length() != 16) {
            length2 = string.length();
            if (15 > length2) {
                if (string.length() != 14) {
                    str2 = null;
                } else {
                    if (!pc.o.e0(string, "36", false)) {
                        String strSubstring10 = string.substring(0, 3);
                        jc.i.d(strSubstring10, "substring(...)");
                        numY = pc.n.Y(strSubstring10);
                        if (numY != null) {
                        }
                        str2 = null;
                    }
                    str2 = "DINERS";
                }
            } else if (string.length() != 14) {
                str2 = null;
            } else {
                if (!pc.o.e0(string, "36", false)) {
                    String strSubstring11 = string.substring(0, 3);
                    jc.i.d(strSubstring11, "substring(...)");
                    numY = pc.n.Y(strSubstring11);
                    if (numY != null) {
                    }
                    str2 = null;
                }
                str2 = "DINERS";
            }
        } else {
            if (!pc.o.e0(string, "6011", false)) {
                String strSubstring12 = string.substring(0, 3);
                jc.i.d(strSubstring12, "substring(...)");
                numY2 = pc.n.Y(strSubstring12);
                if (numY2 != null) {
                    String strSubstring13 = string.substring(0, 6);
                    jc.i.d(strSubstring13, "substring(...)");
                    numY3 = pc.n.Y(strSubstring13);
                    if (numY3 != null) {
                    }
                    length2 = string.length();
                    if (15 > length2) {
                        if (string.length() != 14) {
                            str2 = null;
                        } else {
                            if (!pc.o.e0(string, "36", false)) {
                                String strSubstring14 = string.substring(0, 3);
                                jc.i.d(strSubstring14, "substring(...)");
                                numY = pc.n.Y(strSubstring14);
                                if (numY != null) {
                                }
                                str2 = null;
                            }
                            str2 = "DINERS";
                        }
                    } else if (string.length() != 14) {
                        str2 = null;
                    } else {
                        if (!pc.o.e0(string, "36", false)) {
                            String strSubstring15 = string.substring(0, 3);
                            jc.i.d(strSubstring15, "substring(...)");
                            numY = pc.n.Y(strSubstring15);
                            if (numY != null) {
                            }
                            str2 = null;
                        }
                        str2 = "DINERS";
                    }
                } else {
                    String strSubstring16 = string.substring(0, 6);
                    jc.i.d(strSubstring16, "substring(...)");
                    numY3 = pc.n.Y(strSubstring16);
                    if (numY3 != null) {
                    }
                    length2 = string.length();
                    if (15 > length2) {
                        if (string.length() != 14) {
                            str2 = null;
                        } else {
                            if (!pc.o.e0(string, "36", false)) {
                                String strSubstring17 = string.substring(0, 3);
                                jc.i.d(strSubstring17, "substring(...)");
                                numY = pc.n.Y(strSubstring17);
                                if (numY != null) {
                                }
                                str2 = null;
                            }
                            str2 = "DINERS";
                        }
                    } else if (string.length() != 14) {
                        str2 = null;
                    } else {
                        if (!pc.o.e0(string, "36", false)) {
                            String strSubstring18 = string.substring(0, 3);
                            jc.i.d(strSubstring18, "substring(...)");
                            numY = pc.n.Y(strSubstring18);
                            if (numY != null) {
                            }
                            str2 = null;
                        }
                        str2 = "DINERS";
                    }
                }
            }
            str2 = "DISCOVER";
        }
        if (str2 == null) {
            return "ERROR";
        }
        StringBuilder sb3 = new StringBuilder();
        int length4 = str3.length();
        for (int i11 = 0; i11 < length4; i11++) {
            char cCharAt2 = str3.charAt(i11);
            if (Character.isDigit(cCharAt2)) {
                sb3.append(cCharAt2);
            }
        }
        String string2 = sb3.toString();
        if (string2.length() < 13) {
            return "DIED";
        }
        boolean z11 = false;
        for (int length5 = string2.length() - 1; -1 < length5; length5--) {
            int iCharAt = string2.charAt(length5) - '0';
            if (z11 && (iCharAt = iCharAt * 2) > 9) {
                iCharAt -= 9;
            }
            i += iCharAt;
            z11 = !z11;
        }
        int iIntValue7 = 10;
        if (i % 10 != 0 || o0(str4, str5)) {
            return "DIED";
        }
        if (!z4) {
            return "ERROR";
        }
        if (!z10) {
            iIntValue7 = 5;
        } else if (num != null) {
            iIntValue7 = num.intValue();
        }
        return kc.d.f6207b.f().nextInt(100) < iIntValue7 ? "LIVE" : "DIED";
    }

    public static v0 i0(String str) {
        if (str == null || pc.g.m0(str)) {
            return null;
        }
        kc.e eVarA = jd.l.a(str.hashCode());
        int iC = eVarA.c(1, 11);
        long jE = eVarA.e(1800000L, 21600000L);
        return new v0(iC, str, jE, eVarA.e(21600000L, 172800000L) + jE);
    }

    public static boolean o0(String str, String str2) {
        Integer numY = pc.n.Y(str);
        if (numY != null) {
            int iIntValue = numY.intValue();
            Integer numY2 = pc.n.Y(str2);
            if (numY2 != null) {
                int iIntValue2 = numY2.intValue();
                Calendar calendar = Calendar.getInstance();
                int i = calendar.get(1);
                int i10 = calendar.get(2) + 1;
                if (iIntValue2 != i) {
                    if (iIntValue2 >= i) {
                        return false;
                    }
                } else if (iIntValue >= i10) {
                    return false;
                }
            }
        }
        return true;
    }

    public static t0 s0(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("brand");
            String strOptString2 = jSONObject.optString("type");
            String strOptString3 = jSONObject.optString("bank");
            String strOptString4 = jSONObject.optString("level");
            String strOptString5 = jSONObject.optString("country_name");
            String strOptString6 = jSONObject.optString("country_flag");
            jc.i.b(strOptString5);
            jc.i.b(strOptString6);
            u0 u0Var = new u0(strOptString5, strOptString6);
            jc.i.b(strOptString);
            jc.i.b(strOptString2);
            jc.i.b(strOptString3);
            jc.i.b(strOptString4);
            return new t0(strOptString, strOptString2, strOptString3, strOptString4, u0Var);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_live_died_checker, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void F() {
        this.N = true;
        this.f4675p0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.fragment.app.s
    public final void I() {
        this.N = true;
        e0();
        if (this.D0.isEmpty()) {
            n0();
        }
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        jc.i.e(view, "view");
        n0();
        this.f4680u0 = FirebaseAuth.getInstance();
        this.f4670j0 = (Chip) view.findViewById(R.id.GRATIS);
        this.f4671l0 = (Chip) view.findViewById(R.id.PREMIUM);
        EditText editText = (EditText) view.findViewById(R.id.editTextTarjetas);
        this.f4666f0 = editText;
        if (editText == null) {
            jc.i.i("etCard");
            throw null;
        }
        editText.setMaxLines(20);
        this.f4667g0 = (EditText) view.findViewById(R.id.editTextResult);
        this.f4668h0 = (TextView) view.findViewById(R.id.txtResultTitle);
        this.f4669i0 = (MaterialButton) view.findViewById(R.id.botonchecker);
        this.k0 = (ProgressBar) view.findViewById(R.id.progressBar);
        this.f4672m0 = (Button) view.findViewById(R.id.btnPurchase);
        this.f4673n0 = (Button) view.findViewById(R.id.btnSupport);
        this.f4674o0 = (Button) view.findViewById(R.id.btnHistory);
        ProgressBar progressBar = this.k0;
        if (progressBar == null) {
            jc.i.i("progressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        EditText editText2 = this.f4667g0;
        if (editText2 == null) {
            jc.i.i("etResult");
            throw null;
        }
        editText2.setVisibility(8);
        Button button = this.f4672m0;
        if (button == null) {
            jc.i.i("btnPurchase");
            throw null;
        }
        button.setVisibility(8);
        Button button2 = this.f4673n0;
        if (button2 == null) {
            jc.i.i("btnSupport");
            throw null;
        }
        button2.setVisibility(8);
        Button button3 = this.f4674o0;
        if (button3 == null) {
            jc.i.i("btnHistory");
            throw null;
        }
        final int i = 0;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: h3.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f4836b;

            {
                this.f4836b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws JSONException {
                switch (i) {
                    case 0:
                        e1 e1Var = this.f4836b;
                        e1Var.Z(new Intent(e1Var.U(), (Class<?>) CheckerHistoryActivity.class));
                        return;
                    case 1:
                        e1 e1Var2 = this.f4836b;
                        Chip chip = e1Var2.f4670j0;
                        if (chip == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        e1Var2.g0(chip);
                        Button button4 = e1Var2.f4672m0;
                        if (button4 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button4.setVisibility(8);
                        Button button5 = e1Var2.f4673n0;
                        if (button5 != null) {
                            button5.setVisibility(8);
                            return;
                        } else {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                    case 2:
                        e1 e1Var3 = this.f4836b;
                        Chip chip2 = e1Var3.f4671l0;
                        if (chip2 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        e1Var3.g0(chip2);
                        FirebaseAuth firebaseAuth = e1Var3.f4680u0;
                        if (firebaseAuth == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth.f2702f == null) {
                            e1Var3.p0();
                            return;
                        }
                        Button button6 = e1Var3.f4672m0;
                        if (button6 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button6.setVisibility(0);
                        Button button7 = e1Var3.f4673n0;
                        if (button7 == null) {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                        button7.setVisibility(0);
                        e1Var3.u0();
                        return;
                    case 3:
                        e1 e1Var4 = this.f4836b;
                        EditText editText3 = e1Var4.f4666f0;
                        Object[] objArr = 0;
                        if (editText3 == null) {
                            jc.i.i("etCard");
                            throw null;
                        }
                        String string = pc.g.B0(editText3.getText().toString()).toString();
                        if (string.length() == 0) {
                            EditText editText4 = e1Var4.f4666f0;
                            if (editText4 != null) {
                                editText4.setError(e1Var4.v(R.string.error_enter_cc));
                                return;
                            } else {
                                jc.i.i("etCard");
                                throw null;
                            }
                        }
                        Chip chip3 = e1Var4.f4670j0;
                        if (chip3 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        if (!chip3.isChecked()) {
                            Chip chip4 = e1Var4.f4671l0;
                            if (chip4 == null) {
                                jc.i.i("premiumChip");
                                throw null;
                            }
                            if (!chip4.isChecked()) {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_select_option), 0).show();
                                return;
                            }
                        }
                        Iterator it = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"}).iterator();
                        while (it.hasNext()) {
                            String strC0 = pc.o.c0(pc.g.B0((String) it.next()).toString(), " ", "|");
                            Pattern patternCompile = Pattern.compile("[^\\x00-\\x7F]");
                            jc.i.d(patternCompile, "compile(...)");
                            String strReplaceAll = patternCompile.matcher(strC0).replaceAll("");
                            jc.i.d(strReplaceAll, "replaceAll(...)");
                            if (strReplaceAll.length() != 0) {
                                Pattern patternCompile2 = Pattern.compile("^(\\d{13,16})\\|(\\d{2})\\|(\\d{4})\\|(\\d{3,4})$");
                                jc.i.d(patternCompile2, "compile(...)");
                                Matcher matcher = patternCompile2.matcher(strReplaceAll);
                                jc.i.d(matcher, "matcher(...)");
                                h6.o0 o0Var = !matcher.matches() ? null : new h6.o0(matcher, strReplaceAll);
                                if (o0Var != null) {
                                    String str = (String) ((pc.e) o0Var.h()).get(2);
                                    String str2 = (String) ((pc.e) o0Var.h()).get(3);
                                    String str3 = (String) ((pc.e) o0Var.h()).get(4);
                                    Integer numY = pc.n.Y(str);
                                    if (numY != null) {
                                        int iIntValue = numY.intValue();
                                        if (1 > iIntValue || iIntValue >= 13) {
                                            Log.d("CardValidation", "Mes inválido: ".concat(str));
                                        } else {
                                            Integer numY2 = pc.n.Y(str2);
                                            if (numY2 != null) {
                                                int iIntValue2 = numY2.intValue();
                                                if (iIntValue2 < 2000 || iIntValue2 > 2100) {
                                                    Log.d("CardValidation", "Año inválido: ".concat(str2));
                                                } else {
                                                    int length = str3.length();
                                                    if (3 > length || length >= 5) {
                                                        Log.d("CardValidation", "CVV inválido: ".concat(str3));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_invalid_card_format), 0).show();
                                return;
                            }
                        }
                        Log.d("CardValidation", "Tarjetas válidas");
                        Chip chip5 = e1Var4.f4671l0;
                        if (chip5 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        if (chip5.isChecked()) {
                            FirebaseAuth firebaseAuth2 = e1Var4.f4680u0;
                            if (firebaseAuth2 == null) {
                                jc.i.i("auth");
                                throw null;
                            }
                            if (firebaseAuth2.f2702f != null) {
                                rc.b0.q(androidx.lifecycle.i0.e(e1Var4.x()), null, new a2.g(e1Var4, string, objArr == true ? 1 : 0, 9), 3);
                                return;
                            } else {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_sign_in_premium), 0).show();
                                e1Var4.p0();
                                return;
                            }
                        }
                        List listW0 = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"});
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listW0) {
                            if (!pc.g.m0((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_no_cards), 0).show();
                        } else {
                            e1Var4.q0();
                            e1Var4.v0(arrayList, false);
                        }
                        androidx.fragment.app.w wVarT = e1Var4.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                            return;
                        }
                        return;
                    case 4:
                        e1 e1Var5 = this.f4836b;
                        FirebaseAuth firebaseAuth3 = e1Var5.f4680u0;
                        if (firebaseAuth3 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth3.f2702f == null) {
                            Toast.makeText(e1Var5.U(), e1Var5.v(R.string.error_sign_in_buy), 0).show();
                            e1Var5.p0();
                            return;
                        }
                        a5.g gVar = new a5.g();
                        gVar.f199a = e1Var5.f4679t0;
                        gVar.f200b = "inapp";
                        List listD = jd.d.D(gVar.a());
                        a5.b bVar = new a5.b(22);
                        bVar.z(listD);
                        a4.b bVarD = bVar.d();
                        o3.b bVar2 = e1Var5.f4678s0;
                        if (bVar2 != null) {
                            bVar2.x(bVarD, new h0(e1Var5));
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    default:
                        try {
                            this.f4836b.Z(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/spacehowen")));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                }
            }
        });
        Chip chip = this.f4670j0;
        if (chip == null) {
            jc.i.i("gratisChip");
            throw null;
        }
        final int i10 = 1;
        chip.setOnClickListener(new View.OnClickListener(this) { // from class: h3.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f4836b;

            {
                this.f4836b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws JSONException {
                switch (i10) {
                    case 0:
                        e1 e1Var = this.f4836b;
                        e1Var.Z(new Intent(e1Var.U(), (Class<?>) CheckerHistoryActivity.class));
                        return;
                    case 1:
                        e1 e1Var2 = this.f4836b;
                        Chip chip2 = e1Var2.f4670j0;
                        if (chip2 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        e1Var2.g0(chip2);
                        Button button4 = e1Var2.f4672m0;
                        if (button4 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button4.setVisibility(8);
                        Button button5 = e1Var2.f4673n0;
                        if (button5 != null) {
                            button5.setVisibility(8);
                            return;
                        } else {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                    case 2:
                        e1 e1Var3 = this.f4836b;
                        Chip chip3 = e1Var3.f4671l0;
                        if (chip3 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        e1Var3.g0(chip3);
                        FirebaseAuth firebaseAuth = e1Var3.f4680u0;
                        if (firebaseAuth == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth.f2702f == null) {
                            e1Var3.p0();
                            return;
                        }
                        Button button6 = e1Var3.f4672m0;
                        if (button6 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button6.setVisibility(0);
                        Button button7 = e1Var3.f4673n0;
                        if (button7 == null) {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                        button7.setVisibility(0);
                        e1Var3.u0();
                        return;
                    case 3:
                        e1 e1Var4 = this.f4836b;
                        EditText editText3 = e1Var4.f4666f0;
                        Object[] objArr = 0;
                        if (editText3 == null) {
                            jc.i.i("etCard");
                            throw null;
                        }
                        String string = pc.g.B0(editText3.getText().toString()).toString();
                        if (string.length() == 0) {
                            EditText editText4 = e1Var4.f4666f0;
                            if (editText4 != null) {
                                editText4.setError(e1Var4.v(R.string.error_enter_cc));
                                return;
                            } else {
                                jc.i.i("etCard");
                                throw null;
                            }
                        }
                        Chip chip4 = e1Var4.f4670j0;
                        if (chip4 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        if (!chip4.isChecked()) {
                            Chip chip5 = e1Var4.f4671l0;
                            if (chip5 == null) {
                                jc.i.i("premiumChip");
                                throw null;
                            }
                            if (!chip5.isChecked()) {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_select_option), 0).show();
                                return;
                            }
                        }
                        Iterator it = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"}).iterator();
                        while (it.hasNext()) {
                            String strC0 = pc.o.c0(pc.g.B0((String) it.next()).toString(), " ", "|");
                            Pattern patternCompile = Pattern.compile("[^\\x00-\\x7F]");
                            jc.i.d(patternCompile, "compile(...)");
                            String strReplaceAll = patternCompile.matcher(strC0).replaceAll("");
                            jc.i.d(strReplaceAll, "replaceAll(...)");
                            if (strReplaceAll.length() != 0) {
                                Pattern patternCompile2 = Pattern.compile("^(\\d{13,16})\\|(\\d{2})\\|(\\d{4})\\|(\\d{3,4})$");
                                jc.i.d(patternCompile2, "compile(...)");
                                Matcher matcher = patternCompile2.matcher(strReplaceAll);
                                jc.i.d(matcher, "matcher(...)");
                                h6.o0 o0Var = !matcher.matches() ? null : new h6.o0(matcher, strReplaceAll);
                                if (o0Var != null) {
                                    String str = (String) ((pc.e) o0Var.h()).get(2);
                                    String str2 = (String) ((pc.e) o0Var.h()).get(3);
                                    String str3 = (String) ((pc.e) o0Var.h()).get(4);
                                    Integer numY = pc.n.Y(str);
                                    if (numY != null) {
                                        int iIntValue = numY.intValue();
                                        if (1 > iIntValue || iIntValue >= 13) {
                                            Log.d("CardValidation", "Mes inválido: ".concat(str));
                                        } else {
                                            Integer numY2 = pc.n.Y(str2);
                                            if (numY2 != null) {
                                                int iIntValue2 = numY2.intValue();
                                                if (iIntValue2 < 2000 || iIntValue2 > 2100) {
                                                    Log.d("CardValidation", "Año inválido: ".concat(str2));
                                                } else {
                                                    int length = str3.length();
                                                    if (3 > length || length >= 5) {
                                                        Log.d("CardValidation", "CVV inválido: ".concat(str3));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_invalid_card_format), 0).show();
                                return;
                            }
                        }
                        Log.d("CardValidation", "Tarjetas válidas");
                        Chip chip6 = e1Var4.f4671l0;
                        if (chip6 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        if (chip6.isChecked()) {
                            FirebaseAuth firebaseAuth2 = e1Var4.f4680u0;
                            if (firebaseAuth2 == null) {
                                jc.i.i("auth");
                                throw null;
                            }
                            if (firebaseAuth2.f2702f != null) {
                                rc.b0.q(androidx.lifecycle.i0.e(e1Var4.x()), null, new a2.g(e1Var4, string, objArr == true ? 1 : 0, 9), 3);
                                return;
                            } else {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_sign_in_premium), 0).show();
                                e1Var4.p0();
                                return;
                            }
                        }
                        List listW0 = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"});
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listW0) {
                            if (!pc.g.m0((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_no_cards), 0).show();
                        } else {
                            e1Var4.q0();
                            e1Var4.v0(arrayList, false);
                        }
                        androidx.fragment.app.w wVarT = e1Var4.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                            return;
                        }
                        return;
                    case 4:
                        e1 e1Var5 = this.f4836b;
                        FirebaseAuth firebaseAuth3 = e1Var5.f4680u0;
                        if (firebaseAuth3 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth3.f2702f == null) {
                            Toast.makeText(e1Var5.U(), e1Var5.v(R.string.error_sign_in_buy), 0).show();
                            e1Var5.p0();
                            return;
                        }
                        a5.g gVar = new a5.g();
                        gVar.f199a = e1Var5.f4679t0;
                        gVar.f200b = "inapp";
                        List listD = jd.d.D(gVar.a());
                        a5.b bVar = new a5.b(22);
                        bVar.z(listD);
                        a4.b bVarD = bVar.d();
                        o3.b bVar2 = e1Var5.f4678s0;
                        if (bVar2 != null) {
                            bVar2.x(bVarD, new h0(e1Var5));
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    default:
                        try {
                            this.f4836b.Z(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/spacehowen")));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                }
            }
        });
        Chip chip2 = this.f4671l0;
        if (chip2 == null) {
            jc.i.i("premiumChip");
            throw null;
        }
        final int i11 = 2;
        chip2.setOnClickListener(new View.OnClickListener(this) { // from class: h3.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f4836b;

            {
                this.f4836b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws JSONException {
                switch (i11) {
                    case 0:
                        e1 e1Var = this.f4836b;
                        e1Var.Z(new Intent(e1Var.U(), (Class<?>) CheckerHistoryActivity.class));
                        return;
                    case 1:
                        e1 e1Var2 = this.f4836b;
                        Chip chip3 = e1Var2.f4670j0;
                        if (chip3 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        e1Var2.g0(chip3);
                        Button button4 = e1Var2.f4672m0;
                        if (button4 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button4.setVisibility(8);
                        Button button5 = e1Var2.f4673n0;
                        if (button5 != null) {
                            button5.setVisibility(8);
                            return;
                        } else {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                    case 2:
                        e1 e1Var3 = this.f4836b;
                        Chip chip4 = e1Var3.f4671l0;
                        if (chip4 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        e1Var3.g0(chip4);
                        FirebaseAuth firebaseAuth = e1Var3.f4680u0;
                        if (firebaseAuth == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth.f2702f == null) {
                            e1Var3.p0();
                            return;
                        }
                        Button button6 = e1Var3.f4672m0;
                        if (button6 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button6.setVisibility(0);
                        Button button7 = e1Var3.f4673n0;
                        if (button7 == null) {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                        button7.setVisibility(0);
                        e1Var3.u0();
                        return;
                    case 3:
                        e1 e1Var4 = this.f4836b;
                        EditText editText3 = e1Var4.f4666f0;
                        Object[] objArr = 0;
                        if (editText3 == null) {
                            jc.i.i("etCard");
                            throw null;
                        }
                        String string = pc.g.B0(editText3.getText().toString()).toString();
                        if (string.length() == 0) {
                            EditText editText4 = e1Var4.f4666f0;
                            if (editText4 != null) {
                                editText4.setError(e1Var4.v(R.string.error_enter_cc));
                                return;
                            } else {
                                jc.i.i("etCard");
                                throw null;
                            }
                        }
                        Chip chip5 = e1Var4.f4670j0;
                        if (chip5 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        if (!chip5.isChecked()) {
                            Chip chip6 = e1Var4.f4671l0;
                            if (chip6 == null) {
                                jc.i.i("premiumChip");
                                throw null;
                            }
                            if (!chip6.isChecked()) {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_select_option), 0).show();
                                return;
                            }
                        }
                        Iterator it = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"}).iterator();
                        while (it.hasNext()) {
                            String strC0 = pc.o.c0(pc.g.B0((String) it.next()).toString(), " ", "|");
                            Pattern patternCompile = Pattern.compile("[^\\x00-\\x7F]");
                            jc.i.d(patternCompile, "compile(...)");
                            String strReplaceAll = patternCompile.matcher(strC0).replaceAll("");
                            jc.i.d(strReplaceAll, "replaceAll(...)");
                            if (strReplaceAll.length() != 0) {
                                Pattern patternCompile2 = Pattern.compile("^(\\d{13,16})\\|(\\d{2})\\|(\\d{4})\\|(\\d{3,4})$");
                                jc.i.d(patternCompile2, "compile(...)");
                                Matcher matcher = patternCompile2.matcher(strReplaceAll);
                                jc.i.d(matcher, "matcher(...)");
                                h6.o0 o0Var = !matcher.matches() ? null : new h6.o0(matcher, strReplaceAll);
                                if (o0Var != null) {
                                    String str = (String) ((pc.e) o0Var.h()).get(2);
                                    String str2 = (String) ((pc.e) o0Var.h()).get(3);
                                    String str3 = (String) ((pc.e) o0Var.h()).get(4);
                                    Integer numY = pc.n.Y(str);
                                    if (numY != null) {
                                        int iIntValue = numY.intValue();
                                        if (1 > iIntValue || iIntValue >= 13) {
                                            Log.d("CardValidation", "Mes inválido: ".concat(str));
                                        } else {
                                            Integer numY2 = pc.n.Y(str2);
                                            if (numY2 != null) {
                                                int iIntValue2 = numY2.intValue();
                                                if (iIntValue2 < 2000 || iIntValue2 > 2100) {
                                                    Log.d("CardValidation", "Año inválido: ".concat(str2));
                                                } else {
                                                    int length = str3.length();
                                                    if (3 > length || length >= 5) {
                                                        Log.d("CardValidation", "CVV inválido: ".concat(str3));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_invalid_card_format), 0).show();
                                return;
                            }
                        }
                        Log.d("CardValidation", "Tarjetas válidas");
                        Chip chip7 = e1Var4.f4671l0;
                        if (chip7 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        if (chip7.isChecked()) {
                            FirebaseAuth firebaseAuth2 = e1Var4.f4680u0;
                            if (firebaseAuth2 == null) {
                                jc.i.i("auth");
                                throw null;
                            }
                            if (firebaseAuth2.f2702f != null) {
                                rc.b0.q(androidx.lifecycle.i0.e(e1Var4.x()), null, new a2.g(e1Var4, string, objArr == true ? 1 : 0, 9), 3);
                                return;
                            } else {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_sign_in_premium), 0).show();
                                e1Var4.p0();
                                return;
                            }
                        }
                        List listW0 = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"});
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listW0) {
                            if (!pc.g.m0((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_no_cards), 0).show();
                        } else {
                            e1Var4.q0();
                            e1Var4.v0(arrayList, false);
                        }
                        androidx.fragment.app.w wVarT = e1Var4.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                            return;
                        }
                        return;
                    case 4:
                        e1 e1Var5 = this.f4836b;
                        FirebaseAuth firebaseAuth3 = e1Var5.f4680u0;
                        if (firebaseAuth3 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth3.f2702f == null) {
                            Toast.makeText(e1Var5.U(), e1Var5.v(R.string.error_sign_in_buy), 0).show();
                            e1Var5.p0();
                            return;
                        }
                        a5.g gVar = new a5.g();
                        gVar.f199a = e1Var5.f4679t0;
                        gVar.f200b = "inapp";
                        List listD = jd.d.D(gVar.a());
                        a5.b bVar = new a5.b(22);
                        bVar.z(listD);
                        a4.b bVarD = bVar.d();
                        o3.b bVar2 = e1Var5.f4678s0;
                        if (bVar2 != null) {
                            bVar2.x(bVarD, new h0(e1Var5));
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    default:
                        try {
                            this.f4836b.Z(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/spacehowen")));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                }
            }
        });
        Chip chip3 = this.f4670j0;
        if (chip3 == null) {
            jc.i.i("gratisChip");
            throw null;
        }
        chip3.setChecked(true);
        MaterialButton materialButton = this.f4669i0;
        if (materialButton == null) {
            jc.i.i("botonChecker");
            throw null;
        }
        final int i12 = 3;
        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: h3.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f4836b;

            {
                this.f4836b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws JSONException {
                switch (i12) {
                    case 0:
                        e1 e1Var = this.f4836b;
                        e1Var.Z(new Intent(e1Var.U(), (Class<?>) CheckerHistoryActivity.class));
                        return;
                    case 1:
                        e1 e1Var2 = this.f4836b;
                        Chip chip4 = e1Var2.f4670j0;
                        if (chip4 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        e1Var2.g0(chip4);
                        Button button4 = e1Var2.f4672m0;
                        if (button4 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button4.setVisibility(8);
                        Button button5 = e1Var2.f4673n0;
                        if (button5 != null) {
                            button5.setVisibility(8);
                            return;
                        } else {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                    case 2:
                        e1 e1Var3 = this.f4836b;
                        Chip chip5 = e1Var3.f4671l0;
                        if (chip5 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        e1Var3.g0(chip5);
                        FirebaseAuth firebaseAuth = e1Var3.f4680u0;
                        if (firebaseAuth == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth.f2702f == null) {
                            e1Var3.p0();
                            return;
                        }
                        Button button6 = e1Var3.f4672m0;
                        if (button6 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button6.setVisibility(0);
                        Button button7 = e1Var3.f4673n0;
                        if (button7 == null) {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                        button7.setVisibility(0);
                        e1Var3.u0();
                        return;
                    case 3:
                        e1 e1Var4 = this.f4836b;
                        EditText editText3 = e1Var4.f4666f0;
                        Object[] objArr = 0;
                        if (editText3 == null) {
                            jc.i.i("etCard");
                            throw null;
                        }
                        String string = pc.g.B0(editText3.getText().toString()).toString();
                        if (string.length() == 0) {
                            EditText editText4 = e1Var4.f4666f0;
                            if (editText4 != null) {
                                editText4.setError(e1Var4.v(R.string.error_enter_cc));
                                return;
                            } else {
                                jc.i.i("etCard");
                                throw null;
                            }
                        }
                        Chip chip6 = e1Var4.f4670j0;
                        if (chip6 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        if (!chip6.isChecked()) {
                            Chip chip7 = e1Var4.f4671l0;
                            if (chip7 == null) {
                                jc.i.i("premiumChip");
                                throw null;
                            }
                            if (!chip7.isChecked()) {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_select_option), 0).show();
                                return;
                            }
                        }
                        Iterator it = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"}).iterator();
                        while (it.hasNext()) {
                            String strC0 = pc.o.c0(pc.g.B0((String) it.next()).toString(), " ", "|");
                            Pattern patternCompile = Pattern.compile("[^\\x00-\\x7F]");
                            jc.i.d(patternCompile, "compile(...)");
                            String strReplaceAll = patternCompile.matcher(strC0).replaceAll("");
                            jc.i.d(strReplaceAll, "replaceAll(...)");
                            if (strReplaceAll.length() != 0) {
                                Pattern patternCompile2 = Pattern.compile("^(\\d{13,16})\\|(\\d{2})\\|(\\d{4})\\|(\\d{3,4})$");
                                jc.i.d(patternCompile2, "compile(...)");
                                Matcher matcher = patternCompile2.matcher(strReplaceAll);
                                jc.i.d(matcher, "matcher(...)");
                                h6.o0 o0Var = !matcher.matches() ? null : new h6.o0(matcher, strReplaceAll);
                                if (o0Var != null) {
                                    String str = (String) ((pc.e) o0Var.h()).get(2);
                                    String str2 = (String) ((pc.e) o0Var.h()).get(3);
                                    String str3 = (String) ((pc.e) o0Var.h()).get(4);
                                    Integer numY = pc.n.Y(str);
                                    if (numY != null) {
                                        int iIntValue = numY.intValue();
                                        if (1 > iIntValue || iIntValue >= 13) {
                                            Log.d("CardValidation", "Mes inválido: ".concat(str));
                                        } else {
                                            Integer numY2 = pc.n.Y(str2);
                                            if (numY2 != null) {
                                                int iIntValue2 = numY2.intValue();
                                                if (iIntValue2 < 2000 || iIntValue2 > 2100) {
                                                    Log.d("CardValidation", "Año inválido: ".concat(str2));
                                                } else {
                                                    int length = str3.length();
                                                    if (3 > length || length >= 5) {
                                                        Log.d("CardValidation", "CVV inválido: ".concat(str3));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_invalid_card_format), 0).show();
                                return;
                            }
                        }
                        Log.d("CardValidation", "Tarjetas válidas");
                        Chip chip8 = e1Var4.f4671l0;
                        if (chip8 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        if (chip8.isChecked()) {
                            FirebaseAuth firebaseAuth2 = e1Var4.f4680u0;
                            if (firebaseAuth2 == null) {
                                jc.i.i("auth");
                                throw null;
                            }
                            if (firebaseAuth2.f2702f != null) {
                                rc.b0.q(androidx.lifecycle.i0.e(e1Var4.x()), null, new a2.g(e1Var4, string, objArr == true ? 1 : 0, 9), 3);
                                return;
                            } else {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_sign_in_premium), 0).show();
                                e1Var4.p0();
                                return;
                            }
                        }
                        List listW0 = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"});
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listW0) {
                            if (!pc.g.m0((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_no_cards), 0).show();
                        } else {
                            e1Var4.q0();
                            e1Var4.v0(arrayList, false);
                        }
                        androidx.fragment.app.w wVarT = e1Var4.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                            return;
                        }
                        return;
                    case 4:
                        e1 e1Var5 = this.f4836b;
                        FirebaseAuth firebaseAuth3 = e1Var5.f4680u0;
                        if (firebaseAuth3 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth3.f2702f == null) {
                            Toast.makeText(e1Var5.U(), e1Var5.v(R.string.error_sign_in_buy), 0).show();
                            e1Var5.p0();
                            return;
                        }
                        a5.g gVar = new a5.g();
                        gVar.f199a = e1Var5.f4679t0;
                        gVar.f200b = "inapp";
                        List listD = jd.d.D(gVar.a());
                        a5.b bVar = new a5.b(22);
                        bVar.z(listD);
                        a4.b bVarD = bVar.d();
                        o3.b bVar2 = e1Var5.f4678s0;
                        if (bVar2 != null) {
                            bVar2.x(bVarD, new h0(e1Var5));
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    default:
                        try {
                            this.f4836b.Z(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/spacehowen")));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                }
            }
        });
        Button button4 = this.f4672m0;
        if (button4 == null) {
            jc.i.i("btnPurchase");
            throw null;
        }
        final int i13 = 4;
        button4.setOnClickListener(new View.OnClickListener(this) { // from class: h3.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f4836b;

            {
                this.f4836b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws JSONException {
                switch (i13) {
                    case 0:
                        e1 e1Var = this.f4836b;
                        e1Var.Z(new Intent(e1Var.U(), (Class<?>) CheckerHistoryActivity.class));
                        return;
                    case 1:
                        e1 e1Var2 = this.f4836b;
                        Chip chip4 = e1Var2.f4670j0;
                        if (chip4 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        e1Var2.g0(chip4);
                        Button button5 = e1Var2.f4672m0;
                        if (button5 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button5.setVisibility(8);
                        Button button6 = e1Var2.f4673n0;
                        if (button6 != null) {
                            button6.setVisibility(8);
                            return;
                        } else {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                    case 2:
                        e1 e1Var3 = this.f4836b;
                        Chip chip5 = e1Var3.f4671l0;
                        if (chip5 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        e1Var3.g0(chip5);
                        FirebaseAuth firebaseAuth = e1Var3.f4680u0;
                        if (firebaseAuth == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth.f2702f == null) {
                            e1Var3.p0();
                            return;
                        }
                        Button button7 = e1Var3.f4672m0;
                        if (button7 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button7.setVisibility(0);
                        Button button8 = e1Var3.f4673n0;
                        if (button8 == null) {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                        button8.setVisibility(0);
                        e1Var3.u0();
                        return;
                    case 3:
                        e1 e1Var4 = this.f4836b;
                        EditText editText3 = e1Var4.f4666f0;
                        Object[] objArr = 0;
                        if (editText3 == null) {
                            jc.i.i("etCard");
                            throw null;
                        }
                        String string = pc.g.B0(editText3.getText().toString()).toString();
                        if (string.length() == 0) {
                            EditText editText4 = e1Var4.f4666f0;
                            if (editText4 != null) {
                                editText4.setError(e1Var4.v(R.string.error_enter_cc));
                                return;
                            } else {
                                jc.i.i("etCard");
                                throw null;
                            }
                        }
                        Chip chip6 = e1Var4.f4670j0;
                        if (chip6 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        if (!chip6.isChecked()) {
                            Chip chip7 = e1Var4.f4671l0;
                            if (chip7 == null) {
                                jc.i.i("premiumChip");
                                throw null;
                            }
                            if (!chip7.isChecked()) {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_select_option), 0).show();
                                return;
                            }
                        }
                        Iterator it = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"}).iterator();
                        while (it.hasNext()) {
                            String strC0 = pc.o.c0(pc.g.B0((String) it.next()).toString(), " ", "|");
                            Pattern patternCompile = Pattern.compile("[^\\x00-\\x7F]");
                            jc.i.d(patternCompile, "compile(...)");
                            String strReplaceAll = patternCompile.matcher(strC0).replaceAll("");
                            jc.i.d(strReplaceAll, "replaceAll(...)");
                            if (strReplaceAll.length() != 0) {
                                Pattern patternCompile2 = Pattern.compile("^(\\d{13,16})\\|(\\d{2})\\|(\\d{4})\\|(\\d{3,4})$");
                                jc.i.d(patternCompile2, "compile(...)");
                                Matcher matcher = patternCompile2.matcher(strReplaceAll);
                                jc.i.d(matcher, "matcher(...)");
                                h6.o0 o0Var = !matcher.matches() ? null : new h6.o0(matcher, strReplaceAll);
                                if (o0Var != null) {
                                    String str = (String) ((pc.e) o0Var.h()).get(2);
                                    String str2 = (String) ((pc.e) o0Var.h()).get(3);
                                    String str3 = (String) ((pc.e) o0Var.h()).get(4);
                                    Integer numY = pc.n.Y(str);
                                    if (numY != null) {
                                        int iIntValue = numY.intValue();
                                        if (1 > iIntValue || iIntValue >= 13) {
                                            Log.d("CardValidation", "Mes inválido: ".concat(str));
                                        } else {
                                            Integer numY2 = pc.n.Y(str2);
                                            if (numY2 != null) {
                                                int iIntValue2 = numY2.intValue();
                                                if (iIntValue2 < 2000 || iIntValue2 > 2100) {
                                                    Log.d("CardValidation", "Año inválido: ".concat(str2));
                                                } else {
                                                    int length = str3.length();
                                                    if (3 > length || length >= 5) {
                                                        Log.d("CardValidation", "CVV inválido: ".concat(str3));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_invalid_card_format), 0).show();
                                return;
                            }
                        }
                        Log.d("CardValidation", "Tarjetas válidas");
                        Chip chip8 = e1Var4.f4671l0;
                        if (chip8 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        if (chip8.isChecked()) {
                            FirebaseAuth firebaseAuth2 = e1Var4.f4680u0;
                            if (firebaseAuth2 == null) {
                                jc.i.i("auth");
                                throw null;
                            }
                            if (firebaseAuth2.f2702f != null) {
                                rc.b0.q(androidx.lifecycle.i0.e(e1Var4.x()), null, new a2.g(e1Var4, string, objArr == true ? 1 : 0, 9), 3);
                                return;
                            } else {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_sign_in_premium), 0).show();
                                e1Var4.p0();
                                return;
                            }
                        }
                        List listW0 = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"});
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listW0) {
                            if (!pc.g.m0((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_no_cards), 0).show();
                        } else {
                            e1Var4.q0();
                            e1Var4.v0(arrayList, false);
                        }
                        androidx.fragment.app.w wVarT = e1Var4.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                            return;
                        }
                        return;
                    case 4:
                        e1 e1Var5 = this.f4836b;
                        FirebaseAuth firebaseAuth3 = e1Var5.f4680u0;
                        if (firebaseAuth3 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth3.f2702f == null) {
                            Toast.makeText(e1Var5.U(), e1Var5.v(R.string.error_sign_in_buy), 0).show();
                            e1Var5.p0();
                            return;
                        }
                        a5.g gVar = new a5.g();
                        gVar.f199a = e1Var5.f4679t0;
                        gVar.f200b = "inapp";
                        List listD = jd.d.D(gVar.a());
                        a5.b bVar = new a5.b(22);
                        bVar.z(listD);
                        a4.b bVarD = bVar.d();
                        o3.b bVar2 = e1Var5.f4678s0;
                        if (bVar2 != null) {
                            bVar2.x(bVarD, new h0(e1Var5));
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    default:
                        try {
                            this.f4836b.Z(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/spacehowen")));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                }
            }
        });
        Button button5 = this.f4673n0;
        if (button5 == null) {
            jc.i.i("btnSupport");
            throw null;
        }
        final int i14 = 5;
        button5.setOnClickListener(new View.OnClickListener(this) { // from class: h3.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f4836b;

            {
                this.f4836b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws JSONException {
                switch (i14) {
                    case 0:
                        e1 e1Var = this.f4836b;
                        e1Var.Z(new Intent(e1Var.U(), (Class<?>) CheckerHistoryActivity.class));
                        return;
                    case 1:
                        e1 e1Var2 = this.f4836b;
                        Chip chip4 = e1Var2.f4670j0;
                        if (chip4 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        e1Var2.g0(chip4);
                        Button button6 = e1Var2.f4672m0;
                        if (button6 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button6.setVisibility(8);
                        Button button7 = e1Var2.f4673n0;
                        if (button7 != null) {
                            button7.setVisibility(8);
                            return;
                        } else {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                    case 2:
                        e1 e1Var3 = this.f4836b;
                        Chip chip5 = e1Var3.f4671l0;
                        if (chip5 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        e1Var3.g0(chip5);
                        FirebaseAuth firebaseAuth = e1Var3.f4680u0;
                        if (firebaseAuth == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth.f2702f == null) {
                            e1Var3.p0();
                            return;
                        }
                        Button button8 = e1Var3.f4672m0;
                        if (button8 == null) {
                            jc.i.i("btnPurchase");
                            throw null;
                        }
                        button8.setVisibility(0);
                        Button button9 = e1Var3.f4673n0;
                        if (button9 == null) {
                            jc.i.i("btnSupport");
                            throw null;
                        }
                        button9.setVisibility(0);
                        e1Var3.u0();
                        return;
                    case 3:
                        e1 e1Var4 = this.f4836b;
                        EditText editText3 = e1Var4.f4666f0;
                        Object[] objArr = 0;
                        if (editText3 == null) {
                            jc.i.i("etCard");
                            throw null;
                        }
                        String string = pc.g.B0(editText3.getText().toString()).toString();
                        if (string.length() == 0) {
                            EditText editText4 = e1Var4.f4666f0;
                            if (editText4 != null) {
                                editText4.setError(e1Var4.v(R.string.error_enter_cc));
                                return;
                            } else {
                                jc.i.i("etCard");
                                throw null;
                            }
                        }
                        Chip chip6 = e1Var4.f4670j0;
                        if (chip6 == null) {
                            jc.i.i("gratisChip");
                            throw null;
                        }
                        if (!chip6.isChecked()) {
                            Chip chip7 = e1Var4.f4671l0;
                            if (chip7 == null) {
                                jc.i.i("premiumChip");
                                throw null;
                            }
                            if (!chip7.isChecked()) {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_select_option), 0).show();
                                return;
                            }
                        }
                        Iterator it = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"}).iterator();
                        while (it.hasNext()) {
                            String strC0 = pc.o.c0(pc.g.B0((String) it.next()).toString(), " ", "|");
                            Pattern patternCompile = Pattern.compile("[^\\x00-\\x7F]");
                            jc.i.d(patternCompile, "compile(...)");
                            String strReplaceAll = patternCompile.matcher(strC0).replaceAll("");
                            jc.i.d(strReplaceAll, "replaceAll(...)");
                            if (strReplaceAll.length() != 0) {
                                Pattern patternCompile2 = Pattern.compile("^(\\d{13,16})\\|(\\d{2})\\|(\\d{4})\\|(\\d{3,4})$");
                                jc.i.d(patternCompile2, "compile(...)");
                                Matcher matcher = patternCompile2.matcher(strReplaceAll);
                                jc.i.d(matcher, "matcher(...)");
                                h6.o0 o0Var = !matcher.matches() ? null : new h6.o0(matcher, strReplaceAll);
                                if (o0Var != null) {
                                    String str = (String) ((pc.e) o0Var.h()).get(2);
                                    String str2 = (String) ((pc.e) o0Var.h()).get(3);
                                    String str3 = (String) ((pc.e) o0Var.h()).get(4);
                                    Integer numY = pc.n.Y(str);
                                    if (numY != null) {
                                        int iIntValue = numY.intValue();
                                        if (1 > iIntValue || iIntValue >= 13) {
                                            Log.d("CardValidation", "Mes inválido: ".concat(str));
                                        } else {
                                            Integer numY2 = pc.n.Y(str2);
                                            if (numY2 != null) {
                                                int iIntValue2 = numY2.intValue();
                                                if (iIntValue2 < 2000 || iIntValue2 > 2100) {
                                                    Log.d("CardValidation", "Año inválido: ".concat(str2));
                                                } else {
                                                    int length = str3.length();
                                                    if (3 > length || length >= 5) {
                                                        Log.d("CardValidation", "CVV inválido: ".concat(str3));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_invalid_card_format), 0).show();
                                return;
                            }
                        }
                        Log.d("CardValidation", "Tarjetas válidas");
                        Chip chip8 = e1Var4.f4671l0;
                        if (chip8 == null) {
                            jc.i.i("premiumChip");
                            throw null;
                        }
                        if (chip8.isChecked()) {
                            FirebaseAuth firebaseAuth2 = e1Var4.f4680u0;
                            if (firebaseAuth2 == null) {
                                jc.i.i("auth");
                                throw null;
                            }
                            if (firebaseAuth2.f2702f != null) {
                                rc.b0.q(androidx.lifecycle.i0.e(e1Var4.x()), null, new a2.g(e1Var4, string, objArr == true ? 1 : 0, 9), 3);
                                return;
                            } else {
                                Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_sign_in_premium), 0).show();
                                e1Var4.p0();
                                return;
                            }
                        }
                        List listW0 = pc.g.w0(pc.g.B0(string).toString(), new String[]{"\n"});
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listW0) {
                            if (!pc.g.m0((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            Toast.makeText(e1Var4.U(), e1Var4.v(R.string.error_no_cards), 0).show();
                        } else {
                            e1Var4.q0();
                            e1Var4.v0(arrayList, false);
                        }
                        androidx.fragment.app.w wVarT = e1Var4.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                            return;
                        }
                        return;
                    case 4:
                        e1 e1Var5 = this.f4836b;
                        FirebaseAuth firebaseAuth3 = e1Var5.f4680u0;
                        if (firebaseAuth3 == null) {
                            jc.i.i("auth");
                            throw null;
                        }
                        if (firebaseAuth3.f2702f == null) {
                            Toast.makeText(e1Var5.U(), e1Var5.v(R.string.error_sign_in_buy), 0).show();
                            e1Var5.p0();
                            return;
                        }
                        a5.g gVar = new a5.g();
                        gVar.f199a = e1Var5.f4679t0;
                        gVar.f200b = "inapp";
                        List listD = jd.d.D(gVar.a());
                        a5.b bVar = new a5.b(22);
                        bVar.z(listD);
                        a4.b bVarD = bVar.d();
                        o3.b bVar2 = e1Var5.f4678s0;
                        if (bVar2 != null) {
                            bVar2.x(bVarD, new h0(e1Var5));
                            return;
                        } else {
                            jc.i.i("billingClient");
                            throw null;
                        }
                    default:
                        try {
                            this.f4836b.Z(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/spacehowen")));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                }
            }
        });
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(U());
        fVar.f764c = this;
        fVar.f762a = new wa.d();
        o3.b bVarA = fVar.a();
        this.f4678s0 = bVarA;
        bVarA.z(new e7.i(this, 20));
        u0();
    }

    public final void d0(String str, w0 w0Var) {
        Throwable th;
        String string;
        String str2 = w0Var.f4884b;
        if (this.f4675p0) {
            return;
        }
        this.f4677r0.add(str + " -> " + str2);
        String str3 = "<font color='#F44336'>DIED</font>";
        String str4 = "<font color='#FFC107'>ERROR</font>";
        String str5 = jc.i.a(str2, "LIVE") ? "<font color='#4CAF50'>LIVE</font>" : jc.i.a(str2, "ERROR") ? "<font color='#FFC107'>ERROR</font>" : "<font color='#F44336'>DIED</font>";
        EditText editText = this.f4667g0;
        if (editText == null) {
            jc.i.i("etResult");
            throw null;
        }
        Editable text = editText.getText();
        jc.i.d(text, "getText(...)");
        boolean z4 = false;
        if (text.length() > 0) {
            EditText editText2 = this.f4667g0;
            if (editText2 == null) {
                jc.i.i("etResult");
                throw null;
            }
            List listW0 = pc.g.w0(editText2.getText().toString(), new String[]{"\n"});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listW0) {
                if (!pc.g.m0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                String str6 = (String) obj2;
                str3 = str3;
                if (pc.g.f0(str6, "->", z4)) {
                    List listW1 = pc.g.w0(str6, new String[]{"->"});
                    String str7 = str4;
                    if (listW1.size() == 2) {
                        String string2 = pc.g.B0((String) listW1.get(z4 ? 1 : 0)).toString();
                        String string3 = pc.g.B0((String) listW1.get(1)).toString();
                        int iHashCode = string3.hashCode();
                        if (iHashCode != 2098148) {
                            if (iHashCode != 2337004) {
                                if (iHashCode == 66247144 && string3.equals("ERROR")) {
                                    string3 = str7;
                                }
                            } else if (string3.equals("LIVE")) {
                                string3 = "<font color='#4CAF50'>LIVE</font>";
                            }
                        } else if (string3.equals("DIED")) {
                            string3 = str3;
                        }
                        sb2.append(string2 + "  ->  " + string3 + "<br>");
                        str4 = str7;
                        z4 = false;
                    } else {
                        str4 = str7;
                    }
                }
            }
            th = null;
            string = sb2.toString();
        } else {
            th = null;
            string = "";
        }
        jc.i.b(string);
        String strU = string.length() == 0 ? da.v.u(str, "  ->  ", str5) : da.v.v(string, str, "  ->  ", str5);
        EditText editText3 = this.f4667g0;
        if (editText3 == null) {
            jc.i.i("etResult");
            throw th;
        }
        editText3.setText(Html.fromHtml(strU, 0));
        EditText editText4 = this.f4667g0;
        if (editText4 == null) {
            jc.i.i("etResult");
            throw th;
        }
        editText4.post(new k0(this, 1));
    }

    public final void e0() {
        o3.b bVar = this.f4678s0;
        if (bVar == null) {
            jc.i.i("billingClient");
            throw null;
        }
        i6.e eVar = new i6.e(2);
        eVar.f5226b = "inapp";
        bVar.y(eVar.a(), new h0(this));
    }

    public final void f0(String str, String str2, boolean z4, boolean z10, ic.a aVar) {
        if (!z4 || this.f4675p0) {
            aVar.a();
        } else if (jc.i.a(str2, "LIVE") || jc.i.a(str2, "DIED")) {
            rc.b0.q(androidx.lifecycle.i0.e(x()), null, new y0(this, str, z10, aVar, null), 3);
        } else {
            aVar.a();
        }
    }

    public final void g0(Chip chip) {
        Chip chip2 = this.f4670j0;
        if (chip2 == null) {
            jc.i.i("gratisChip");
            throw null;
        }
        if (!jc.i.a(chip, chip2)) {
            Chip chip3 = this.f4670j0;
            if (chip3 == null) {
                jc.i.i("gratisChip");
                throw null;
            }
            chip3.setChecked(false);
        }
        Chip chip4 = this.f4671l0;
        if (chip4 == null) {
            jc.i.i("premiumChip");
            throw null;
        }
        if (jc.i.a(chip, chip4)) {
            return;
        }
        Chip chip5 = this.f4671l0;
        if (chip5 != null) {
            chip5.setChecked(false);
        } else {
            jc.i.i("premiumChip");
            throw null;
        }
    }

    @Override // o3.n
    public final void j(o3.e eVar, List list) {
        jc.i.e(eVar, "billingResult");
        Log.d("Billing", "onPurchasesUpdated: " + eVar.f7495a + " - " + eVar.f7497c);
        int i = eVar.f7495a;
        if (i != 0 || list == null) {
            if (i == 1) {
                Context contextR = r();
                if (contextR != null) {
                    Toast.makeText(contextR, v(R.string.purchase_cancelled), 0).show();
                    return;
                }
                return;
            }
            Context contextR2 = r();
            if (contextR2 != null) {
                Toast.makeText(contextR2, w(R.string.purchase_error, eVar.f7497c), 0).show();
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            StringBuilder sb2 = new StringBuilder("Compra recibida: token=");
            String strC = purchase.c();
            JSONObject jSONObject = purchase.f1835c;
            sb2.append(strC);
            sb2.append(", quantity=");
            sb2.append(jSONObject.optInt("quantity", 1));
            Log.d("Billing", sb2.toString());
            Log.d("Coins", "handlePurchase: state=" + purchase.b() + " products=" + purchase.a() + " qty=" + jSONObject.optInt("quantity", 1) + " token=" + purchase.c());
            if (purchase.b() == 1 && purchase.a().contains("coins_100")) {
                int iOptInt = jSONObject.optInt("quantity", 1);
                if (y() && this.P != null) {
                    rc.b0.q(androidx.lifecycle.i0.e(x()), null, new b1(this, purchase, iOptInt, null, 1), 3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j0(ac.c cVar) {
        a1 a1Var;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i = a1Var.f4614c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1Var.f4614c = i - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, cVar);
            }
        } else {
            a1Var = new a1(this, cVar);
        }
        Object objF = a1Var.f4612a;
        zb.a aVar = zb.a.f11555a;
        int i10 = a1Var.f4614c;
        try {
            if (i10 == 0) {
                r7.g.G(objF);
                FirebaseAuth firebaseAuth = this.f4680u0;
                if (firebaseAuth == null) {
                    jc.i.i("auth");
                    throw null;
                }
                v9.n nVar = firebaseAuth.f2702f;
                if (nVar != null) {
                    Task taskG = nVar.g();
                    jc.i.d(taskG, "getIdToken(...)");
                    a1Var.f4614c = 1;
                    objF = fa.c1.f(taskG, a1Var);
                    if (objF == aVar) {
                        return aVar;
                    }
                }
                return null;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r7.g.G(objF);
            v9.o oVar = (v9.o) objF;
            if (oVar != null) {
                return oVar.f9272a;
            }
            return null;
        } catch (Exception e) {
            Log.e("Coins", "Error al obtener ID token: " + e.getMessage());
            return null;
        }
    }

    public final void k0() {
        ArrayList arrayList = this.f4677r0;
        if (arrayList.isEmpty()) {
            return;
        }
        rc.b0.q(androidx.lifecycle.i0.e(x()), null, new b1(this, vb.i.e0(arrayList, "\n", null, null, null, 62), arrayList.size(), null, 0), 3);
    }

    public final Object l0(int i, ac.c cVar) {
        Context applicationContext;
        androidx.fragment.app.w wVarG = g();
        if (wVarG != null && (applicationContext = wVarG.getApplicationContext()) != null) {
            Object objA = ((a5.b) p.a(applicationContext)).a(new d1.c(new a2.g(this, i, (yb.d) null), null, 1), cVar);
            if (objA == zb.a.f11555a) {
                return objA;
            }
        }
        return ub.k.f9073a;
    }

    public final void m0(String str, String str2, String str3, String str4) {
        if (this.f4675p0 || str3.equals(str4)) {
            return;
        }
        HashMap map = this.f4685z0;
        Object map2 = map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        ((Map) map2).put(str2, new ub.f(str3, Long.valueOf(System.currentTimeMillis())));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gate", str);
        jSONObject.put("card", str2);
        jSONObject.put("status", str3);
        com.bumptech.glide.d.v(U()).a(new r3.e(1, q1.a.m(new StringBuilder(), this.f4684y0, "/save_status.php"), jSONObject, new e5.d(str2, str, str3, 5), new ga.a(16)));
    }

    public final void n0() {
        jb.b bVarB = jb.b.b();
        jc.i.d(bVarB, "getInstance(...)");
        jb.g gVar = new jb.g();
        gVar.a(0L);
        Tasks.call(bVarB.f5736b, new gb.h(1, bVarB, new jb.g(gVar)));
        ub.f[] fVarArr = {new ub.f("premium_gates3", "[]")};
        HashMap map = new HashMap(vb.t.A(1));
        vb.t.C(map, fVarArr);
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                map2.put((String) entry.getKey(), value.toString());
            }
        }
        try {
            kb.d dVarB = kb.e.b();
            dVarB.f6152b = new JSONObject(map2);
            bVarB.e.c(new kb.e((JSONObject) dVarB.f6152b, (Date) dVarB.f6154d, (JSONArray) dVarB.e, (JSONObject) dVarB.f6153c, dVarB.f6151a)).onSuccessTask(y9.i.f10656a, new ga.a(23));
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            Tasks.forResult(null);
        }
        bVarB.a().addOnCompleteListener(new e5.c(10, bVarB, this));
    }

    public final void p0() {
        ArrayList arrayListQ = vb.j.Q(new h6.o0(29).d());
        r4.d dVar = new r4.d(r4.e.a(n9.g.d()));
        dVar.b(arrayListQ);
        dVar.f8150d = false;
        dVar.e = false;
        this.E0.a(dVar.a());
    }

    public final void q0() {
        ProgressBar progressBar = this.k0;
        if (progressBar == null) {
            jc.i.i("progressBar");
            throw null;
        }
        progressBar.setVisibility(0);
        EditText editText = this.f4667g0;
        if (editText != null) {
            editText.setVisibility(8);
        } else {
            jc.i.i("etResult");
            throw null;
        }
    }

    public final void r0() {
        ProgressBar progressBar = this.k0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            jc.i.i("progressBar");
            throw null;
        }
    }

    public final void t0(final int i, final List list, final boolean z4) throws JSONException {
        String str;
        if (this.f4675p0) {
            r0();
            return;
        }
        if (i >= list.size()) {
            r0();
            k0();
            return;
        }
        final String string = pc.g.B0((String) list.get(i)).toString();
        List listW0 = pc.g.w0(string, new String[]{"|"});
        if (listW0.size() == 4 && o0((String) listW0.get(1), (String) listW0.get(2))) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: h3.i0
                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder sb2 = new StringBuilder("Tarjeta expirada: ");
                    String str2 = string;
                    sb2.append(str2);
                    sb2.append(" -> ERROR");
                    Log.d("LDC", sb2.toString());
                    w0 w0Var = new w0(str2, "ERROR", null);
                    e1 e1Var = this;
                    e1Var.d0(str2, w0Var);
                    int i10 = i;
                    int i11 = i10 + 1;
                    List list2 = list;
                    boolean z10 = i11 < list2.size();
                    boolean z11 = z4;
                    e1Var.f0(str2, "ERROR", z11, z10, new l0(e1Var, list2, z11, i10, 0));
                }
            }, kc.d.f6207b.e(5000L, 7500L));
            return;
        }
        if (z4) {
            str = this.A0;
            if (str == null) {
                str = "PREMIUM";
            }
        } else {
            str = this.f4683x0;
        }
        j0 j0Var = new j0(string, str, this, z4, i, list);
        Map map = (Map) this.f4685z0.get(str);
        ub.f fVar = map != null ? (ub.f) map.get(string) : null;
        if (fVar != null) {
            j0Var.b(Boolean.TRUE, fVar.f9065a, fVar.f9066b);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gate", str);
        jSONObject.put("card", string);
        com.bumptech.glide.d.v(U()).a(new r3.e(1, q1.a.m(new StringBuilder(), this.f4684y0, "/get_status.php"), jSONObject, new e5.a(this, str, string, j0Var), new a5.a(j0Var, 12)));
    }

    public final void u0() {
        if (!y() || this.P == null) {
            return;
        }
        rc.b0.q(androidx.lifecycle.i0.e(x()), null, new d1(this, null, 0), 3);
    }

    public final void v0(ArrayList arrayList, boolean z4) throws JSONException {
        String str;
        Log.d("Firebase", "Iniciando verificación de " + arrayList.size() + " tarjetas. Modo Premium: " + z4);
        if (!z4) {
            this.A0 = null;
        }
        this.f4675p0 = false;
        this.f4677r0.clear();
        this.f4685z0.clear();
        String strV = "PREMIUM";
        if (z4) {
            str = this.A0;
            if (str == null) {
                str = "PREMIUM";
            }
        } else {
            str = this.f4683x0;
        }
        this.f4676q0 = str;
        EditText editText = this.f4667g0;
        if (editText == null) {
            jc.i.i("etResult");
            throw null;
        }
        editText.setText("");
        EditText editText2 = this.f4667g0;
        if (editText2 == null) {
            jc.i.i("etResult");
            throw null;
        }
        editText2.setVisibility(0);
        if (z4) {
            String str2 = this.A0;
            if (str2 != null) {
                strV = str2;
            }
        } else {
            strV = v(R.string.chip_free);
            jc.i.d(strV, "getString(...)");
        }
        TextView textView = this.f4668h0;
        if (textView == null) {
            jc.i.i("txtResultTitle");
            throw null;
        }
        textView.setText(w(R.string.ldc_results_title_gate, strV));
        TextView textView2 = this.f4668h0;
        if (textView2 == null) {
            jc.i.i("txtResultTitle");
            throw null;
        }
        textView2.setVisibility(0);
        t0(0, arrayList, z4);
    }
}
