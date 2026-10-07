package h3;

import android.widget.TextView;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.n f4878d;
    public final /* synthetic */ MainActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(v9.n nVar, MainActivity mainActivity, yb.d dVar, int i) {
        super(2, dVar);
        this.f4875a = i;
        this.f4878d = nVar;
        this.e = mainActivity;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f4875a) {
            case 0:
                return new v1(this.f4878d, this.e, dVar, 0);
            default:
                return new v1(this.f4878d, this.e, dVar, 1);
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        rc.a0 a0Var = (rc.a0) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f4875a) {
            case 0:
                break;
        }
        return ((v1) create(a0Var, dVar)).invokeSuspend(ub.k.f9073a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0183  */
    /* JADX WARN: Code duplicated, block: B:101:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x018d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0191  */
    /* JADX WARN: Code duplicated, block: B:105:0x019f  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0178  */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        Object objB;
        Integer num;
        Object objA;
        Integer num2;
        k3.k kVar;
        FirebaseAuth firebaseAuth;
        TextView textView;
        TextView textView2;
        Object objF;
        String str2;
        Object objB2;
        Integer num3;
        Object objA2;
        Integer num4;
        k3.k kVar2;
        FirebaseAuth firebaseAuth2;
        TextView textView3;
        TextView textView4;
        Object objF2;
        int i = this.f4875a;
        v9.n nVar = this.f4878d;
        MainActivity mainActivity = this.e;
        ub.k kVar3 = ub.k.f9073a;
        switch (i) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                int i10 = this.f4877c;
                try {
                    if (i10 == 0) {
                        r7.g.G(obj);
                        Task taskG = nVar.g();
                        jc.i.d(taskG, "getIdToken(...)");
                        this.f4877c = 1;
                        objF = fa.c1.f(taskG, this);
                        if (objF == aVar) {
                        }
                        return aVar;
                    }
                    if (i10 == 1) {
                        r7.g.G(obj);
                        objF = obj;
                    } else {
                        if (i10 == 2) {
                            str = (String) this.f4876b;
                            r7.g.G(obj);
                            objB = obj;
                            num = (Integer) objB;
                            bd.s sVar = k3.o.f5963a;
                            this.f4876b = num;
                            this.f4877c = 3;
                            objA = k3.o.a(str, this);
                            if (objA != aVar) {
                                num2 = num;
                            }
                            return aVar;
                        }
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        num2 = (Integer) this.f4876b;
                        r7.g.G(obj);
                        objA = obj;
                    }
                    kVar = (k3.k) objA;
                    firebaseAuth = mainActivity.f1291h0;
                    if (firebaseAuth != null) {
                        jc.i.i("auth");
                        throw null;
                    }
                    if (firebaseAuth.f2702f == null) {
                        mainActivity.f1289f0 = false;
                        mainActivity.f1290g0 = false;
                        mainActivity.t();
                        return kVar3;
                    }
                    if (num2 != null) {
                        textView2 = mainActivity.M;
                        if (textView2 != null) {
                            jc.i.i("txtCoinsMain");
                            throw null;
                        }
                        textView2.setText(mainActivity.getString(R.string.coins_format, num2));
                        mainActivity.f1289f0 = true;
                    } else {
                        mainActivity.f1289f0 = false;
                    }
                    if (kVar != null) {
                        textView = mainActivity.N;
                        if (textView != null) {
                            jc.i.i("txtMbMain");
                            throw null;
                        }
                        textView.setText(mainActivity.getString(R.string.mb_format, new Integer(kVar.f5945b)));
                        mainActivity.f1290g0 = true;
                    } else {
                        mainActivity.f1290g0 = false;
                    }
                    int i11 = MainActivity.f1283j0;
                    mainActivity.t();
                    return kVar3;
                    v9.o oVar = (v9.o) objF;
                    str = oVar != null ? oVar.f9272a : null;
                    break;
                } catch (Exception unused) {
                }
                FirebaseAuth firebaseAuth3 = mainActivity.f1291h0;
                if (firebaseAuth3 == null) {
                    jc.i.i("auth");
                    throw null;
                }
                if (firebaseAuth3.f2702f == null) {
                    mainActivity.f1289f0 = false;
                    mainActivity.f1290g0 = false;
                    mainActivity.t();
                    return kVar3;
                }
                if (str != null) {
                    k3.e eVar = k3.e.f5930a;
                    this.f4876b = str;
                    this.f4877c = 2;
                    objB = eVar.b(str, this);
                    if (objB != aVar) {
                        num = (Integer) objB;
                        bd.s sVar2 = k3.o.f5963a;
                        this.f4876b = num;
                        this.f4877c = 3;
                        objA = k3.o.a(str, this);
                        if (objA != aVar) {
                            num2 = num;
                            kVar = (k3.k) objA;
                            firebaseAuth = mainActivity.f1291h0;
                            if (firebaseAuth != null) {
                                jc.i.i("auth");
                                throw null;
                            }
                            if (firebaseAuth.f2702f == null) {
                                mainActivity.f1289f0 = false;
                                mainActivity.f1290g0 = false;
                                mainActivity.t();
                                return kVar3;
                            }
                            if (num2 != null) {
                                textView2 = mainActivity.M;
                                if (textView2 != null) {
                                    jc.i.i("txtCoinsMain");
                                    throw null;
                                }
                                textView2.setText(mainActivity.getString(R.string.coins_format, num2));
                                mainActivity.f1289f0 = true;
                            } else {
                                mainActivity.f1289f0 = false;
                            }
                            if (kVar != null) {
                                textView = mainActivity.N;
                                if (textView != null) {
                                    jc.i.i("txtMbMain");
                                    throw null;
                                }
                                textView.setText(mainActivity.getString(R.string.mb_format, new Integer(kVar.f5945b)));
                                mainActivity.f1290g0 = true;
                            } else {
                                mainActivity.f1290g0 = false;
                            }
                        }
                    }
                    return aVar;
                }
                mainActivity.f1289f0 = false;
                mainActivity.f1290g0 = false;
                int i12 = MainActivity.f1283j0;
                mainActivity.t();
                return kVar3;
            default:
                zb.a aVar2 = zb.a.f11555a;
                int i13 = this.f4877c;
                try {
                    if (i13 == 0) {
                        r7.g.G(obj);
                        Task taskG2 = nVar.g();
                        jc.i.d(taskG2, "getIdToken(...)");
                        this.f4877c = 1;
                        objF2 = fa.c1.f(taskG2, this);
                        if (objF2 == aVar2) {
                        }
                        return aVar2;
                    }
                    if (i13 == 1) {
                        r7.g.G(obj);
                        objF2 = obj;
                    } else {
                        if (i13 == 2) {
                            str2 = (String) this.f4876b;
                            r7.g.G(obj);
                            objB2 = obj;
                            num3 = (Integer) objB2;
                            bd.s sVar3 = k3.o.f5963a;
                            this.f4876b = num3;
                            this.f4877c = 3;
                            objA2 = k3.o.a(str2, this);
                            if (objA2 != aVar2) {
                                num4 = num3;
                            }
                            return aVar2;
                        }
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        num4 = (Integer) this.f4876b;
                        r7.g.G(obj);
                        objA2 = obj;
                    }
                    kVar2 = (k3.k) objA2;
                    firebaseAuth2 = mainActivity.f1291h0;
                    if (firebaseAuth2 != null) {
                        jc.i.i("auth");
                        throw null;
                    }
                    if (firebaseAuth2.f2702f == null) {
                        mainActivity.f1289f0 = false;
                        mainActivity.f1290g0 = false;
                        mainActivity.t();
                        return kVar3;
                    }
                    if (num4 != null) {
                        textView4 = mainActivity.M;
                        if (textView4 != null) {
                            jc.i.i("txtCoinsMain");
                            throw null;
                        }
                        textView4.setText(mainActivity.getString(R.string.coins_format, num4));
                        mainActivity.f1289f0 = true;
                    } else {
                        mainActivity.f1289f0 = false;
                    }
                    if (kVar2 != null) {
                        textView3 = mainActivity.N;
                        if (textView3 != null) {
                            jc.i.i("txtMbMain");
                            throw null;
                        }
                        textView3.setText(mainActivity.getString(R.string.mb_format, new Integer(kVar2.f5945b)));
                        mainActivity.f1290g0 = true;
                    } else {
                        mainActivity.f1290g0 = false;
                    }
                    int i14 = MainActivity.f1283j0;
                    mainActivity.t();
                    return kVar3;
                    v9.o oVar2 = (v9.o) objF2;
                    str2 = oVar2 != null ? oVar2.f9272a : null;
                    break;
                } catch (Exception unused2) {
                }
                FirebaseAuth firebaseAuth4 = mainActivity.f1291h0;
                if (firebaseAuth4 == null) {
                    jc.i.i("auth");
                    throw null;
                }
                if (firebaseAuth4.f2702f == null) {
                    mainActivity.f1289f0 = false;
                    mainActivity.f1290g0 = false;
                    mainActivity.t();
                    return kVar3;
                }
                if (str2 != null) {
                    k3.e eVar2 = k3.e.f5930a;
                    this.f4876b = str2;
                    this.f4877c = 2;
                    objB2 = eVar2.b(str2, this);
                    if (objB2 != aVar2) {
                        num3 = (Integer) objB2;
                        bd.s sVar4 = k3.o.f5963a;
                        this.f4876b = num3;
                        this.f4877c = 3;
                        objA2 = k3.o.a(str2, this);
                        if (objA2 != aVar2) {
                            num4 = num3;
                            kVar2 = (k3.k) objA2;
                            firebaseAuth2 = mainActivity.f1291h0;
                            if (firebaseAuth2 != null) {
                                jc.i.i("auth");
                                throw null;
                            }
                            if (firebaseAuth2.f2702f == null) {
                                mainActivity.f1289f0 = false;
                                mainActivity.f1290g0 = false;
                                mainActivity.t();
                                return kVar3;
                            }
                            if (num4 != null) {
                                textView4 = mainActivity.M;
                                if (textView4 != null) {
                                    jc.i.i("txtCoinsMain");
                                    throw null;
                                }
                                textView4.setText(mainActivity.getString(R.string.coins_format, num4));
                                mainActivity.f1289f0 = true;
                            } else {
                                mainActivity.f1289f0 = false;
                            }
                            if (kVar2 != null) {
                                textView3 = mainActivity.N;
                                if (textView3 != null) {
                                    jc.i.i("txtMbMain");
                                    throw null;
                                }
                                textView3.setText(mainActivity.getString(R.string.mb_format, new Integer(kVar2.f5945b)));
                                mainActivity.f1290g0 = true;
                            } else {
                                mainActivity.f1290g0 = false;
                            }
                        }
                    }
                    return aVar2;
                }
                mainActivity.f1289f0 = false;
                mainActivity.f1290g0 = false;
                int i15 = MainActivity.f1283j0;
                mainActivity.t();
                return kVar3;
        }
    }
}
