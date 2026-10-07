package h3;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import app.namso_gen.spacehowen.R;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends x1.z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4780d;
    public List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4781f;

    public n(c cVar, byte b10) {
        this.f4780d = 1;
        this.e = vb.q.f9297a;
        this.f4781f = cVar;
    }

    @Override // x1.z
    public final int a() {
        switch (this.f4780d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.e.size();
    }

    @Override // x1.z
    public final void e(x1.w0 w0Var, final int i) {
        String str;
        String str2;
        String str3;
        switch (this.f4780d) {
            case 0:
                m mVar = (m) w0Var;
                View view = mVar.f10230a;
                i3.a aVar = (i3.a) this.e.get(i);
                TextView textView = mVar.f4766u;
                textView.setText(aVar.f5160c);
                textView.setTextIsSelectable(false);
                textView.post(new androidx.activity.d(mVar, 15));
                String str4 = aVar.f5159b;
                String str5 = "";
                String str6 = jc.i.a(str4, "GRATIS") ? "" : "  ·  " + view.getContext().getString(R.string.ldc_history_gate, str4);
                TextView textView2 = mVar.f4767v;
                Locale locale = Locale.getDefault();
                try {
                    String str7 = new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(aVar.e));
                    jc.i.b(str7);
                    str5 = str7;
                } catch (Exception unused) {
                }
                textView2.setText(String.format(locale, "%s  ·  %d %s%s", Arrays.copyOf(new Object[]{str5, Integer.valueOf(aVar.f5161d), view.getContext().getString(R.string.ldc_history_cards), str6}, 4)));
                mVar.f4768w.setOnClickListener(new k(this, mVar, aVar, 0));
                break;
            case 1:
                h1 h1Var = (h1) w0Var;
                View view2 = h1Var.f10230a;
                f1 f1Var = (f1) this.e.get(i);
                h1Var.f4716u.setText(f1Var.f4693b);
                h1Var.f4717v.setText(f1Var.f4694c);
                TextView textView3 = h1Var.f4718w;
                String str8 = f1Var.f4695d;
                try {
                    SimpleDateFormat simpleDateFormat = pc.g.g0(str8, '.') ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.getDefault()) : pc.g.g0(str8, '+') ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.getDefault()) : new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault());
                    Date date = simpleDateFormat.parse(str8);
                    if (date != null && (str = simpleDateFormat2.format(date)) != null) {
                        str8 = str;
                    }
                } catch (Exception unused2) {
                }
                textView3.setText(str8);
                view2.setAlpha(1.0f);
                view2.setOnClickListener(new View.OnClickListener() { // from class: h3.g1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ((c) this.f4708a.f4781f).invoke(Integer.valueOf(i));
                    }
                });
                break;
            case 2:
                y1 y1Var = (y1) w0Var;
                i3.f fVar = (i3.f) this.e.get(i);
                y1Var.f4905u.setText(fVar.f5171b);
                TextView textView4 = y1Var.f4906v;
                try {
                    str2 = new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(fVar.f5172c));
                    jc.i.b(str2);
                } catch (Exception unused3) {
                    str2 = "";
                }
                textView4.setText(str2);
                y1Var.f10230a.setOnClickListener(new d0(1, this, fVar));
                break;
            case 3:
                l3.c cVar = (l3.c) w0Var;
                l3.d dVar = (l3.d) this.e.get(i);
                Context context = cVar.f10230a.getContext();
                bd.u uVar = cVar.f6526u;
                ((TextView) uVar.e).setText(dVar.f6539b);
                TextView textView5 = (TextView) uVar.f1679f;
                String str9 = dVar.f6538a;
                textView5.setText(context.getString(R.string.free_proxy_iso_code, str9));
                ((TextView) uVar.f1678d).setText(context.getString(R.string.free_proxy_action_search));
                ImageView imageView = (ImageView) uVar.f1676b;
                imageView.setVisibility(0);
                String strB = n3.d.b(str9);
                com.bumptech.glide.l lVarC = com.bumptech.glide.b.a(context).e.c(context);
                lVarC.getClass();
                new com.bumptech.glide.j(lVarC.f1878a, lVarC, Drawable.class, lVarC.f1879b).A(strB).y(imageView);
                ((LinearLayout) uVar.f1677c).setOnClickListener(new d0(5, this, dVar));
                break;
            case 4:
                l3.e eVar = (l3.e) w0Var;
                View view3 = eVar.f10230a;
                e6.q qVar = eVar.f6547u;
                n3.c cVar2 = (n3.c) this.e.get(i);
                String strC = n3.d.c(cVar2);
                if (strC != null) {
                    ((ImageView) qVar.f3391b).setVisibility(0);
                    ((TextView) qVar.e).setVisibility(8);
                    Context context2 = view3.getContext();
                    p4.f.c(context2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                    com.bumptech.glide.l lVarC2 = com.bumptech.glide.b.a(context2).e.c(context2);
                    lVarC2.getClass();
                    new com.bumptech.glide.j(lVarC2.f1878a, lVarC2, Drawable.class, lVarC2.f1879b).A(strC).y((ImageView) qVar.f3391b);
                } else {
                    ImageView imageView2 = (ImageView) qVar.f3391b;
                    TextView textView6 = (TextView) qVar.e;
                    imageView2.setVisibility(8);
                    textView6.setVisibility(0);
                    textView6.setText(n3.d.d(cVar2));
                }
                TextView textView7 = (TextView) qVar.f3392c;
                TextView textView8 = (TextView) qVar.f3395g;
                textView7.setText(cVar2.f7247b + ':' + cVar2.f7248c);
                int i10 = cVar2.f7246a;
                if (i10 == 1) {
                    str3 = "HTTPS";
                } else if (i10 != 2) {
                    str3 = i10 != 3 ? "HTTP" : "SOCKS4";
                } else {
                    str3 = "SOCKS5";
                }
                String strE = n3.d.e(cVar2.f7250f);
                Context context3 = view3.getContext();
                String str10 = cVar2.f7251g;
                if (str10 == null) {
                    str10 = "OK";
                }
                String string = context3.getString(R.string.free_proxy_exit_label, str10);
                jc.i.d(string, "getString(...)");
                ((TextView) qVar.f3394f).setText(strE + " · " + str3 + " · " + string);
                StringBuilder sb2 = new StringBuilder("✓ ");
                sb2.append(cVar2.f7252j);
                sb2.append("ms");
                textView8.setText(sb2.toString());
                textView8.setTextColor(view3.getContext().getColor(R.color.ok));
                ((TextView) qVar.f3393d).setVisibility(8);
                ((LinearLayout) qVar.f3390a).setOnClickListener(new d0(6, this, cVar2));
                break;
            default:
                final n3.b bVar = (n3.b) this.e.get(i);
                final l3.t tVar = (l3.t) this.f4781f;
                boolean zF0 = tVar.f0(bVar);
                String str11 = bVar.i;
                boolean z4 = bVar.f7245k;
                int i11 = bVar.f7242f;
                String str12 = bVar.e;
                bd.u uVar2 = ((l3.o) w0Var).f6617u;
                ((TextView) uVar2.f1678d).setTextColor(tVar.U().getColor(zF0 ? R.color.ok : R.color.separator));
                ((TextView) uVar2.e).setText(bVar.f7239b);
                TextView textView9 = (TextView) uVar2.f1679f;
                StringBuilder sb3 = new StringBuilder();
                if (pc.g.m0(str12) || 1 > i11 || i11 >= 65536) {
                    sb3.append("🌐 ");
                    sb3.append(tVar.v(R.string.profile_no_proxy));
                } else {
                    sb3.append((!z4 || str11 == null) ? "❔" : n3.d.a(str11));
                    String strE2 = n3.d.e(str11);
                    if (z4 && strE2.length() > 0) {
                        sb3.append(' ');
                        sb3.append(strE2);
                    }
                    if (sb3.length() > 0) {
                        sb3.append(" · ");
                    }
                    if (bVar.b()) {
                        sb3.append(tVar.v(R.string.proxy_residential_label));
                    } else {
                        sb3.append(str12 + ':' + i11);
                    }
                }
                String host = Uri.parse(bVar.f7240c).getHost();
                if (host == null) {
                    host = "";
                }
                if (host.length() > 0) {
                    sb3.append(" · ");
                    sb3.append(host);
                }
                if (zF0) {
                    sb3.append("  ·  ");
                    sb3.append(tVar.v(R.string.profiles_active_now));
                }
                textView9.setText(sb3.toString());
                final int i12 = 0;
                ((CardView) uVar2.f1677c).setOnClickListener(new View.OnClickListener() { // from class: l3.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        switch (i12) {
                            case 0:
                                tVar.i0(bVar);
                                break;
                            default:
                                final t tVar2 = tVar;
                                final n3.b bVar2 = bVar;
                                final boolean zF1 = tVar2.f0(bVar2);
                                final ArrayList arrayList = new ArrayList();
                                arrayList.add(tVar2.v(R.string.profiles_edit));
                                if (zF1) {
                                    arrayList.add(tVar2.v(R.string.profiles_close_window));
                                }
                                arrayList.add(tVar2.v(R.string.profiles_delete));
                                ea.j jVar = new ea.j((Context) tVar2.T(), R.style.KryptProxyDialog);
                                g.b bVar3 = (g.b) jVar.f3530b;
                                bVar3.f3971d = bVar2.f7239b;
                                CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new String[0]);
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l3.m
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        final n3.b bVar4 = bVar2;
                                        long j4 = bVar4.f7238a;
                                        String str13 = (String) arrayList.get(i13);
                                        final t tVar3 = tVar2;
                                        if (jc.i.a(str13, tVar3.v(R.string.profiles_edit))) {
                                            if (!zF1) {
                                                r7.g.C(tVar3.T(), Long.valueOf(j4), new k(tVar3, 1));
                                                return;
                                            }
                                            ea.j jVar2 = new ea.j((Context) tVar3.T(), R.style.KryptProxyDialog);
                                            jVar2.l(R.string.profiles_edit);
                                            jVar2.f(R.string.profiles_edit_active_msg);
                                            final int i14 = 0;
                                            jVar2.j(R.string.profiles_edit_active_ok, new DialogInterface.OnClickListener() { // from class: l3.n
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface2, int i15) throws JSONException {
                                                    switch (i14) {
                                                        case 0:
                                                            long j10 = bVar4.f7238a;
                                                            t tVar4 = tVar3;
                                                            tVar4.g0(j10, false);
                                                            r7.g.C(tVar4.T(), Long.valueOf(j10), new k(tVar4, 2));
                                                            break;
                                                        default:
                                                            long j11 = bVar4.f7238a;
                                                            t tVar5 = tVar3;
                                                            tVar5.g0(j11, false);
                                                            List listN = p3.a.n();
                                                            ArrayList arrayList2 = new ArrayList();
                                                            for (Object obj : listN) {
                                                                if (((n3.b) obj).f7238a != j11) {
                                                                    arrayList2.add(obj);
                                                                }
                                                            }
                                                            p3.a.q(arrayList2);
                                                            tVar5.f6684m0.k();
                                                            break;
                                                    }
                                                }
                                            });
                                            jVar2.g(R.string.cancel, null);
                                            jVar2.m();
                                            return;
                                        }
                                        if (jc.i.a(str13, tVar3.v(R.string.profiles_close_window))) {
                                            tVar3.g0(j4, false);
                                            return;
                                        }
                                        if (jc.i.a(str13, tVar3.v(R.string.profiles_delete))) {
                                            ea.j jVar3 = new ea.j((Context) tVar3.T(), R.style.KryptProxyDialog);
                                            ((g.b) jVar3.f3530b).f3971d = bVar4.f7239b;
                                            jVar3.f(R.string.profiles_delete);
                                            final int i15 = 1;
                                            jVar3.j(R.string.profiles_delete, new DialogInterface.OnClickListener() { // from class: l3.n
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface2, int i16) throws JSONException {
                                                    switch (i15) {
                                                        case 0:
                                                            long j10 = bVar4.f7238a;
                                                            t tVar4 = tVar3;
                                                            tVar4.g0(j10, false);
                                                            r7.g.C(tVar4.T(), Long.valueOf(j10), new k(tVar4, 2));
                                                            break;
                                                        default:
                                                            long j11 = bVar4.f7238a;
                                                            t tVar5 = tVar3;
                                                            tVar5.g0(j11, false);
                                                            List listN = p3.a.n();
                                                            ArrayList arrayList2 = new ArrayList();
                                                            for (Object obj : listN) {
                                                                if (((n3.b) obj).f7238a != j11) {
                                                                    arrayList2.add(obj);
                                                                }
                                                            }
                                                            p3.a.q(arrayList2);
                                                            tVar5.f6684m0.k();
                                                            break;
                                                    }
                                                }
                                            });
                                            jVar3.g(R.string.cancel, null);
                                            jVar3.m();
                                        }
                                    }
                                };
                                bVar3.f3980p = charSequenceArr;
                                bVar3.f3982r = onClickListener;
                                jVar.m();
                                break;
                        }
                    }
                });
                final int i13 = 1;
                ((ImageView) uVar2.f1676b).setOnClickListener(new View.OnClickListener() { // from class: l3.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        switch (i13) {
                            case 0:
                                tVar.i0(bVar);
                                break;
                            default:
                                final t tVar2 = tVar;
                                final n3.b bVar2 = bVar;
                                final boolean zF1 = tVar2.f0(bVar2);
                                final ArrayList arrayList = new ArrayList();
                                arrayList.add(tVar2.v(R.string.profiles_edit));
                                if (zF1) {
                                    arrayList.add(tVar2.v(R.string.profiles_close_window));
                                }
                                arrayList.add(tVar2.v(R.string.profiles_delete));
                                ea.j jVar = new ea.j((Context) tVar2.T(), R.style.KryptProxyDialog);
                                g.b bVar3 = (g.b) jVar.f3530b;
                                bVar3.f3971d = bVar2.f7239b;
                                CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new String[0]);
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l3.m
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        final n3.b bVar4 = bVar2;
                                        long j4 = bVar4.f7238a;
                                        String str13 = (String) arrayList.get(i14);
                                        final t tVar3 = tVar2;
                                        if (jc.i.a(str13, tVar3.v(R.string.profiles_edit))) {
                                            if (!zF1) {
                                                r7.g.C(tVar3.T(), Long.valueOf(j4), new k(tVar3, 1));
                                                return;
                                            }
                                            ea.j jVar2 = new ea.j((Context) tVar3.T(), R.style.KryptProxyDialog);
                                            jVar2.l(R.string.profiles_edit);
                                            jVar2.f(R.string.profiles_edit_active_msg);
                                            final int i15 = 0;
                                            jVar2.j(R.string.profiles_edit_active_ok, new DialogInterface.OnClickListener() { // from class: l3.n
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface2, int i16) throws JSONException {
                                                    switch (i15) {
                                                        case 0:
                                                            long j10 = bVar4.f7238a;
                                                            t tVar4 = tVar3;
                                                            tVar4.g0(j10, false);
                                                            r7.g.C(tVar4.T(), Long.valueOf(j10), new k(tVar4, 2));
                                                            break;
                                                        default:
                                                            long j11 = bVar4.f7238a;
                                                            t tVar5 = tVar3;
                                                            tVar5.g0(j11, false);
                                                            List listN = p3.a.n();
                                                            ArrayList arrayList2 = new ArrayList();
                                                            for (Object obj : listN) {
                                                                if (((n3.b) obj).f7238a != j11) {
                                                                    arrayList2.add(obj);
                                                                }
                                                            }
                                                            p3.a.q(arrayList2);
                                                            tVar5.f6684m0.k();
                                                            break;
                                                    }
                                                }
                                            });
                                            jVar2.g(R.string.cancel, null);
                                            jVar2.m();
                                            return;
                                        }
                                        if (jc.i.a(str13, tVar3.v(R.string.profiles_close_window))) {
                                            tVar3.g0(j4, false);
                                            return;
                                        }
                                        if (jc.i.a(str13, tVar3.v(R.string.profiles_delete))) {
                                            ea.j jVar3 = new ea.j((Context) tVar3.T(), R.style.KryptProxyDialog);
                                            ((g.b) jVar3.f3530b).f3971d = bVar4.f7239b;
                                            jVar3.f(R.string.profiles_delete);
                                            final int i16 = 1;
                                            jVar3.j(R.string.profiles_delete, new DialogInterface.OnClickListener() { // from class: l3.n
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface2, int i17) throws JSONException {
                                                    switch (i16) {
                                                        case 0:
                                                            long j10 = bVar4.f7238a;
                                                            t tVar4 = tVar3;
                                                            tVar4.g0(j10, false);
                                                            r7.g.C(tVar4.T(), Long.valueOf(j10), new k(tVar4, 2));
                                                            break;
                                                        default:
                                                            long j11 = bVar4.f7238a;
                                                            t tVar5 = tVar3;
                                                            tVar5.g0(j11, false);
                                                            List listN = p3.a.n();
                                                            ArrayList arrayList2 = new ArrayList();
                                                            for (Object obj : listN) {
                                                                if (((n3.b) obj).f7238a != j11) {
                                                                    arrayList2.add(obj);
                                                                }
                                                            }
                                                            p3.a.q(arrayList2);
                                                            tVar5.f6684m0.k();
                                                            break;
                                                    }
                                                }
                                            });
                                            jVar3.g(R.string.cancel, null);
                                            jVar3.m();
                                        }
                                    }
                                };
                                bVar3.f3980p = charSequenceArr;
                                bVar3.f3982r = onClickListener;
                                jVar.m();
                                break;
                        }
                    }
                });
                break;
        }
    }

    @Override // x1.z
    public final x1.w0 f(ViewGroup viewGroup) {
        switch (this.f4780d) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_checker_batch, viewGroup, false);
                jc.i.b(viewInflate);
                return new m(viewInflate);
            case 1:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mail, viewGroup, false);
                jc.i.b(viewInflate2);
                return new h1(viewInflate2);
            case 2:
                View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_note, viewGroup, false);
                jc.i.b(viewInflate3);
                return new y1(viewInflate3);
            case 3:
                return new l3.c(bd.u.g(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 4:
                return new l3.e(e6.q.c(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            default:
                l3.t tVar = (l3.t) this.f4781f;
                LayoutInflater layoutInflaterH = tVar.U;
                if (layoutInflaterH == null) {
                    layoutInflaterH = tVar.H(null);
                    tVar.U = layoutInflaterH;
                }
                View viewInflate4 = layoutInflaterH.inflate(R.layout.item_profile, viewGroup, false);
                int i = R.id.btn_pmore;
                ImageView imageView = (ImageView) r7.g.o(viewInflate4, R.id.btn_pmore);
                if (imageView != null) {
                    i = R.id.tv_dot;
                    TextView textView = (TextView) r7.g.o(viewInflate4, R.id.tv_dot);
                    if (textView != null) {
                        i = R.id.tv_pname;
                        TextView textView2 = (TextView) r7.g.o(viewInflate4, R.id.tv_pname);
                        if (textView2 != null) {
                            i = R.id.tv_psub;
                            TextView textView3 = (TextView) r7.g.o(viewInflate4, R.id.tv_psub);
                            if (textView3 != null) {
                                return new l3.o(new bd.u((CardView) viewInflate4, imageView, textView, textView2, textView3, 5));
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i)));
        }
    }

    public void k() {
        this.e = p3.a.n();
        c();
        j3.d dVar = ((l3.t) this.f4781f).f6678f0;
        if (dVar == null) {
            return;
        }
        dVar.f5680m.setVisibility(this.e.isEmpty() ? 0 : 8);
        dVar.f5683p.setVisibility(this.e.isEmpty() ? 8 : 0);
    }

    public n(c cVar, char c10) {
        this.f4780d = 2;
        this.e = vb.q.f9297a;
        this.f4781f = cVar;
    }

    public n(c cVar) {
        this.f4780d = 0;
        this.e = vb.q.f9297a;
        this.f4781f = cVar;
    }

    public n(l3.t tVar) {
        this.f4780d = 5;
        this.f4781f = tVar;
        this.e = vb.q.f9297a;
    }

    public n(ArrayList arrayList, l3.b bVar, byte b10) {
        this.f4780d = 3;
        jc.i.e(arrayList, "items");
        this.e = arrayList;
        this.f4781f = bVar;
    }

    public n(ArrayList arrayList, l3.b bVar) {
        this.f4780d = 4;
        jc.i.e(arrayList, "items");
        this.e = arrayList;
        this.f4781f = bVar;
    }
}
