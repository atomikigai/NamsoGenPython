package androidx.appcompat.widget;

import a2.l;
import ac.f;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import app.namso_gen.spacehowen.R;
import g9.u;
import g9.z;
import h3.b0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.n;
import l.o2;
import l.p2;
import l.q2;
import l.r2;
import l.s2;
import l.t2;
import l.u2;
import l.v2;
import l.w1;
import l.x2;
import q0.d0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends w1 implements j.b {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final f f493r0;
    public final SearchAutoComplete A;
    public final View B;
    public final View C;
    public final View D;
    public final ImageView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final View I;
    public v2 J;
    public final Rect K;
    public final Rect L;
    public final int[] M;
    public final int[] N;
    public final ImageView O;
    public final Drawable P;
    public final int Q;
    public final int R;
    public final Intent S;
    public final Intent T;
    public final CharSequence U;
    public View.OnFocusChangeListener V;
    public View.OnClickListener W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f494a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f495b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public v0.b f496c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f497d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public CharSequence f498e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f499f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f500g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f501h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f502i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public CharSequence f503j0;
    public boolean k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f504l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public SearchableInfo f505m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Bundle f506n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final o2 f507o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final o2 f508p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final WeakHashMap f509q0;

    static {
        f fVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            f fVar2 = new f();
            fVar2.f282a = null;
            fVar2.f283b = null;
            fVar2.f284c = null;
            f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                fVar2.f282a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                fVar2.f283b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                fVar2.f284c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            fVar = fVar2;
        }
        f493r0 = fVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.A;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f500g0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.A;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f500g0 = false;
    }

    public int getImeOptions() {
        return this.A.getImeOptions();
    }

    public int getInputType() {
        return this.A.getInputType();
    }

    public int getMaxWidth() {
        return this.f501h0;
    }

    public CharSequence getQuery() {
        return this.A.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f498e0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f505m0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.U : getContext().getText(this.f505m0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.R;
    }

    public int getSuggestionRowLayout() {
        return this.Q;
    }

    public v0.b getSuggestionsAdapter() {
        return this.f496c0;
    }

    public final Intent j(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f503j0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f506n0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f505m0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f506n0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.A;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        f fVar = f493r0;
        fVar.getClass();
        f.a();
        Method method = fVar.f282a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        fVar.getClass();
        f.a();
        Method method2 = fVar.f283b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.A;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f494a0) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i) {
        int position;
        String strH;
        Cursor cursor = this.f496c0.f9108c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentJ = null;
            try {
                int i10 = x2.I;
                String strH2 = x2.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f505m0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = x2.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f505m0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = x2.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentJ = j(strH3 == null ? null : Uri.parse(strH3), strH2, x2.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), x2.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e4) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e4);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.A;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i) {
        Editable text = this.A.getText();
        Cursor cursor = this.f496c0.f9108c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.f496c0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // j.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.A;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f503j0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f504l0);
        this.k0 = false;
    }

    @Override // j.b
    public final void onActionViewExpanded() {
        if (this.k0) {
            return;
        }
        this.k0 = true;
        SearchAutoComplete searchAutoComplete = this.A;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f504l0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f507o0);
        post(this.f508p0);
        super.onDetachedFromWindow();
    }

    @Override // l.w1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        super.onLayout(z4, i, i10, i11, i12);
        if (z4) {
            SearchAutoComplete searchAutoComplete = this.A;
            int[] iArr = this.M;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.N;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i14;
            int height = searchAutoComplete.getHeight() + i13;
            Rect rect = this.K;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.L;
            rect2.set(i15, 0, i16, i17);
            v2 v2Var = this.J;
            if (v2Var == null) {
                v2 v2Var2 = new v2(rect2, rect, searchAutoComplete);
                this.J = v2Var2;
                setTouchDelegate(v2Var2);
            } else {
                v2Var.f6442b.set(rect2);
                Rect rect3 = v2Var.f6444d;
                rect3.set(rect2);
                int i18 = -v2Var.e;
                rect3.inset(i18, i18);
                v2Var.f6443c.set(rect);
            }
        }
    }

    @Override // l.w1, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        if (this.f495b0) {
            super.onMeasure(i, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.f501h0;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f501h0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.f501h0) > 0) {
            size = Math.min(i11, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof u2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u2 u2Var = (u2) parcelable;
        super.onRestoreInstanceState(u2Var.f10011a);
        w(u2Var.f6437c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        u2 u2Var = new u2(super.onSaveInstanceState());
        u2Var.f6437c = this.f495b0;
        return u2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        post(this.f507o0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.A;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f505m0 != null) {
            getContext().startActivity(j(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.A.getText());
        int i = (!zIsEmpty || (this.f494a0 && !this.k0)) ? 0 : 8;
        ImageView imageView = this.G;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f500g0 || !isFocusable()) {
            return false;
        }
        if (this.f495b0) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.A.requestFocus(i, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.A.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.C.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.D.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f506n0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.A;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.W;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.f494a0 == z4) {
            return;
        }
        this.f494a0 = z4;
        w(z4);
        t();
    }

    public void setImeOptions(int i) {
        this.A.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.A.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f501h0 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.V = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.W = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f498e0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f499f0 = z4;
        v0.b bVar = this.f496c0;
        if (bVar instanceof x2) {
            ((x2) bVar).A = z4 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z4;
        this.f505m0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.A;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f505m0.getImeOptions());
            int inputType = this.f505m0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f505m0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            v0.b bVar = this.f496c0;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f505m0.getSuggestAuthority() != null) {
                x2 x2Var = new x2(getContext(), this, this.f505m0, this.f509q0);
                this.f496c0 = x2Var;
                searchAutoComplete.setAdapter(x2Var);
                ((x2) this.f496c0).A = this.f499f0 ? 2 : 1;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.f505m0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f505m0.getVoiceSearchLaunchWebSearch()) {
                intent = this.S;
            } else if (this.f505m0.getVoiceSearchLaunchRecognizer()) {
                intent = this.T;
            }
            z4 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f502i0 = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.f495b0);
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f497d0 = z4;
        w(this.f495b0);
    }

    public void setSuggestionsAdapter(v0.b bVar) {
        this.f496c0 = bVar;
        this.A.setAdapter(bVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z4 = this.f494a0;
        SearchAutoComplete searchAutoComplete = this.A;
        CharSequence charSequence2 = charSequence;
        if (z4 && (drawable = this.P) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void u() {
        this.D.setVisibility(((this.f497d0 || this.f502i0) && !this.f495b0 && (this.F.getVisibility() == 0 || this.H.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z4) {
        boolean z10 = this.f497d0;
        this.F.setVisibility((!z10 || !(z10 || this.f502i0) || this.f495b0 || !hasFocus() || (!z4 && this.f502i0)) ? 8 : 0);
    }

    public final void w(boolean z4) {
        this.f495b0 = z4;
        int i = 8;
        int i10 = z4 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.A.getText());
        this.E.setVisibility(i10);
        v(!zIsEmpty);
        this.B.setVisibility(z4 ? 8 : 0);
        ImageView imageView = this.O;
        imageView.setVisibility((imageView.getDrawable() == null || this.f494a0) ? 8 : 0);
        r();
        if (this.f502i0 && !this.f495b0 && zIsEmpty) {
            this.F.setVisibility(8);
            i = 0;
        }
        this.H.setVisibility(i);
        u();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.K = new Rect();
        this.L = new Rect();
        this.M = new int[2];
        this.N = new int[2];
        this.f507o0 = new o2(this, 0);
        this.f508p0 = new o2(this, 1);
        this.f509q0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        q2 q2Var = new q2(this);
        u uVar = new u(this, 2);
        b0 b0Var = new b0(this, 3);
        z zVar = new z(this, 1);
        int[] iArr = f.a.f3569u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        l lVar = new l(context, typedArrayObtainStyledAttributes);
        v0.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.A = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.B = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.C = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.D = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.E = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.F = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.G = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.H = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.O = imageView5;
        d0.q(viewFindViewById, lVar.u(20));
        d0.q(viewFindViewById2, lVar.u(25));
        imageView.setImageDrawable(lVar.u(23));
        imageView2.setImageDrawable(lVar.u(15));
        imageView3.setImageDrawable(lVar.u(12));
        imageView4.setImageDrawable(lVar.u(28));
        imageView5.setImageDrawable(lVar.u(23));
        this.P = lVar.u(22);
        p3.a.s(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.Q = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.R = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(zVar);
        searchAutoComplete.setOnEditorActionListener(q2Var);
        searchAutoComplete.setOnItemClickListener(uVar);
        searchAutoComplete.setOnItemSelectedListener(b0Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new p2(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.U = typedArrayObtainStyledAttributes.getText(14);
        this.f498e0 = typedArrayObtainStyledAttributes.getText(21);
        int i10 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i10 != -1) {
            setImeOptions(i10);
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i11 != -1) {
            setInputType(i11);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        lVar.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.S = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.T = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.I = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new i8.a(this, 1));
        }
        w(this.f494a0);
        t();
    }

    /* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
    public static class SearchAutoComplete extends n {
        public int e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f510f;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f511r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final d f512s;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f512s = new d(this);
            this.e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i10 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            f fVar = SearchView.f493r0;
            fVar.getClass();
            f.a();
            Method method = fVar.f284c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // l.n, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f511r) {
                d dVar = this.f512s;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z4, int i, Rect rect) {
            super.onFocusChanged(z4, i, rect);
            SearchView searchView = this.f510f;
            searchView.w(searchView.f495b0);
            searchView.post(searchView.f507o0);
            if (searchView.A.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f510f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f510f.hasFocus() && getVisibility() == 0) {
                this.f511r = true;
                Context context = getContext();
                f fVar = SearchView.f493r0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f512s;
            if (!z4) {
                this.f511r = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f511r = true;
                    return;
                }
                this.f511r = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f510f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(r2 r2Var) {
    }

    public void setOnQueryTextListener(s2 s2Var) {
    }

    public void setOnSuggestionListener(t2 t2Var) {
    }
}
